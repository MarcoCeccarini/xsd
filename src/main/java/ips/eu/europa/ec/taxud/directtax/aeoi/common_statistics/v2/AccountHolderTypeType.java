//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AccountHolderType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountHolderType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRS101"/&gt;
 *     &lt;enumeration value="CRS102"/&gt;
 *     &lt;enumeration value="CRS103"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountHolderType_Type")
@XmlEnum
public enum AccountHolderTypeType {


    /**
     * Passive Non-Financial Entity with one or more controlling person that is a Reportable Person
     * 
     */
    @XmlEnumValue("CRS101")
    CRS_101("CRS101"),

    /**
     * CRS Reportable Person
     * 
     */
    @XmlEnumValue("CRS102")
    CRS_102("CRS102"),

    /**
     * Passive NFE that is a CRS Reportable Person
     * 
     */
    @XmlEnumValue("CRS103")
    CRS_103("CRS103"),

    /**
     * The account holder is a natural person and the AccountHolderType is not provided in the message as per OECD CRS schema
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    AccountHolderTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHolderTypeType fromValue(String v) {
        for (AccountHolderTypeType c: AccountHolderTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
