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
 * <p>Classe Java per SchemeKind_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemeKind_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Retirement"/&gt;
 *     &lt;enumeration value="EarlyRetirement"/&gt;
 *     &lt;enumeration value="OldAgeOrGuarantee"/&gt;
 *     &lt;enumeration value="WidowsOrphansAndOtherDependants"/&gt;
 *     &lt;enumeration value="Disability"/&gt;
 *     &lt;enumeration value="War"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchemeKind_Type")
@XmlEnum
public enum SchemeKindType {


    /**
     * Retirement (A Retirement PEN is obtained by the Recipient after he/she reached a given age (fixed by national dispositions) and due to his/her past professional activities (either as salaried employee, self-employed person or official))
     * 
     */
    @XmlEnumValue("Retirement")
    RETIREMENT("Retirement"),

    /**
     * Early Retirement (An Early Retirement PEN is obtained by the Recipient after he/she reached a given age (fixed by national dispositions) which is lower than the normal Retirement pension age (fixed by national dispositions) and due to his/her past professional activities (either as salaried employee, self-employed person or official))
     * 
     */
    @XmlEnumValue("EarlyRetirement")
    EARLY_RETIREMENT("EarlyRetirement"),

    /**
     * Old Age / Guarantee (An Old Age/ Guarantee is obtained by the Recipient after he/she reached a given age (fixed by national dispositions). Contrary to Retirement PEN and Early Retirement, the Old Age / Guarantee is not due to the past professional activities of the Recipient)
     * 
     */
    @XmlEnumValue("OldAgeOrGuarantee")
    OLD_AGE_OR_GUARANTEE("OldAgeOrGuarantee"),

    /**
     * Widows, Orphans and Other Dependants (Widows, Orphans and Other Dependants (like a Divorcee or a Separated Spouse) may be entitled to a PEN right)
     * 
     */
    @XmlEnumValue("WidowsOrphansAndOtherDependants")
    WIDOWS_ORPHANS_AND_OTHER_DEPENDANTS("WidowsOrphansAndOtherDependants"),

    /**
     * Disability (It may happen that specific PEN are foreseen to cover Disability)
     * 
     */
    @XmlEnumValue("Disability")
    DISABILITY("Disability"),

    /**
     * War
     * 
     */
    @XmlEnumValue("War")
    WAR("War"),

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

    SchemeKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemeKindType fromValue(String v) {
        for (SchemeKindType c: SchemeKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
