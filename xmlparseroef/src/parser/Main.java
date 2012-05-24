package parser;

import object.Book;
import object.Categorie;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
	
	 public static void main( String[] argv ){
		 System.out.println( "Example1:" );
	      try {
	         // Create SAX 2 parser...
	         XMLReader xr = XMLReaderFactory.createXMLReader();
	         // Set the ContentHandler...
	         Xmlparsers ex1 = new Xmlparsers();
	         xr.setContentHandler( ex1 );
	         System.out.println();
	         System.out.println("Tag paths located:");
	         // Parse the file...
	        // xr.parse( new InputSource(new FileReader( "C:\\Users\\Ruwan\\workspace_school\\JavaSchoolRepo\\xmlparseroef\\src\\parser\\bookshelf2.xml" )) );
	         xr.parse( new InputSource(new FileReader( "C:\\Users\\Duistersmurf\\schoolworkspace\\JavaSchoolRepo\\xmlparseroef\\bin\\parser\\bookshelf2.xml" )) );
	         System.out.println();
	         System.out.println("Names located:");
	         // Display Customer
	         System.out.println( "book titles: " );
	         String booktitles;
	         Vector books = ex1.getBook();
	         Enumeration e = books.elements();
	         while( e.hasMoreElements()){
	                   booktitles = (String) e.nextElement();
	            System.out.println( booktitles );
	         }
	         System.out.println();
	         // Display all item names to stdout...
	         String categorietitles;
	         Vector categories = ex1.getCategorie();
	         Enumeration e1 = categories.elements();
	         while( e1.hasMoreElements()){
	        	 categorietitles = (String) e1.nextElement();
	            System.out.println( categorietitles );
	         }	        
	      }catch ( Exception e )  {
	         e.printStackTrace();
	      }
	   }

}
