//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PAParty_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PAParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherInfo" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}OtherInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartyId" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PartyId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PersData_Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Name_Type"/&gt;
 *         &lt;element name="Address" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Address_Type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="oecdLegalType" use="required" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PALegalType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAParty_Type", propOrder = {
    "otherInfo",
    "partyId",
    "persData",
    "name",
    "address"
})
@XmlSeeAlso({
    CorrectablePAPartyType.class
})
public class PAPartyType {

    @XmlElement(name = "OtherInfo")
    protected OtherInfoType otherInfo;
    @XmlElement(name = "PartyId")
    protected PartyIdType partyId;
    @XmlElement(name = "PersData")
    protected PersDataType persData;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlAttribute(name = "oecdLegalType", required = true)
    protected String oecdLegalType;

    /**
     * Recupera il valore della proprietà otherInfo.
     * 
     * @return
     *     possible object is
     *     {@link OtherInfoType }
     *     
     */
    public OtherInfoType getOtherInfo() {
        return otherInfo;
    }

    /**
     * Imposta il valore della proprietà otherInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInfoType }
     *     
     */
    public void setOtherInfo(OtherInfoType value) {
        this.otherInfo = value;
    }

    /**
     * Recupera il valore della proprietà partyId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdType }
     *     
     */
    public PartyIdType getPartyId() {
        return partyId;
    }

    /**
     * Imposta il valore della proprietà partyId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdType }
     *     
     */
    public void setPartyId(PartyIdType value) {
        this.partyId = value;
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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
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
