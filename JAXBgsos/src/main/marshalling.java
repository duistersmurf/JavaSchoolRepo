package main;

import generate.BookshelfType;
import generate.BookshelfType.Books;
import generate.BookshelfType.Books.Book;
import generate.BookshelfType.Categories;
import generate.CategoryType;
import generate.LanguageType;
import generate.ObjectFactory;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class marshalling {

	public static void main(String[] arg){

		ObjectFactory of = new ObjectFactory(); 

		BookshelfType bs = of.createBookshelfType();  
		Books books = of.createBookshelfTypeBooks(); 
		
		bs.setBooks(books); 
		List<Book> bookList = books.getBook(); 
		
		Book b = of.createBookshelfTypeBooksBook();  
		 
		b.setTitle("Test"); 
		b.setIsbn10(new BigInteger("1235467184")); 
		b.setLanguage(LanguageType.NEDERLANDS); 
		b.setPageCount(new BigInteger("200")); 
		b.setPublisher("Donno"); 
		b.setImage("Afbeelding 15");  
		b.setIsbn13("978-1234567890");
		bookList.add(b); 
		  
		Categories catList = of.createBookshelfTypeCategories(); 
		CategoryType ct = of.createCategoryType(); 
		ct.setName("TestCategory"); 
		catList.getCategory().add(ct); 
		bs.setCategories(catList);
		try {

			File file = new File("C:\\Users\\Ruwan\\workspace_school\\JavaSchoolRepo\\JAXBgsos\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			Schema sf = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema( new File("books.xsd"));  
			jaxbMarshaller.setSchema(sf);

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(bs, file);
			jaxbMarshaller.marshal(bs, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	
 catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
