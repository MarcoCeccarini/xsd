//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SchemeType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemeType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DefinedBenefits"/&gt;
 *     &lt;enumeration value="DefinedContributions"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchemeType_Type")
@XmlEnum
public enum SchemeTypeType {


    /**
     * Defined Benefits (i.e. the benefit is defined, whatever the contributions are over the life of the scheme. This involves a guaranteed amount of the benefit at the time of the out-payment as per a specific formula)
     * 
     */
    @XmlEnumValue("DefinedBenefits")
    DEFINED_BENEFITS("DefinedBenefits"),

    /**
     * Defined Contributions (i.e. the benefit will be the result of the capitalisation of defined contributions and may vary according to the yield generated over the years. This involves no guaranteed amount at the time of the out-payment)
     * 
     */
    @XmlEnumValue("DefinedContributions")
    DEFINED_CONTRIBUTIONS("DefinedContributions"),

    /**
     * Mixed
     * 
     */
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SchemeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemeTypeType fromValue(String v) {
        for (SchemeTypeType c: SchemeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
