

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Unmarshalling {
	
	public static void main(String[] args) {
		 
		 try {
	 
			File file = new File("C:\\Users\\Duistersmurf\\Desktop\\bookshelf.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Book customer = (Book) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
	 
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	 
		}

	/*//de package die je bij je generator hebt opgegeven!!!
	JAXBContext jaxbContext = JAXBContext.newInstance("mainpackage.book");
	Unmarshaller um  = jaxbContext.createUnmarshaller();
	Book b = (Book) jaxbContext.um( new FileInputStream( "myfile.xml" ) );*/
}