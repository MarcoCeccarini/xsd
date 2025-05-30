import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


public class Dac1XmlManager {

	Schema schema;

	public class Dac1SchemaFactory{

		public Schema getSchema(String mainXsd) throws Exception {

			try {
				// carico schema
				SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
				return schemaFactory.newSchema(
						new Source[] { 
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("commontypes_statistics.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("commontypes_v2.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("directtax_v4.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("isotypes_v2.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("oecdtypes_v2.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("sdbody_v4.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("sdtypes_v4.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("specifictypes_v2.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("stfmodifiedtypes_v4.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream("stftypes-2.0.xsd")),
								new StreamSource(Dac1SchemaFactory.class.getResourceAsStream(mainXsd)),
						});
			} catch (Exception e) {
				throw e;
			}
		}

	}
	
	
	public static void main(String[] args) {
		
		try {
			Dac1XmlManager thiz = new Dac1XmlManager();
			
			 Schema s = thiz.new Dac1SchemaFactory().getSchema("DAC1_IPS.xsd");
			 
			 
			 System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
