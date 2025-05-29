//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stf.v2.GenderType;


/**
 * Alternative for NaturalPerson_Type where all mandatory fields are optional. Used for Representatives, Counterparts and Administrators.
 * 
 * <p>Classe Java per NaturalPersonOpt_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NaturalPersonOpt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}PersonIdOpt_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Birth" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}BirthOpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AddressOpt_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}NameOpt_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActingCapacity" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Capacity_Type" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{urn:oecd:ties:stf:v2}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NationalityCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherPartyInfo" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}I18nString_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturalPersonOpt_Type", propOrder = {
    "id",
    "birth",
    "address",
    "name",
    "actingCapacity",
    "gender",
    "residenceCountryCode",
    "nationalityCountryCode",
    "otherPartyInfo"
})
public class NaturalPersonOptType {

    @XmlElement(name = "ID")
    protected List<PersonIdOptType> id;
    @XmlElement(name = "Birth")
    protected BirthOptType birth;
    @XmlElement(name = "Address")
    protected List<AddressOptType> address;
    @XmlElement(name = "Name")
    protected List<NameOptType> name;
    @XmlElement(name = "ActingCapacity")
    @XmlSchemaType(name = "token")
    protected CapacityType actingCapacity;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "token")
    protected GenderType gender;
    @XmlElement(name = "ResidenceCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String residenceCountryCode;
    @XmlElement(name = "NationalityCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> nationalityCountryCode;
    @XmlElement(name = "OtherPartyInfo")
    protected List<I18NStringType> otherPartyInfo;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdOptType }
     * 
     * 
     */
    public List<PersonIdOptType> getID() {
        if (id == null) {
            id = new ArrayList<PersonIdOptType>();
        }
        return this.id;
    }

    /**
     * Recupera il valore della proprietà birth.
     * 
     * @return
     *     possible object is
     *     {@link BirthOptType }
     *     
     */
    public BirthOptType getBirth() {
        return birth;
    }

    /**
     * Imposta il valore della proprietà birth.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthOptType }
     *     
     */
    public void setBirth(BirthOptType value) {
        this.birth = value;
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
     * {@link AddressOptType }
     * 
     * 
     */
    public List<AddressOptType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressOptType>();
        }
        return this.address;
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
     * {@link NameOptType }
     * 
     * 
     */
    public List<NameOptType> getName() {
        if (name == null) {
            name = new ArrayList<NameOptType>();
        }
        return this.name;
    }

    /**
     * Recupera il valore della proprietà actingCapacity.
     * 
     * @return
     *     possible object is
     *     {@link CapacityType }
     *     
     */
    public CapacityType getActingCapacity() {
        return actingCapacity;
    }

    /**
     * Imposta il valore della proprietà actingCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacityType }
     *     
     */
    public void setActingCapacity(CapacityType value) {
        this.actingCapacity = value;
    }

    /**
     * Recupera il valore della proprietà gender.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Imposta il valore della proprietà gender.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Recupera il valore della proprietà residenceCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Imposta il valore della proprietà residenceCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the nationalityCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalityCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalityCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNationalityCountryCode() {
        if (nationalityCountryCode == null) {
            nationalityCountryCode = new ArrayList<String>();
        }
        return this.nationalityCountryCode;
    }

    /**
     * Gets the value of the otherPartyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NStringType }
     * 
     * 
     */
    public List<I18NStringType> getOtherPartyInfo() {
        if (otherPartyInfo == null) {
            otherPartyInfo = new ArrayList<I18NStringType>();
        }
        return this.otherPartyInfo;
    }

}
