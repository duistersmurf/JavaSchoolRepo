package main;

import generate.BookshelfType;
import generate.BookshelfType.Books.Book;
import generate.CategoryType;
import generate.ObjectFactory;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {
	public static void main(String[] args) {
		 
		 try {
	 
			File file = new File("file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
	 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			JAXBElement<BookshelfType> bst = (JAXBElement) jaxbUnmarshaller.unmarshal(file);
			BookshelfType bt =bst.getValue();
			
			//Books book = (Books) jaxbUnmarshaller.unmarshal(file);
			
			
			for(Book b : bt.getBooks().getBook()){
				System.out.println(b.getTitle());
				System.out.println(b.getLanguage());
			}
			System.out.println("");
			for(CategoryType ct : bt.getCategories().getCategory() ){
				System.out.println(ct.getName());
			}
			
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	 
		}

}
