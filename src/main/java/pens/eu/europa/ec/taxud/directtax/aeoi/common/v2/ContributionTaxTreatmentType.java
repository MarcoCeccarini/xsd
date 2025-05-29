//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ContributionTaxTreatment_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContributionTaxTreatment_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NoRelief"/&gt;
 *     &lt;enumeration value="ReliefDeductible"/&gt;
 *     &lt;enumeration value="ReliefDeducted"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContributionTaxTreatment_Type")
@XmlEnum
public enum ContributionTaxTreatmentType {

    @XmlEnumValue("NoRelief")
    NO_RELIEF("NoRelief"),
    @XmlEnumValue("ReliefDeductible")
    RELIEF_DEDUCTIBLE("ReliefDeductible"),
    @XmlEnumValue("ReliefDeducted")
    RELIEF_DEDUCTED("ReliefDeducted"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ContributionTaxTreatmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContributionTaxTreatmentType fromValue(String v) {
        for (ContributionTaxTreatmentType c: ContributionTaxTreatmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
