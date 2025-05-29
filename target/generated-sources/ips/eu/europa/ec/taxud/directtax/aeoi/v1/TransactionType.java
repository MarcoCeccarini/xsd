//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Transaction_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Transaction_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Construction"/&gt;
 *     &lt;enumeration value="Sale"/&gt;
 *     &lt;enumeration value="Expropriation"/&gt;
 *     &lt;enumeration value="InheritanceFromPartner"/&gt;
 *     &lt;enumeration value="InheritanceFromOther"/&gt;
 *     &lt;enumeration value="Divorce"/&gt;
 *     &lt;enumeration value="Gift"/&gt;
 *     &lt;enumeration value="Merge"/&gt;
 *     &lt;enumeration value="Division"/&gt;
 *     &lt;enumeration value="RightCreation"/&gt;
 *     &lt;enumeration value="RightExtension"/&gt;
 *     &lt;enumeration value="RightExtinction"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Transaction_Type")
@XmlEnum
public enum TransactionType {


    /**
     * Construction
     * 
     */
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction"),

    /**
     * Sale
     * 
     */
    @XmlEnumValue("Sale")
    SALE("Sale"),

    /**
     * Expropriation
     * 
     */
    @XmlEnumValue("Expropriation")
    EXPROPRIATION("Expropriation"),

    /**
     * Inheritance from Partner
     * 
     */
    @XmlEnumValue("InheritanceFromPartner")
    INHERITANCE_FROM_PARTNER("InheritanceFromPartner"),

    /**
     * Inheritance from Other
     * 
     */
    @XmlEnumValue("InheritanceFromOther")
    INHERITANCE_FROM_OTHER("InheritanceFromOther"),

    /**
     * Divorce
     * 
     */
    @XmlEnumValue("Divorce")
    DIVORCE("Divorce"),

    /**
     * Gift
     * 
     */
    @XmlEnumValue("Gift")
    GIFT("Gift"),

    /**
     * Merge
     * 
     */
    @XmlEnumValue("Merge")
    MERGE("Merge"),

    /**
     * Division
     * 
     */
    @XmlEnumValue("Division")
    DIVISION("Division"),

    /**
     * Right Creation
     * 
     */
    @XmlEnumValue("RightCreation")
    RIGHT_CREATION("RightCreation"),

    /**
     * Right Extension
     * 
     */
    @XmlEnumValue("RightExtension")
    RIGHT_EXTENSION("RightExtension"),

    /**
     * Right Extinction
     * 
     */
    @XmlEnumValue("RightExtinction")
    RIGHT_EXTINCTION("RightExtinction"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
