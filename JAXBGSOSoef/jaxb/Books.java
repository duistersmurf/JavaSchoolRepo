/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class Books.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Books implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _bookList.
     */
    private java.util.Vector<Book> _bookList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Books() {
        super();
        this._bookList = new java.util.Vector<Book>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBook
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBook(
            final Book vBook)
    throws java.lang.IndexOutOfBoundsException {
        this._bookList.addElement(vBook);
    }

    /**
     * 
     * 
     * @param index
     * @param vBook
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBook(
            final int index,
            final Book vBook)
    throws java.lang.IndexOutOfBoundsException {
        this._bookList.add(index, vBook);
    }

    /**
     * Method enumerateBook.
     * 
     * @return an Enumeration over all Book elements
     */
    public java.util.Enumeration<? extends Book> enumerateBook(
    ) {
        return this._bookList.elements();
    }

    /**
     * Method getBook.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Book at the given index
     */
    public Book getBook(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bookList.size()) {
            throw new IndexOutOfBoundsException("getBook: Index value '" + index + "' not in range [0.." + (this._bookList.size() - 1) + "]");
        }

        return (Book) _bookList.get(index);
    }

    /**
     * Method getBook.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Book[] getBook(
    ) {
        Book[] array = new Book[0];
        return (Book[]) this._bookList.toArray(array);
    }

    /**
     * Method getBookCount.
     * 
     * @return the size of this collection
     */
    public int getBookCount(
    ) {
        return this._bookList.size();
    }

    /**
     */
    public void removeAllBook(
    ) {
        this._bookList.clear();
    }

    /**
     * Method removeBook.
     * 
     * @param vBook
     * @return true if the object was removed from the collection.
     */
    public boolean removeBook(
            final Book vBook) {
        boolean removed = _bookList.remove(vBook);
        return removed;
    }

    /**
     * Method removeBookAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Book removeBookAt(
            final int index) {
        java.lang.Object obj = this._bookList.remove(index);
        return (Book) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBook
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBook(
            final int index,
            final Book vBook)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bookList.size()) {
            throw new IndexOutOfBoundsException("setBook: Index value '" + index + "' not in range [0.." + (this._bookList.size() - 1) + "]");
        }

        this._bookList.set(index, vBook);
    }

    /**
     * 
     * 
     * @param vBookArray
     */
    public void setBook(
            final Book[] vBookArray) {
        //-- copy array
        _bookList.clear();

        for (int i = 0; i < vBookArray.length; i++) {
                this._bookList.add(vBookArray[i]);
        }
    }

}
