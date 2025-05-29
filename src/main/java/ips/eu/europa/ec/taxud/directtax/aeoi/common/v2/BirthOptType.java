//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Alternative for Birth_Type where all mandatory fields are optional. Used for Representatives, Counterparts and Administrators.
 * 
 * <p>Classe Java per BirthOpt_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BirthOpt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BirthDate" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AdjustablePrecisionDate_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountrySubentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirthOpt_Type", propOrder = {
    "birthDate",
    "birthCity",
    "birthCountrySubentity",
    "birthCountryCode"
})
public class BirthOptType {

    @XmlElement(name = "BirthDate")
    protected AdjustablePrecisionDateType birthDate;
    @XmlElement(name = "BirthCity")
    protected String birthCity;
    @XmlElement(name = "BirthCountrySubentity")
    protected String birthCountrySubentity;
    @XmlElement(name = "BirthCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String birthCountryCode;

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link AdjustablePrecisionDateType }
     *     
     */
    public AdjustablePrecisionDateType getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustablePrecisionDateType }
     *     
     */
    public void setBirthDate(AdjustablePrecisionDateType value) {
        this.birthDate = value;
    }

    /**
     * Recupera il valore della proprietà birthCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Imposta il valore della proprietà birthCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCity(String value) {
        this.birthCity = value;
    }

    /**
     * Recupera il valore della proprietà birthCountrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountrySubentity() {
        return birthCountrySubentity;
    }

    /**
     * Imposta il valore della proprietà birthCountrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountrySubentity(String value) {
        this.birthCountrySubentity = value;
    }

    /**
     * Recupera il valore della proprietà birthCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * Imposta il valore della proprietà birthCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryCode(String value) {
        this.birthCountryCode = value;
    }

}
