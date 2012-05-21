package saxparser;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;
public class Example1 extends DefaultHandler {
   // Override methods of the DefaultHandler class
   // to gain notification of SAX Events.
   //
        // See org.xml.sax.ContentHandler for all available events.
   //
   public void startDocument( ) throws SAXException {
      System.out.println( "SAX Event: START DOCUMENT" );
   }
   public void endDocument( ) throws SAXException {
      System.out.println( "SAX Event: END DOCUMENT" );
   }
   public void startElement( String namespaceURI,
              String localName,
              String qName,
              Attributes attr ) throws SAXException {
         System.out.println( "SAX Event: START ELEMENT[ " +
                  localName + " ]" );
      // Also, let's print the attributes if
      // there are any...
                for ( int i = 0; i < attr.getLength(); i++ ){
                   System.out.println( "   ATTRIBUTE: " +
                  attr.getLocalName(i) +
                  " VALUE: " +
                  attr.getValue(i) );
      }
   }
   public void endElement( String namespaceURI,
              String localName,
              String qName ) throws SAXException {
      System.out.println( "SAX Event: END ELEMENT[ " +
                  localName + " ]" );
   }
   public void characters( char[] ch, int start, int length )
                  throws SAXException {
      System.out.print( "SAX Event: CHARACTERS[ " );
      try {
         OutputStreamWriter outw = new OutputStreamWriter(System.out);
         outw.write( ch, start,length );
         outw.flush();
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println( " ]" );
   }
   public static void main( String[] argv ){
      System.out.println( "Example1 SAX Events:" );
      try {
         // Create SAX 2 parser...
         XMLReader xr = XMLReaderFactory.createXMLReader();
         // Set the ContentHandler...
         xr.setContentHandler( new Example1() );
            // Parse the file...
         xr.parse( new InputSource(
               new FileReader( "C:\\Users\\Ruwan\\workspace\\saxtest\\bin\\saxparser\\Example1.xml" )) );
      }catch ( Exception e )  {
         e.printStackTrace();
      }
   }
}
