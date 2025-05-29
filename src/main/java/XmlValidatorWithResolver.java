import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * XML Validator with Custom Entity Resolver
 * 
 * This class validates an XML file against an XSD schema and its imported schemas
 * using a custom entity resolver to handle schema imports.
 */
public class XmlValidatorWithResolver {

    /**
     * Custom error handler to collect validation errors
     */
    private static class ValidationErrorHandler implements ErrorHandler {
        private boolean hasErrors = false;
        private StringBuilder errorMessages = new StringBuilder();

        @Override
        public void warning(SAXParseException exception) throws SAXException {
            logIssue("Warning", exception);
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            hasErrors = true;
            logIssue("Error", exception);
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {
            hasErrors = true;
            logIssue("Fatal Error", exception);
        }

        private void logIssue(String type, SAXParseException exception) {
            errorMessages.append(type)
                    .append(" at line ").append(exception.getLineNumber())
                    .append(", column ").append(exception.getColumnNumber())
                    .append(": ").append(exception.getMessage())
                    .append("\n");
        }

        public boolean hasErrors() {
            return hasErrors;
        }

        public String getErrorMessages() {
            return errorMessages.toString();
        }
    }

    /**
     * Custom entity resolver to handle schema imports
     */
    private static class ResourceEntityResolver implements EntityResolver {
        private final String baseDir;

        public ResourceEntityResolver(String baseDir) {
            this.baseDir = baseDir;
        }

        @Override
        public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
            if (systemId != null) {
                System.out.println("Resolving entity: " + systemId);
                
                // Extract the filename from the systemId
                String fileName = new File(systemId).getName();
                
                // Try to find the file in the resources directory
                File schemaFile = new File(baseDir, fileName);
                if (schemaFile.exists()) {
                    System.out.println("Found schema: " + schemaFile.getAbsolutePath());
                    return new InputSource(schemaFile.toURI().toString());
                }
            }
            
            // If not found, let the parser use the default resolution
            return null;
        }
    }

    /**
     * Validates an XML file against an XSD schema with all its imported schemas
     * 
     * @param xmlFilePath Path to the XML file
     * @param xsdFilePath Path to the XSD schema file
     * @return true if validation succeeds, false otherwise
     */
    public static boolean validate(String xmlFilePath, String xsdFilePath) {
        try {
            // Get the directory of the main XSD file to resolve relative imports
            File xsdFile = new File(xsdFilePath);
            final String baseDir = xsdFile.getParent();
            
            // Parse the XML document with entity resolver
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder builder = dbf.newDocumentBuilder();
            builder.setEntityResolver(new ResourceEntityResolver(baseDir));
            Document document = builder.parse(new File(xmlFilePath));
            
            // Create SchemaFactory
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            // Set up resource resolver for schema imports
            factory.setResourceResolver(new LSResourceResolver() {
                @Override
                public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
                    if (systemId != null) {
                        System.out.println("Resolving schema: " + systemId);
                        
                        // Extract the filename from the systemId
                        String fileName = new File(systemId).getName();
                        
                        // Try to find the file in the resources directory
                        File schemaFile = new File(baseDir, fileName);
                        if (schemaFile.exists()) {
                            System.out.println("Found schema: " + schemaFile.getAbsolutePath());
                            
                            // Create a custom LSInput implementation
                            return new LSInput() {
                                @Override
                                public String getPublicId() {
                                    return publicId;
                                }
                                
                                @Override
                                public void setPublicId(String publicId) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public String getSystemId() {
                                    return schemaFile.toURI().toString();
                                }
                                
                                @Override
                                public void setSystemId(String systemId) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public String getBaseURI() {
                                    return baseURI;
                                }
                                
                                @Override
                                public void setBaseURI(String baseURI) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public InputStream getByteStream() {
                                    try {
                                        return new FileInputStream(schemaFile);
                                    } catch (IOException e) {
                                        System.err.println("Error opening schema file: " + e.getMessage());
                                        return null;
                                    }
                                }
                                
                                @Override
                                public void setByteStream(InputStream byteStream) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public Reader getCharacterStream() {
                                    return null;
                                }
                                
                                @Override
                                public void setCharacterStream(Reader characterStream) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public String getStringData() {
                                    return null;
                                }
                                
                                @Override
                                public void setStringData(String stringData) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public String getEncoding() {
                                    return null;
                                }
                                
                                @Override
                                public void setEncoding(String encoding) {
                                    // Not needed for this implementation
                                }
                                
                                @Override
                                public boolean getCertifiedText() {
                                    return false;
                                }
                                
                                @Override
                                public void setCertifiedText(boolean certifiedText) {
                                    // Not needed for this implementation
                                }
                            };
                        }
                    }
                    return null;
                }
            });
            
            // Load the XSD schema
            Schema schema = factory.newSchema(new StreamSource(xsdFile));
            
            // Create validator
            Validator validator = schema.newValidator();
            
            // Set up custom error handler
            ValidationErrorHandler errorHandler = new ValidationErrorHandler();
            validator.setErrorHandler(errorHandler);
            
            // Validate the XML document against the schema
            validator.validate(new DOMSource(document));
            
            if (errorHandler.hasErrors()) {
                System.err.println("Validation failed with the following errors:");
                System.err.println(errorHandler.getErrorMessages());
                return false;
            } else {
                System.out.println("XML validation successful!");
                return true;
            }
        } catch (ParserConfigurationException e) {
            System.err.println("Parser configuration error: " + e.getMessage());
            return false;
        } catch (SAXException e) {
            System.err.println("Schema error: " + e.getMessage());
            return false;
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            return false;
        }
    }

    /**
     * Main method to run the validator
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Validate 23.xml against DAC1_IPS.xsd
        String xmlFilePath = "c:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/23.xml";
        String xsdFilePath = "c:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/DAC1_IPS.xsd";
        
        System.out.println("Validating XML file: " + xmlFilePath);
        System.out.println("Against XSD schema: " + xsdFilePath);
        System.out.println("Including all imported schemas");
        
        boolean isValid = validate(xmlFilePath, xsdFilePath);
        
        if (isValid) {
            System.out.println("Validation successful: The XML file is valid according to the schema.");
        } else {
            System.out.println("Validation failed: The XML file does not conform to the schema.");
        }
    }
}