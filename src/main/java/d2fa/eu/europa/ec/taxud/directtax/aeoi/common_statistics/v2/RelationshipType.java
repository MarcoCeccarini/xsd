//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Relationship_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Relationship_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Dependent"/&gt;
 *     &lt;enumeration value="Independent"/&gt;
 *     &lt;enumeration value="Director"/&gt;
 *     &lt;enumeration value="DirectorDependent"/&gt;
 *     &lt;enumeration value="DirectorIndependent"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Relationship_Type")
@XmlEnum
public enum RelationshipType {


    /**
     * Dependent
     * 
     */
    @XmlEnumValue("Dependent")
    DEPENDENT("Dependent"),

    /**
     * Independent
     * 
     */
    @XmlEnumValue("Independent")
    INDEPENDENT("Independent"),

    /**
     * Director (to be used when there is no distinction in SS between dependent and independent director and when such distinction exists but the information is not available)
     * 
     */
    @XmlEnumValue("Director")
    DIRECTOR("Director"),

    /**
     * Director Dependent
     * 
     */
    @XmlEnumValue("DirectorDependent")
    DIRECTOR_DEPENDENT("DirectorDependent"),

    /**
     * Director Independent
     * 
     */
    @XmlEnumValue("DirectorIndependent")
    DIRECTOR_INDEPENDENT("DirectorIndependent"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RelationshipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipType fromValue(String v) {
        for (RelationshipType c: RelationshipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
