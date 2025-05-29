import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * DAC1 XML Validator
 * 
 * This program validates the 23.xml file against the DAC1_IPS.xsd schema and its related imported schemas.
 * It uses a custom resource resolver to handle schema imports and includes.
 */
public class Dac1XmlValidator {

    /**
     * Implementation of LSInput interface to provide schema content
     */
    private static class SchemaInput implements LSInput {
        private String publicId;
        private String systemId;
        private String baseURI;
        private InputStream byteStream;
        private String encoding;
        private boolean certifiedText;

        public SchemaInput(String publicId, String systemId, String baseURI, InputStream byteStream) {
            this.publicId = publicId;
            this.systemId = systemId;
            this.baseURI = baseURI;
            this.byteStream = byteStream;
        }

        @Override
        public String getPublicId() {
            return publicId;
        }

        @Override
        public void setPublicId(String publicId) {
            this.publicId = publicId;
        }

        @Override
        public String getSystemId() {
            return systemId;
        }

        @Override
        public void setSystemId(String systemId) {
            this.systemId = systemId;
        }

        @Override
        public String getBaseURI() {
            return baseURI;
        }

        @Override
        public void setBaseURI(String baseURI) {
            this.baseURI = baseURI;
        }

        @Override
        public InputStream getByteStream() {
            return byteStream;
        }

        @Override
        public void setByteStream(InputStream byteStream) {
            this.byteStream = byteStream;
        }

        @Override
        public Reader getCharacterStream() {
            return null;
        }

        @Override
        public void setCharacterStream(Reader characterStream) {
            // Not used in this implementation
        }

        @Override
        public String getStringData() {
            return null;
        }

        @Override
        public void setStringData(String stringData) {
            // Not used in this implementation
        }

        @Override
        public String getEncoding() {
            return encoding;
        }

        @Override
        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        @Override
        public boolean getCertifiedText() {
            return certifiedText;
        }

        @Override
        public void setCertifiedText(boolean certifiedText) {
            this.certifiedText = certifiedText;
        }
    }

    /**
     * Custom resource resolver to handle schema imports and includes
     */
    private static class SchemaResourceResolver implements LSResourceResolver {
        private final String resourcesDir;
        private final Map<String, File> schemaCache = new HashMap<>();

        public SchemaResourceResolver(String resourcesDir) {
            this.resourcesDir = resourcesDir;
            // Pre-cache all XSD files in the resources directory
            cacheSchemaFiles(new File(resourcesDir));
        }

        private void cacheSchemaFiles(File directory) {
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile() && file.getName().toLowerCase().endsWith(".xsd")) {
                            // Store by filename for easy lookup
                            schemaCache.put(file.getName().toLowerCase(), file);
                            System.out.println("Cached schema: " + file.getName() + " -> " + file.getAbsolutePath());
                        } else if (file.isDirectory()) {
                            cacheSchemaFiles(file);
                        }
                    }
                }
            }
        }

        @Override
        public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
            System.out.println("Resolving resource: " + systemId);
            System.out.println("  Type: " + type);
            System.out.println("  Namespace: " + namespaceURI);
            System.out.println("  Base URI: " + baseURI);

            if (systemId != null) {
                try {
                    // Extract the filename from the systemId
                    String fileName = new File(systemId).getName().toLowerCase();
                    
                    // First try to find the file in our cache
                    File schemaFile = schemaCache.get(fileName);
                    
                    // If not in cache, try to find it directly
                    if (schemaFile == null) {
                        schemaFile = new File(resourcesDir, systemId);
                        if (schemaFile.exists()) {
                            schemaCache.put(fileName, schemaFile);
                        } else {
                            // Try just the filename
                            schemaFile = new File(resourcesDir, fileName);
                            if (schemaFile.exists()) {
                                schemaCache.put(fileName, schemaFile);
                            }
                        }
                    }
                    
                    if (schemaFile != null && schemaFile.exists()) {
                        System.out.println("Found schema: " + schemaFile.getAbsolutePath());
                        InputStream inputStream = new FileInputStream(schemaFile);
                        return new SchemaInput(publicId, schemaFile.toURI().toString(), baseURI, inputStream);
                    }
                } catch (Exception e) {
                    System.err.println("Error resolving schema: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            
            System.out.println("Could not resolve schema: " + systemId);
            return null;
        }
    }

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
     * Validates an XML file against an XSD schema and its related schemas
     * 
     * @param xmlFilePath Path to the XML file to validate
     * @param xsdFilePath Path to the main XSD schema file
     * @param resourcesDir Directory containing all related XSD files
     * @return true if validation succeeds, false otherwise
     */
    public static boolean validate(String xmlFilePath, String xsdFilePath, String resourcesDir) {
        try {
            // Create SchemaFactory
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            // Allow access to external schemas
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "file,http,https");
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "file,http,https");
            
            // Set up custom resource resolver
            factory.setResourceResolver(new SchemaResourceResolver(resourcesDir));
            
            // Load the XSD schema
            File schemaFile = new File(xsdFilePath);
            Schema schema = factory.newSchema(new StreamSource(schemaFile));
            
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
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Main method to run the validator
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Define paths
        String resourcesDir = "c:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources";
        String xmlFilePath = resourcesDir + "/23.xml";
        String xsdFilePath = resourcesDir + "/DAC1_IPS.xsd";
        
        System.out.println("DAC1 XML Validator");
        System.out.println("=================");
        System.out.println("XML file: " + xmlFilePath);
        System.out.println("XSD schema: " + xsdFilePath);
        System.out.println("Resources directory: " + resourcesDir);
        System.out.println();
        
        // Validate the XML file
        boolean isValid = validate(xmlFilePath, xsdFilePath, resourcesDir);
        
        if (isValid) {
            System.out.println("\nVALIDATION SUCCESSFUL: The XML file is valid according to the schema.");
        } else {
            System.out.println("\nVALIDATION FAILED: The XML file does not conform to the schema.");
        }
    }
}