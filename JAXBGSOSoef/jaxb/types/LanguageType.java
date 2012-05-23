/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package types;

/**
 * Enumeration LanguageType.
 * 
 * @version $Revision$ $Date$
 */
public enum LanguageType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ENGLISH
     */
    ENGLISH("English"),
    /**
     * Constant NEDERLANDS
     */
    NEDERLANDS("Nederlands");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, LanguageType> enumConstants = new java.util.HashMap<java.lang.String, LanguageType>();


    static {
        for (LanguageType c: LanguageType.values()) {
            LanguageType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private LanguageType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static types.LanguageType fromValue(
            final java.lang.String value) {
        LanguageType c = LanguageType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
