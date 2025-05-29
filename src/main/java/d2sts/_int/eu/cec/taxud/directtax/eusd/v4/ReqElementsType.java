//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per ReqElements_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReqElements_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;anyAttribute processContents='lax'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ExpectedEntity" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}EntityParty_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExpectedArt4_2PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Art4_2PaymentData_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExpectedPayingAgent" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}PAParty_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExpectedBeneficialOwner" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}BOParty_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExpectedArt9PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Art9PaymentData_Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqElements_Type", propOrder = {
    "docRefId",
    "errorType",
    "reason",
    "details",
    "expectedEntity",
    "expectedArt42PaymentData",
    "expectedPayingAgent",
    "expectedBeneficialOwner",
    "expectedArt9PaymentData"
})
public class ReqElementsType {

    @XmlElement(name = "DocRefId", required = true)
    protected String docRefId;
    @XmlElement(name = "ErrorType", required = true)
    protected BigInteger errorType;
    @XmlElement(name = "Reason", required = true)
    protected BigInteger reason;
    @XmlElement(name = "Details")
    protected ReqElementsType.Details details;
    @XmlElement(name = "ExpectedEntity")
    protected EntityPartyType expectedEntity;
    @XmlElement(name = "ExpectedArt4_2PaymentData")
    protected Art42PaymentDataType expectedArt42PaymentData;
    @XmlElement(name = "ExpectedPayingAgent")
    protected PAPartyType expectedPayingAgent;
    @XmlElement(name = "ExpectedBeneficialOwner")
    protected BOPartyType expectedBeneficialOwner;
    @XmlElement(name = "ExpectedArt9PaymentData")
    protected Art9PaymentDataType expectedArt9PaymentData;

    /**
     * Recupera il valore della proprietà docRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Imposta il valore della proprietà docRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

    /**
     * Recupera il valore della proprietà errorType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorType() {
        return errorType;
    }

    /**
     * Imposta il valore della proprietà errorType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorType(BigInteger value) {
        this.errorType = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReason(BigInteger value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà details.
     * 
     * @return
     *     possible object is
     *     {@link ReqElementsType.Details }
     *     
     */
    public ReqElementsType.Details getDetails() {
        return details;
    }

    /**
     * Imposta il valore della proprietà details.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqElementsType.Details }
     *     
     */
    public void setDetails(ReqElementsType.Details value) {
        this.details = value;
    }

    /**
     * Recupera il valore della proprietà expectedEntity.
     * 
     * @return
     *     possible object is
     *     {@link EntityPartyType }
     *     
     */
    public EntityPartyType getExpectedEntity() {
        return expectedEntity;
    }

    /**
     * Imposta il valore della proprietà expectedEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPartyType }
     *     
     */
    public void setExpectedEntity(EntityPartyType value) {
        this.expectedEntity = value;
    }

    /**
     * Recupera il valore della proprietà expectedArt42PaymentData.
     * 
     * @return
     *     possible object is
     *     {@link Art42PaymentDataType }
     *     
     */
    public Art42PaymentDataType getExpectedArt42PaymentData() {
        return expectedArt42PaymentData;
    }

    /**
     * Imposta il valore della proprietà expectedArt42PaymentData.
     * 
     * @param value
     *     allowed object is
     *     {@link Art42PaymentDataType }
     *     
     */
    public void setExpectedArt42PaymentData(Art42PaymentDataType value) {
        this.expectedArt42PaymentData = value;
    }

    /**
     * Recupera il valore della proprietà expectedPayingAgent.
     * 
     * @return
     *     possible object is
     *     {@link PAPartyType }
     *     
     */
    public PAPartyType getExpectedPayingAgent() {
        return expectedPayingAgent;
    }

    /**
     * Imposta il valore della proprietà expectedPayingAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link PAPartyType }
     *     
     */
    public void setExpectedPayingAgent(PAPartyType value) {
        this.expectedPayingAgent = value;
    }

    /**
     * Recupera il valore della proprietà expectedBeneficialOwner.
     * 
     * @return
     *     possible object is
     *     {@link BOPartyType }
     *     
     */
    public BOPartyType getExpectedBeneficialOwner() {
        return expectedBeneficialOwner;
    }

    /**
     * Imposta il valore della proprietà expectedBeneficialOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link BOPartyType }
     *     
     */
    public void setExpectedBeneficialOwner(BOPartyType value) {
        this.expectedBeneficialOwner = value;
    }

    /**
     * Recupera il valore della proprietà expectedArt9PaymentData.
     * 
     * @return
     *     possible object is
     *     {@link Art9PaymentDataType }
     *     
     */
    public Art9PaymentDataType getExpectedArt9PaymentData() {
        return expectedArt9PaymentData;
    }

    /**
     * Imposta il valore della proprietà expectedArt9PaymentData.
     * 
     * @param value
     *     allowed object is
     *     {@link Art9PaymentDataType }
     *     
     */
    public void setExpectedArt9PaymentData(Art9PaymentDataType value) {
        this.expectedArt9PaymentData = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;anyAttribute processContents='lax'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Details {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
