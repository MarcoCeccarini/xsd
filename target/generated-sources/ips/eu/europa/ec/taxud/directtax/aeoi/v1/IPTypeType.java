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
 * <p>Classe Java per IPType_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IPType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Land"/&gt;
 *     &lt;enumeration value="Building"/&gt;
 *     &lt;enumeration value="LandAndBuilding"/&gt;
 *     &lt;enumeration value="BuildingUnit"/&gt;
 *     &lt;enumeration value="LandAndBuildingUnit"/&gt;
 *     &lt;enumeration value="Shares"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IPType_Type")
@XmlEnum
public enum IPTypeType {


    /**
     * Land
     * 
     */
    @XmlEnumValue("Land")
    LAND("Land"),

    /**
     * Building
     * 
     */
    @XmlEnumValue("Building")
    BUILDING("Building"),

    /**
     * Land + Building
     * 
     */
    @XmlEnumValue("LandAndBuilding")
    LAND_AND_BUILDING("LandAndBuilding"),

    /**
     * Building Unit (e.g. apartment)
     * 
     */
    @XmlEnumValue("BuildingUnit")
    BUILDING_UNIT("BuildingUnit"),

    /**
     * Building Unit + Land (e.g. apartment with a portion in the soil)
     * 
     */
    @XmlEnumValue("LandAndBuildingUnit")
    LAND_AND_BUILDING_UNIT("LandAndBuildingUnit"),

    /**
     * Shares (this type is very specific to some countries (e.g. Finland) where a building is officially owned by a company but the shares are associated to specific building units and shareholders have a direct right on their unit(s) and will accordingly for instance directly rent the building under their own name and not under the company’s name)
     * 
     */
    @XmlEnumValue("Shares")
    SHARES("Shares"),

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

    IPTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPTypeType fromValue(String v) {
        for (IPTypeType c: IPTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
