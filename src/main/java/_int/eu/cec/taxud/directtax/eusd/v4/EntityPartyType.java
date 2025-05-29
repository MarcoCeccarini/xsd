//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EntityParty_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EntityParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherInfo" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}OtherInfo_Type"/&gt;
 *         &lt;element name="NameFree" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}EntityName_Type"/&gt;
 *         &lt;element name="Address" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Address_Type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="oecdLegalType" use="required" type="{urn:oecd:ties:stf:v2}oecdLegalType_Type" fixed="06" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityParty_Type", propOrder = {
    "otherInfo",
    "nameFree",
    "address"
})
@XmlSeeAlso({
    CorrectableEntityPartyType.class
})
public class EntityPartyType {

    @XmlElement(name = "OtherInfo", required = true)
    protected OtherInfoType otherInfo;
    @XmlElement(name = "NameFree", required = true)
    protected EntityNameType nameFree;
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
     * Recupera il valore della proprietà nameFree.
     * 
     * @return
     *     possible object is
     *     {@link EntityNameType }
     *     
     */
    public EntityNameType getNameFree() {
        return nameFree;
    }

    /**
     * Imposta il valore della proprietà nameFree.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNameType }
     *     
     */
    public void setNameFree(EntityNameType value) {
        this.nameFree = value;
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
        if (oecdLegalType == null) {
            return "06";
        } else {
            return oecdLegalType;
        }
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
