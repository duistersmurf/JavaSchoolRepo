package object;

import java.io.PrintStream;
import java.util.ArrayList;

public class Book {

	public String title = "";
	public String subTitle = "";
	public String isbn10 = "";
	public String isbn13 = "";
	public String language = "";
	public String paperback = "";
	public String pageCount  = "";
	public String publisher = "";
	//image><![CDATA[./books/978-0-471-77777-9.jpg]]></image>
	public ArrayList<Categorie> categories = new ArrayList<Categorie>();
	public void print( PrintStream out ) {
        out.println( "Book: " );
        out.println( "  title -> "  + title );
        out.println( "  subtitle -> "   + subTitle  );
        out.println( "  isbn10 -> " + isbn10    );
        out.println( "  isbn13 -> " + isbn13    );
        out.println( "  language -> " + language    );
        out.println( "  paperback -> " + paperback    );
        out.println( "  pagecount -> " + pageCount    );
        out.println( "  publisher -> " + publisher    );
}
}
