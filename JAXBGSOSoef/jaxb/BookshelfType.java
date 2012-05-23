/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Beschrijft de boekenplank
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class BookshelfType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _categories.
     */
    private Categories _categories;

    /**
     * Field _books.
     */
    private Books _books;


      //----------------/
     //- Constructors -/
    //----------------/

    public BookshelfType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'books'.
     * 
     * @return the value of field 'Books'.
     */
    public Books getBooks(
    ) {
        return this._books;
    }

    /**
     * Returns the value of field 'categories'.
     * 
     * @return the value of field 'Categories'.
     */
    public Categories getCategories(
    ) {
        return this._categories;
    }

    /**
     * Sets the value of field 'books'.
     * 
     * @param books the value of field 'books'.
     */
    public void setBooks(
            final Books books) {
        this._books = books;
    }

    /**
     * Sets the value of field 'categories'.
     * 
     * @param categories the value of field 'categories'.
     */
    public void setCategories(
            final Categories categories) {
        this._categories = categories;
    }

}
