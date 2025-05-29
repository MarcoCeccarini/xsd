//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Specific_Income_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Specific_Income_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OwnUse"/&gt;
 *     &lt;enumeration value="Right"/&gt;
 *     &lt;enumeration value="Rental"/&gt;
 *     &lt;enumeration value="CapitalGain"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Specific_Income_Type")
@XmlEnum
public enum SpecificIncomeType {


    /**
     * Own Use
     * 
     */
    @XmlEnumValue("OwnUse")
    OWN_USE("OwnUse"),

    /**
     * Right
     * 
     */
    @XmlEnumValue("Right")
    RIGHT("Right"),

    /**
     * Rental
     * 
     */
    @XmlEnumValue("Rental")
    RENTAL("Rental"),

    /**
     * Capital Gain
     * 
     */
    @XmlEnumValue("CapitalGain")
    CAPITAL_GAIN("CapitalGain"),

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

    SpecificIncomeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificIncomeType fromValue(String v) {
        for (SpecificIncomeType c: SpecificIncomeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
