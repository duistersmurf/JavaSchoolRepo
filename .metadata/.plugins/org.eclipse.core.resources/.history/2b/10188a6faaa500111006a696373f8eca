package parser;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;
import object.*;

public class Xmlparsers extends DefaultHandler {
   
	private Vector categorie = new Vector();
	private  Vector book = new Vector();
	private Book currentBook;
	private Categorie currentCategorie;
	private String books;
	private String categories;
	private CharArrayWriter contents = new CharArrayWriter();
	private Stack tagStack = new Stack();
   
	public void startElement( String namespaceURI, String localName, String qName, Attributes attr ) throws SAXException {
		contents.reset();
		tagStack.push( localName );
		System.out.println( "path found: [" + getTagPath() + "]" );
		/*if (localName.equals("category")){
			//currentCategorie = new Categorie();
			//currentCategorie.id = attr.getValue( "id" );
		//	categorie.addElement( currentCategorie);
		}*/
		if ( localName.equals( "book" ) ) {
			currentBook = new Book();
			book.addElement( currentBook );
		}
   }
   public void endElement( String namespaceURI,String localName,String qName ) throws SAXException {
	   if ( getTagPath().equals( "books/book/title" ) ) {
	         books = contents.toString().trim();
	      }
	      else if ( getTagPath().equals( "categories/category/title" ) ) {
	    	  currentCategorie.addElement( contents.toString().trim() );
	      }
	      // clean up the stack...
	      tagStack.pop();
	//  if( localName.equals("name")){ 
	//	  currentCategorie.name = contents.toString();
	//  }
      if ( localName.equals( "title" ) ) {
        	 currentBook.title = contents.toString();
      }
      if ( localName.equals( "subTitle" ) ) {
    	  currentBook.subTitle = contents.toString();
      }
      if ( localName.equals( "isbn10" ) ) {
    	  currentBook.isbn10 = contents.toString();
      }
      if ( localName.equals( "isbn13" ) ) {
    	  currentBook.isbn13 = contents.toString();
       }
      if ( localName.equals( "language" ) ) {
    	  currentBook.language = contents.toString();
       }
      if ( localName.equals( "paperback" ) ) {
    	  currentBook.paperback = contents.toString();
       }
      if ( localName.equals( "pageCount" ) ) {
    	  currentBook.pageCount = contents.toString();
       }
      if ( localName.equals( "publisher" ) ) {
    	  currentBook.publisher = contents.toString();
       }
   }
   public void characters( char[] ch, int start, int length ) throws SAXException {
      contents.write( ch, start, length );
   }
   private String getTagPath( ){
	      //  build the path string...
	      String buffer = "";
	      Enumeration e = tagStack.elements();
	      while( e.hasMoreElements()){
	               buffer  = buffer + "/" + (String) e.nextElement();
	      }
	      return buffer;
	   }
	   public Vector getCategorie() {
	           return items;
	   }
	   public String getBook() {
	         return customer;
	   }
}