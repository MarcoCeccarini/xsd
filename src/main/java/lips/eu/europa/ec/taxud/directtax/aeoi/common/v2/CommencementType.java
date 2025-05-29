//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Commencement_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Commencement_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommencementDate" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AdjustablePrecisionDate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CommencementCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommencementCountrySubentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommencementCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commencement_Type", propOrder = {
    "commencementDate",
    "commencementCity",
    "commencementCountrySubentity",
    "commencementCountryCode"
})
public class CommencementType {

    @XmlElement(name = "CommencementDate")
    protected AdjustablePrecisionDateType commencementDate;
    @XmlElement(name = "CommencementCity")
    protected String commencementCity;
    @XmlElement(name = "CommencementCountrySubentity")
    protected String commencementCountrySubentity;
    @XmlElement(name = "CommencementCountryCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String commencementCountryCode;

    /**
     * Recupera il valore della proprietà commencementDate.
     * 
     * @return
     *     possible object is
     *     {@link AdjustablePrecisionDateType }
     *     
     */
    public AdjustablePrecisionDateType getCommencementDate() {
        return commencementDate;
    }

    /**
     * Imposta il valore della proprietà commencementDate.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustablePrecisionDateType }
     *     
     */
    public void setCommencementDate(AdjustablePrecisionDateType value) {
        this.commencementDate = value;
    }

    /**
     * Recupera il valore della proprietà commencementCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommencementCity() {
        return commencementCity;
    }

    /**
     * Imposta il valore della proprietà commencementCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommencementCity(String value) {
        this.commencementCity = value;
    }

    /**
     * Recupera il valore della proprietà commencementCountrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommencementCountrySubentity() {
        return commencementCountrySubentity;
    }

    /**
     * Imposta il valore della proprietà commencementCountrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommencementCountrySubentity(String value) {
        this.commencementCountrySubentity = value;
    }

    /**
     * Recupera il valore della proprietà commencementCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommencementCountryCode() {
        return commencementCountryCode;
    }

    /**
     * Imposta il valore della proprietà commencementCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommencementCountryCode(String value) {
        this.commencementCountryCode = value;
    }

}
