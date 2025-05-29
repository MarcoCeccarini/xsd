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
 * <p>Classe Java per SchemeNature_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemeNature_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SocialSecurityBenefit"/&gt;
 *     &lt;enumeration value="OccupationalBenefit"/&gt;
 *     &lt;enumeration value="OccupationalBenefitIndividual"/&gt;
 *     &lt;enumeration value="OccupationalBenefitCollective"/&gt;
 *     &lt;enumeration value="IndividualBenefit"/&gt;
 *     &lt;enumeration value="OtherBenefit"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchemeNature_Type")
@XmlEnum
public enum SchemeNatureType {


    /**
     * Social Security Benefit (First pillar pensions)
     * 
     */
    @XmlEnumValue("SocialSecurityBenefit")
    SOCIAL_SECURITY_BENEFIT("SocialSecurityBenefit"),

    /**
     * Occupational Benefit (This corresponds to the second PEN pillar and concerns either one specific Natural Person or a group of Natural Persons)
     * 
     */
    @XmlEnumValue("OccupationalBenefit")
    OCCUPATIONAL_BENEFIT("OccupationalBenefit"),

    /**
     * Occupational Benefit Individual (This corresponds to the second PEN pillar and concerns a specific pension scheme set up for a single Natural Person in the context of an occupation (e.g. a special PEN Scheme designed for a Top Manager in a company))
     * 
     */
    @XmlEnumValue("OccupationalBenefitIndividual")
    OCCUPATIONAL_BENEFIT_INDIVIDUAL("OccupationalBenefitIndividual"),

    /**
     * Occupational Benefit Collective (This corresponds to the second PEN pillar and concerns a pension scheme established for a category of Natural Persons (e.g. a special PEN Scheme designed in a given company for all employees or a specific group of employees sharing common characteristics))
     * 
     */
    @XmlEnumValue("OccupationalBenefitCollective")
    OCCUPATIONAL_BENEFIT_COLLECTIVE("OccupationalBenefitCollective"),

    /**
     * Individual Benefit (This belongs to the third PEN pillar and concerns Natural Persons who decide on their own to subscribe for a PEN Scheme)
     * 
     */
    @XmlEnumValue("IndividualBenefit")
    INDIVIDUAL_BENEFIT("IndividualBenefit"),

    /**
     * Other Benefit (e.g. war pension benefit)
     * 
     */
    @XmlEnumValue("OtherBenefit")
    OTHER_BENEFIT("OtherBenefit"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SchemeNatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemeNatureType fromValue(String v) {
        for (SchemeNatureType c: SchemeNatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
