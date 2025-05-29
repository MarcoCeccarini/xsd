//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 			Data (other than Name and Address) to describe and identify an Individual. In general all of the subelements are optional, within certain document types they may be made obligatory. 'Nationality' and BirthCountryCode are of type 'CountryCode_Type' , 'BirthDate' is of type date, that is in the  form ccyy-mm-dd, the content of all other subelements is character string.
 * 			
 * 
 * <p>Classe Java per IndivPersData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndivPersData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gender" type="{urn:oecd:ties:stf:v2}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{urn:oecd:ties:stf:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BirthCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthCitySubentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountryCode" type="{urn:oecd:ties:stf:v2}CountryCode_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndivPersData_Type", propOrder = {
    "gender",
    "nationality",
    "birthDate",
    "birthCity",
    "birthCitySubentity",
    "birthCountryCode"
})
public class IndivPersDataType {

    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "token")
    protected GenderType gender;
    @XmlElement(name = "Nationality")
    @XmlSchemaType(name = "anySimpleType")
    protected String nationality;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthCity")
    protected String birthCity;
    @XmlElement(name = "BirthCitySubentity")
    protected String birthCitySubentity;
    @XmlElement(name = "BirthCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String birthCountryCode;

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
     * Recupera il valore della proprietà nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Imposta il valore della proprietà nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
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
     * Recupera il valore della proprietà birthCitySubentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCitySubentity() {
        return birthCitySubentity;
    }

    /**
     * Imposta il valore della proprietà birthCitySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCitySubentity(String value) {
        this.birthCitySubentity = value;
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
