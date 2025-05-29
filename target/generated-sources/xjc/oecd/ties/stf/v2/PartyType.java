//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package oecd.ties.stf.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This container brings together all data about a party. Name and address are required components and each can be present more than once to enable as complete a description as possible. Whenever possible one or more identifiers (TIN etc) should be added as well as a residence country code.   Additional data that describes and identifies the party can be given in the 'PersData' element. The code for the legal type according to the OECD codelist must be added.  The structures of all of the subelements are defined elsewhere in this schema.
 * 			
 * 
 * <p>Classe Java per Party_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Party_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:stf:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartyId" type="{urn:oecd:ties:stf:v2}PartyId_Type" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:oecd:ties:stf:v2}Name_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Address" type="{urn:oecd:ties:stf:v2}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PersData" type="{urn:oecd:ties:stf:v2}PersData_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="oecdLegalType" use="required" type="{urn:oecd:ties:stf:v2}oecdLegalType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party_Type", propOrder = {
    "resCountryCode",
    "partyId",
    "name",
    "address",
    "persData"
})
public class PartyType {

    @XmlElement(name = "ResCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String resCountryCode;
    @XmlElement(name = "PartyId")
    protected List<PartyIdType> partyId;
    @XmlElement(name = "Name", required = true)
    protected List<NameType> name;
    @XmlElement(name = "Address", required = true)
    protected List<AddressType> address;
    @XmlElement(name = "PersData")
    protected PersDataType persData;
    @XmlAttribute(name = "oecdLegalType", required = true)
    protected String oecdLegalType;

    /**
     * Recupera il valore della proprietà resCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResCountryCode() {
        return resCountryCode;
    }

    /**
     * Imposta il valore della proprietà resCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResCountryCode(String value) {
        this.resCountryCode = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdType }
     * 
     * 
     */
    public List<PartyIdType> getPartyId() {
        if (partyId == null) {
            partyId = new ArrayList<PartyIdType>();
        }
        return this.partyId;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Recupera il valore della proprietà persData.
     * 
     * @return
     *     possible object is
     *     {@link PersDataType }
     *     
     */
    public PersDataType getPersData() {
        return persData;
    }

    /**
     * Imposta il valore della proprietà persData.
     * 
     * @param value
     *     allowed object is
     *     {@link PersDataType }
     *     
     */
    public void setPersData(PersDataType value) {
        this.persData = value;
    }

    /**
     * Recupera il valore della proprietà oecdLegalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOecdLegalType() {
        return oecdLegalType;
    }

    /**
     * Imposta il valore della proprietà oecdLegalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOecdLegalType(String value) {
        this.oecdLegalType = value;
    }

}
