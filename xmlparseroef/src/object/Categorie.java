package object;

import java.io.PrintStream;

public class Categorie {

	public String id;
	public String name;
	
	public void print( PrintStream out ) {
        out.println( "Categorie: " );
        out.println( "  id -> "  + id );
        out.println( "  name -> "   + name  );

}
}
