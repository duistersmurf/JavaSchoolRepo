package mainpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Unmarshalling {
	
	//de package die je bij je generator hebt opgegeven!!!
	JAXBContext jaxbContext = JAXBContext.newInstance("mainpackage.book");
	Unmarshaller um  = jaxbContext.createUnmarshaller();
	Book b = (Book) jaxbContext.um( new FileInputStream( "myfile.xml" ) );
}
