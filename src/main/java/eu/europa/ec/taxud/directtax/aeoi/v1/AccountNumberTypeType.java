//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AccountNumberType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountNumberType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OECD601"/&gt;
 *     &lt;enumeration value="OECD602"/&gt;
 *     &lt;enumeration value="OECD603"/&gt;
 *     &lt;enumeration value="OECD604"/&gt;
 *     &lt;enumeration value="OECD605"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountNumberType_Type")
@XmlEnum
public enum AccountNumberTypeType {


    /**
     * IBAN International Bank Account Number (follows a known structure)
     * 
     */
    @XmlEnumValue("OECD601")
    OECD_601("OECD601"),

    /**
     * OBAN Other Bank Account Number
     * 
     */
    @XmlEnumValue("OECD602")
    OECD_602("OECD602"),

    /**
     * ISIN International Securities Information Number (follows a known structure)
     * 
     */
    @XmlEnumValue("OECD603")
    OECD_603("OECD603"),

    /**
     * OSIN Other Securities Information Number
     * 
     */
    @XmlEnumValue("OECD604")
    OECD_604("OECD604"),

    /**
     * Other any other type of account number e.g. insurance contract
     * 
     */
    @XmlEnumValue("OECD605")
    OECD_605("OECD605"),

    /**
     * Where information not available
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    AccountNumberTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountNumberTypeType fromValue(String v) {
        for (AccountNumberTypeType c: AccountNumberTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
