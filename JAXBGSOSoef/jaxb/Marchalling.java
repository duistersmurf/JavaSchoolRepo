

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marchalling {
	
	public static void main(String[] args) {
		 
		  Book b = new Book();
		  b.setPageCount(100);
		  b.setTitle("mkyong");
	 
		  try {
	 
			File file = new File("C:\\Users\\Duistersmurf\\Desktop\\bookshelf.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
			jaxbMarshaller.marshal(b, file);
			jaxbMarshaller.marshal(b, System.out);
	 
		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
	 
		}
	}

	/*Marshaller marshaller = null;
	//de package die je bij je generator hebt opgegeven!!!
	JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
	marshaller = jaxbContext.createMarshaller();
	MijnDing ding = mijnDingFactory.createMijnDing();
	ByteArrayOutputStream bin = new ByteArrayOutputStream();
	marshaller.marshal(ding, bin);
	String jaxbMessage = bin.toString(this.encoding);*/
