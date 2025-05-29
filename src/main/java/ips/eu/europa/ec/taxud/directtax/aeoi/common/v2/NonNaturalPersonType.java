//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per NonNaturalPerson_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NonNaturalPerson_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}PersonId_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PersonName" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}NonNaturalPersonName_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Commencement" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Commencement_Type" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="PermanentEstablishment" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}PermanentEstablishment_Type"/&gt;
 *         &lt;element name="OtherPartyInfo" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}I18nString_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}NNPPersonType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonNaturalPerson_Type", propOrder = {
    "id",
    "address",
    "personName",
    "commencement",
    "form",
    "residenceCountryCode",
    "permanentEstablishment",
    "otherPartyInfo"
})
public class NonNaturalPersonType {

    @XmlElement(name = "ID")
    protected List<PersonIdType> id;
    @XmlElement(name = "Address", required = true)
    protected List<AddressType> address;
    @XmlElement(name = "PersonName", required = true)
    protected List<NonNaturalPersonNameType> personName;
    @XmlElement(name = "Commencement")
    protected CommencementType commencement;
    @XmlElement(name = "Form")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String form;
    @XmlElement(name = "ResidenceCountryCode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String residenceCountryCode;
    @XmlElement(name = "PermanentEstablishment", required = true)
    @XmlSchemaType(name = "token")
    protected PermanentEstablishmentType permanentEstablishment;
    @XmlElement(name = "OtherPartyInfo")
    protected List<I18NStringType> otherPartyInfo;
    @XmlAttribute(name = "type", required = true)
    protected NNPPersonTypeType type;

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
     * {@link PersonIdType }
     * 
     * 
     */
    public List<PersonIdType> getID() {
        if (id == null) {
            id = new ArrayList<PersonIdType>();
        }
        return this.id;
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
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNaturalPersonNameType }
     * 
     * 
     */
    public List<NonNaturalPersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<NonNaturalPersonNameType>();
        }
        return this.personName;
    }

    /**
     * Recupera il valore della proprietà commencement.
     * 
     * @return
     *     possible object is
     *     {@link CommencementType }
     *     
     */
    public CommencementType getCommencement() {
        return commencement;
    }

    /**
     * Imposta il valore della proprietà commencement.
     * 
     * @param value
     *     allowed object is
     *     {@link CommencementType }
     *     
     */
    public void setCommencement(CommencementType value) {
        this.commencement = value;
    }

    /**
     * Recupera il valore della proprietà form.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Imposta il valore della proprietà form.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
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
     * Recupera il valore della proprietà permanentEstablishment.
     * 
     * @return
     *     possible object is
     *     {@link PermanentEstablishmentType }
     *     
     */
    public PermanentEstablishmentType getPermanentEstablishment() {
        return permanentEstablishment;
    }

    /**
     * Imposta il valore della proprietà permanentEstablishment.
     * 
     * @param value
     *     allowed object is
     *     {@link PermanentEstablishmentType }
     *     
     */
    public void setPermanentEstablishment(PermanentEstablishmentType value) {
        this.permanentEstablishment = value;
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

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link NNPPersonTypeType }
     *     
     */
    public NNPPersonTypeType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link NNPPersonTypeType }
     *     
     */
    public void setType(NNPPersonTypeType value) {
        this.type = value;
    }

}
