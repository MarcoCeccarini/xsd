//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BOParty_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BOParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCountryCode" type="{urn:cec.eu.int:taxud:directtax:v4}CountryCode_Type"/&gt;
 *         &lt;element name="PartyId" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PartyId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IndivPersData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}IndivPersData_Type" minOccurs="0"/&gt;
 *         &lt;element name="OtherPersData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Other_Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Name_Type"/&gt;
 *         &lt;element name="Address" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Address_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="oecdLegalType" use="required" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}BOLegalType_Type" /&gt;
 *       &lt;attribute name="contractBefore2004" use="required" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}triState_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOParty_Type", propOrder = {
    "resCountryCode",
    "partyId",
    "indivPersData",
    "otherPersData",
    "name",
    "address"
})
@XmlSeeAlso({
    CorrectableBOPartyType.class
})
public class BOPartyType {

    @XmlElement(name = "ResCountryCode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String resCountryCode;
    @XmlElement(name = "PartyId")
    protected PartyIdType partyId;
    @XmlElement(name = "IndivPersData")
    protected IndivPersDataType indivPersData;
    @XmlElement(name = "OtherPersData")
    protected OtherType otherPersData;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "Address", required = true)
    protected List<AddressType> address;
    @XmlAttribute(name = "oecdLegalType", required = true)
    protected String oecdLegalType;
    @XmlAttribute(name = "contractBefore2004", required = true)
    protected String contractBefore2004;

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
     * Recupera il valore della proprietà indivPersData.
     * 
     * @return
     *     possible object is
     *     {@link IndivPersDataType }
     *     
     */
    public IndivPersDataType getIndivPersData() {
        return indivPersData;
    }

    /**
     * Imposta il valore della proprietà indivPersData.
     * 
     * @param value
     *     allowed object is
     *     {@link IndivPersDataType }
     *     
     */
    public void setIndivPersData(IndivPersDataType value) {
        this.indivPersData = value;
    }

    /**
     * Recupera il valore della proprietà otherPersData.
     * 
     * @return
     *     possible object is
     *     {@link OtherType }
     *     
     */
    public OtherType getOtherPersData() {
        return otherPersData;
    }

    /**
     * Imposta il valore della proprietà otherPersData.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType }
     *     
     */
    public void setOtherPersData(OtherType value) {
        this.otherPersData = value;
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

    /**
     * Recupera il valore della proprietà contractBefore2004.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractBefore2004() {
        return contractBefore2004;
    }

    /**
     * Imposta il valore della proprietà contractBefore2004.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractBefore2004(String value) {
        this.contractBefore2004 = value;
    }

}
