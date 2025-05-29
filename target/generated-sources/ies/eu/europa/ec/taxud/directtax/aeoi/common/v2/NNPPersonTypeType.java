//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NNPPersonType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NNPPersonType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SoleProprietorship"/&gt;
 *     &lt;enumeration value="Corporation"/&gt;
 *     &lt;enumeration value="Government"/&gt;
 *     &lt;enumeration value="InternationalOrganisation"/&gt;
 *     &lt;enumeration value="PensionFund"/&gt;
 *     &lt;enumeration value="Charity"/&gt;
 *     &lt;enumeration value="CollectiveInvestmentVehicle"/&gt;
 *     &lt;enumeration value="Partnership"/&gt;
 *     &lt;enumeration value="Trust"/&gt;
 *     &lt;enumeration value="Estate"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NNPPersonType_Type")
@XmlEnum
public enum NNPPersonTypeType {

    @XmlEnumValue("SoleProprietorship")
    SOLE_PROPRIETORSHIP("SoleProprietorship"),
    @XmlEnumValue("Corporation")
    CORPORATION("Corporation"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("InternationalOrganisation")
    INTERNATIONAL_ORGANISATION("InternationalOrganisation"),
    @XmlEnumValue("PensionFund")
    PENSION_FUND("PensionFund"),
    @XmlEnumValue("Charity")
    CHARITY("Charity"),
    @XmlEnumValue("CollectiveInvestmentVehicle")
    COLLECTIVE_INVESTMENT_VEHICLE("CollectiveInvestmentVehicle"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("Trust")
    TRUST("Trust"),
    @XmlEnumValue("Estate")
    ESTATE("Estate"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    NNPPersonTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NNPPersonTypeType fromValue(String v) {
        for (NNPPersonTypeType c: NNPPersonTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
