//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:06:57 PM CEST 
//


package it.finanze.entrate.statist;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.MsgApplicationIdType;


/**
 * This type defines the statistics for IES-120 - Payer and Relationship Statistics.
 * 			Unlike other queries, IES-120 does not retrieve the message date in a MSG_DATE field. Filtering the records to send to the Commission for this query should be performed only using the MSG_TAX_YEAR field. This statistic will thus include all messages sent until the day of computing it. 
 * For MS who have an internal implementation that does not store a duplicate Payer for each Recipient, this allows a Payer appearing in different messages (sent at different dates) to be reported only once for each Tax Year. The changes in semantics do not adversely affect the quality or scope of the reporting that will be done based on these specific statistics.
 * 
 * 
 * <p>Classe Java per IES-120_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IES-120_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MsgApplicationId_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="IS_NP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PERSON_ID_TIN_IS_SS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_TIN_ISNT_SS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_IS_SS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_ISNT_SS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_VAT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_OTHER" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_NO_TYPE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PAYER_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RELATIONSHIP_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RELATIONSHIP_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IES-120_Type", propOrder = {
    "msgoriginatingcountry",
    "msgapplicationid",
    "msgtaxyear",
    "isnp",
    "personidtinisss",
    "personidtinisntss",
    "personidssnisss",
    "personidssnisntss",
    "personidvat",
    "personidother",
    "personidnotype",
    "payerqty",
    "relationshipgroup",
    "relationshipqty",
    "amountqty",
    "amounteur",
    "existenceqty"
})
public class IES120Type {

    @XmlElement(name = "MSG_ORIGINATING_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgoriginatingcountry;
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "IS_NP")
    protected boolean isnp;
    @XmlElement(name = "PERSON_ID_TIN_IS_SS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisss;
    @XmlElement(name = "PERSON_ID_TIN_ISNT_SS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisntss;
    @XmlElement(name = "PERSON_ID_SSN_IS_SS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisss;
    @XmlElement(name = "PERSON_ID_SSN_ISNT_SS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisntss;
    @XmlElement(name = "PERSON_ID_VAT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidvat;
    @XmlElement(name = "PERSON_ID_OTHER", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidother;
    @XmlElement(name = "PERSON_ID_NO_TYPE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidnotype;
    @XmlElement(name = "PAYER_QTY", required = true)
    protected BigInteger payerqty;
    @XmlElement(name = "RELATIONSHIP_GROUP", required = true)
    protected BigInteger relationshipgroup;
    @XmlElement(name = "RELATIONSHIP_QTY", required = true)
    protected BigInteger relationshipqty;
    @XmlElement(name = "AMOUNT_QTY", required = true)
    protected BigInteger amountqty;
    @XmlElement(name = "AMOUNT_EUR", required = true)
    protected BigDecimal amounteur;
    @XmlElement(name = "EXISTENCE_QTY", required = true)
    protected BigInteger existenceqty;

    /**
     * Recupera il valore della proprietà msgoriginatingcountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGORIGINATINGCOUNTRY() {
        return msgoriginatingcountry;
    }

    /**
     * Imposta il valore della proprietà msgoriginatingcountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGORIGINATINGCOUNTRY(String value) {
        this.msgoriginatingcountry = value;
    }

    /**
     * Recupera il valore della proprietà msgapplicationid.
     * 
     * @return
     *     possible object is
     *     {@link MsgApplicationIdType }
     *     
     */
    public MsgApplicationIdType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdType value) {
        this.msgapplicationid = value;
    }

    /**
     * Recupera il valore della proprietà msgtaxyear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGTAXYEAR() {
        return msgtaxyear;
    }

    /**
     * Imposta il valore della proprietà msgtaxyear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGTAXYEAR(XMLGregorianCalendar value) {
        this.msgtaxyear = value;
    }

    /**
     * Recupera il valore della proprietà isnp.
     * 
     */
    public boolean isISNP() {
        return isnp;
    }

    /**
     * Imposta il valore della proprietà isnp.
     * 
     */
    public void setISNP(boolean value) {
        this.isnp = value;
    }

    /**
     * Recupera il valore della proprietà personidtinisss.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISSS() {
        return personidtinisss;
    }

    /**
     * Imposta il valore della proprietà personidtinisss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISSS(BigInteger value) {
        this.personidtinisss = value;
    }

    /**
     * Recupera il valore della proprietà personidtinisntss.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISNTSS() {
        return personidtinisntss;
    }

    /**
     * Imposta il valore della proprietà personidtinisntss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISNTSS(BigInteger value) {
        this.personidtinisntss = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisss.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISSS() {
        return personidssnisss;
    }

    /**
     * Imposta il valore della proprietà personidssnisss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISSS(BigInteger value) {
        this.personidssnisss = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisntss.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISNTSS() {
        return personidssnisntss;
    }

    /**
     * Imposta il valore della proprietà personidssnisntss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISNTSS(BigInteger value) {
        this.personidssnisntss = value;
    }

    /**
     * Recupera il valore della proprietà personidvat.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDVAT() {
        return personidvat;
    }

    /**
     * Imposta il valore della proprietà personidvat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDVAT(BigInteger value) {
        this.personidvat = value;
    }

    /**
     * Recupera il valore della proprietà personidother.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDOTHER() {
        return personidother;
    }

    /**
     * Imposta il valore della proprietà personidother.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDOTHER(BigInteger value) {
        this.personidother = value;
    }

    /**
     * Recupera il valore della proprietà personidnotype.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDNOTYPE() {
        return personidnotype;
    }

    /**
     * Imposta il valore della proprietà personidnotype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDNOTYPE(BigInteger value) {
        this.personidnotype = value;
    }

    /**
     * Recupera il valore della proprietà payerqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPAYERQTY() {
        return payerqty;
    }

    /**
     * Imposta il valore della proprietà payerqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPAYERQTY(BigInteger value) {
        this.payerqty = value;
    }

    /**
     * Recupera il valore della proprietà relationshipgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRELATIONSHIPGROUP() {
        return relationshipgroup;
    }

    /**
     * Imposta il valore della proprietà relationshipgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRELATIONSHIPGROUP(BigInteger value) {
        this.relationshipgroup = value;
    }

    /**
     * Recupera il valore della proprietà relationshipqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRELATIONSHIPQTY() {
        return relationshipqty;
    }

    /**
     * Imposta il valore della proprietà relationshipqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRELATIONSHIPQTY(BigInteger value) {
        this.relationshipqty = value;
    }

    /**
     * Recupera il valore della proprietà amountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAMOUNTQTY() {
        return amountqty;
    }

    /**
     * Imposta il valore della proprietà amountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAMOUNTQTY(BigInteger value) {
        this.amountqty = value;
    }

    /**
     * Recupera il valore della proprietà amounteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTEUR() {
        return amounteur;
    }

    /**
     * Imposta il valore della proprietà amounteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTEUR(BigDecimal value) {
        this.amounteur = value;
    }

    /**
     * Recupera il valore della proprietà existenceqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXISTENCEQTY() {
        return existenceqty;
    }

    /**
     * Imposta il valore della proprietà existenceqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXISTENCEQTY(BigInteger value) {
        this.existenceqty = value;
    }

}
