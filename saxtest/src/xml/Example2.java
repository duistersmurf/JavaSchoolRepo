package xml;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;
public class Example2 extends DefaultHandler {
   // Local variables to store data
   // found in the XML document
   public  String  name       = "";
   public  String  location   = "";
   // Buffer for collecting data from // the "characters" SAX event.
   private CharArrayWriter contents = new CharArrayWriter();
   // Override methods of the DefaultHandler class
   // to gain notification of SAX Events.
   //
        // See org.xml.sax.ContentHandler for all available events.
   //
   public void startElement( String namespaceURI,
              String localName,
              String qName,
              Attributes attr ) throws SAXException {
      contents.reset();
   }
   public void endElement( String namespaceURI,
              String localName,
              String qName ) throws SAXException {
      if ( localName.equals( "name" ) ) {
         name = contents.toString();
      }
      if ( localName.equals( "location" ) ) {
         location = contents.toString();
      }
   }
   public void characters( char[] ch, int start, int length )
                  throws SAXException {
      contents.write( ch, start, length );
   }
   public static void main( String[] argv ){
      System.out.println( "Example2:" );
      try {
         // Create SAX 2 parser...
         XMLReader xr = XMLReaderFactory.createXMLReader();
         // Set the ContentHandler...
         Example2 ex2 = new Example2();
         xr.setContentHandler( ex2 );
         // Parse the file...
         xr.parse( new InputSource(
               new FileReader( "C:\\Users\\Ruwan\\workspace\\saxtest\\bin\\saxparser\\Example1.xml" )) );
         // Say hello...
         System.out.println( "Hello World from " + ex2.name
                              + " in " + ex2.location );
      }catch ( Exception e )  {
         e.printStackTrace();
      }
   }
}
