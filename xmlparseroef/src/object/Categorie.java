package object;

import java.io.PrintStream;

public class Categorie {

	public String title = "";
	public String subTitle = "";
	
	public void print( PrintStream out ) {
        out.println( "Categorie: " );
        out.println( "  title -> "  + title );
        out.println( "  subtitle -> "   + subTitle  );

}
}
