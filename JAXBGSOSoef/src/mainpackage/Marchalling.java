package mainpackage;

public class Marchalling {
	
	Marshaller marshaller = null;
	//de package die je bij je generator hebt opgegeven!!!
	JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
	marshaller = jaxbContext.createMarshaller();
	MijnDing ding = mijnDingFactory.createMijnDing();
	ByteArrayOutputStream bin = new ByteArrayOutputStream();
	marshaller.marshal(ding, bin);
	String jaxbMessage = bin.toString(this.encoding);

}
