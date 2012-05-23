package parser;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

import object.*;

public class Main {
	
	 public static void main( String[] argv ){
	      System.out.println( "Example3:" );
	      try {
	         // Create SAX 2 parser...
	         XMLReader xr = XMLReaderFactory.createXMLReader();
	         // Set the ContentHandler...
	         Xmlparsers ex3 = new Xmlparsers();
	         xr.setContentHandler( ex3 );
	         // Parse the file...
	         xr.parse( new InputSource(new FileReader( "C:\\Users\\Ruwan\\workspace_school\\JavaSchoolRepo\\xmlparseroef\\src\\parser\\bookshelf2.xml" )) );
	         Book b;
	         Vector item = ex3.getBook();
	         Enumeration e = item.elements();
	         while( e.hasMoreElements()){
                 b = (Book) e.nextElement();
                 b.print( System.out );
	         }	
	        /* Categorie c;
	         Vector item1 = ex3.getCategorie();
	         Enumeration d = item1.elements();
	         while( d.hasMoreElements()){
                 c = (Categorie) d.nextElement();
                 c.print( System.out );
	         }*/
	      }catch ( Exception e )  {
	         e.printStackTrace();
	      }
	   }

}
