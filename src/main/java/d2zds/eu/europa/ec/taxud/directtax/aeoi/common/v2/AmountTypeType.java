//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:08 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AmountType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="TotalGross"/&gt;
 *     &lt;enumeration value="DeductionsExempted"/&gt;
 *     &lt;enumeration value="Taxable"/&gt;
 *     &lt;enumeration value="Tax"/&gt;
 *     &lt;enumeration value="NetTaxed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountType_Type")
@XmlEnum
public enum AmountTypeType {

    @XmlEnumValue("TotalGross")
    TOTAL_GROSS("TotalGross"),
    @XmlEnumValue("DeductionsExempted")
    DEDUCTIONS_EXEMPTED("DeductionsExempted"),
    @XmlEnumValue("Taxable")
    TAXABLE("Taxable"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("NetTaxed")
    NET_TAXED("NetTaxed");
    private final String value;

    AmountTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountTypeType fromValue(String v) {
        for (AmountTypeType c: AmountTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
