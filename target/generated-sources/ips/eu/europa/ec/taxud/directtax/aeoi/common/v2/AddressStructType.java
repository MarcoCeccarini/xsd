//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddressStruct_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressStruct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuiteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FloorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CountrySubentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressStruct_Type", propOrder = {
    "street",
    "buildingIdentifier",
    "suiteIdentifier",
    "floorIdentifier",
    "districtName",
    "pob",
    "postCode",
    "city",
    "countrySubentity",
    "otherLocalId"
})
public class AddressStructType {

    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "BuildingIdentifier")
    protected String buildingIdentifier;
    @XmlElement(name = "SuiteIdentifier")
    protected String suiteIdentifier;
    @XmlElement(name = "FloorIdentifier")
    protected String floorIdentifier;
    @XmlElement(name = "DistrictName")
    protected String districtName;
    @XmlElement(name = "POB")
    protected String pob;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "CountrySubentity")
    protected String countrySubentity;
    @XmlElement(name = "OtherLocalId")
    protected String otherLocalId;

    /**
     * Recupera il valore della proprietÓ street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietÓ street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Recupera il valore della proprietÓ buildingIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingIdentifier() {
        return buildingIdentifier;
    }

    /**
     * Imposta il valore della proprietÓ buildingIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingIdentifier(String value) {
        this.buildingIdentifier = value;
    }

    /**
     * Recupera il valore della proprietÓ suiteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteIdentifier() {
        return suiteIdentifier;
    }

    /**
     * Imposta il valore della proprietÓ suiteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteIdentifier(String value) {
        this.suiteIdentifier = value;
    }

    /**
     * Recupera il valore della proprietÓ floorIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorIdentifier() {
        return floorIdentifier;
    }

    /**
     * Imposta il valore della proprietÓ floorIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorIdentifier(String value) {
        this.floorIdentifier = value;
    }

    /**
     * Recupera il valore della proprietÓ districtName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Imposta il valore della proprietÓ districtName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Recupera il valore della proprietÓ pob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Imposta il valore della proprietÓ pob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOB(String value) {
        this.pob = value;
    }

    /**
     * Recupera il valore della proprietÓ postCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Imposta il valore della proprietÓ postCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Recupera il valore della proprietÓ city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietÓ city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietÓ countrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Imposta il valore della proprietÓ countrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubentity(String value) {
        this.countrySubentity = value;
    }

    /**
     * Recupera il valore della proprietÓ otherLocalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLocalId() {
        return otherLocalId;
    }

    /**
     * Imposta il valore della proprietÓ otherLocalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLocalId(String value) {
        this.otherLocalId = value;
    }

}
