import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.xml.XMLConstants;
import javax.xml.catalog.CatalogFeatures;
import javax.xml.catalog.CatalogManager;
import javax.xml.catalog.CatalogResolver;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Advanced XML Validator
 * 
 * This class validates an XML file against an XSD schema and its imported schemas
 * using XML Catalog to resolve schema locations.
 */
public class AdvancedXmlValidator {

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
     * Validates an XML file against an XSD schema with all its imported schemas
     * 
     * @param xmlFilePath Path to the XML file
     * @param xsdFilePath Path to the XSD schema file
     * @return true if validation succeeds, false otherwise
     */
    public static boolean validate(String xmlFilePath, String xsdFilePath) {
        try {
            // Create SchemaFactory
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            // Set up LSResourceResolver to resolve imported schemas
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "file,http,https");
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "file,http,https");
            
            // Get the directory of the main XSD file to resolve relative imports
            File xsdFile = new File(xsdFilePath);
            final String baseDir = xsdFile.getParent();
            
            // Create a custom resolver to handle schema imports
            factory.setResourceResolver((type, namespaceURI, publicId, systemId, baseURI) -> {
                System.out.println("Resolving: " + systemId);
                
                if (systemId != null) {
                    try {
                        // Try to resolve relative to the base directory
                        File importedSchema = new File(baseDir, systemId);
                        if (importedSchema.exists()) {
                            System.out.println("Found schema: " + importedSchema.getAbsolutePath());
                            return new InputSource(importedSchema.toURI().toString());
                        }
                    } catch (Exception e) {
                        System.err.println("Error resolving schema: " + e.getMessage());
                    }
                }
                return null;
            });
            
            // Load the XSD schema
            Schema schema = factory.newSchema(new StreamSource(xsdFile));
            
            // Create validator
            Validator validator = schema.newValidator();
            
            // Set up custom error handler
            ValidationErrorHandler errorHandler = new ValidationErrorHandler();
            validator.setErrorHandler(errorHandler);
            
            // Validate the XML file against the schema
            Source source = new StreamSource(new File(xmlFilePath));
            validator.validate(source);
            
            if (errorHandler.hasErrors()) {
                System.err.println("Validation failed with the following errors:");
                System.err.println(errorHandler.getErrorMessages());
                return false;
            } else {
                System.out.println("XML validation successful!");
                return true;
            }
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