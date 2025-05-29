//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type defines the statistics for PENS-120 - Payer Statistics.
 * 
 * <p>Classe Java per PENS-120_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PENS-120_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdPEN_Type"/&gt;
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
 *         &lt;element name="SCHEME_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SCHEME_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EVENT_INFO_EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_AMOUNT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TAX_INFO_EXISTENCE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CAPITAL_VALUE_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PENS-120_Type", propOrder = {
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
    "schemegroup",
    "schemeqty",
    "eventgroup",
    "eventqty",
    "eventinfoamountgroup",
    "eventinfoamountqty",
    "eventinfoamounteur",
    "eventinfoexistencegroup",
    "eventinfoexistenceqty",
    "taxinfoamountgroup",
    "taxinfoamountqty",
    "taxinfoamounteur",
    "taxinfoexistencegroup",
    "taxinfoexistenceqty",
    "capitalvaluegroup",
    "capitalvalueqty",
    "capitalvalueeur"
})
public class PENS120Type {

    @XmlElement(name = "MSG_ORIGINATING_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgoriginatingcountry;
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdPENType msgapplicationid;
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
    @XmlElement(name = "SCHEME_GROUP", required = true)
    protected BigInteger schemegroup;
    @XmlElement(name = "SCHEME_QTY", required = true)
    protected BigInteger schemeqty;
    @XmlElement(name = "EVENT_GROUP", required = true)
    protected BigInteger eventgroup;
    @XmlElement(name = "EVENT_QTY", required = true)
    protected BigInteger eventqty;
    @XmlElement(name = "EVENT_INFO_AMOUNT_GROUP", required = true)
    protected BigInteger eventinfoamountgroup;
    @XmlElement(name = "EVENT_INFO_AMOUNT_QTY", required = true)
    protected BigInteger eventinfoamountqty;
    @XmlElement(name = "EVENT_INFO_AMOUNT_EUR", required = true)
    protected BigDecimal eventinfoamounteur;
    @XmlElement(name = "EVENT_INFO_EXISTENCE_GROUP", required = true)
    protected BigInteger eventinfoexistencegroup;
    @XmlElement(name = "EVENT_INFO_EXISTENCE_QTY", required = true)
    protected BigInteger eventinfoexistenceqty;
    @XmlElement(name = "TAX_INFO_AMOUNT_GROUP", required = true)
    protected BigInteger taxinfoamountgroup;
    @XmlElement(name = "TAX_INFO_AMOUNT_QTY", required = true)
    protected BigInteger taxinfoamountqty;
    @XmlElement(name = "TAX_INFO_AMOUNT_EUR", required = true)
    protected BigDecimal taxinfoamounteur;
    @XmlElement(name = "TAX_INFO_EXISTENCE_GROUP", required = true)
    protected BigInteger taxinfoexistencegroup;
    @XmlElement(name = "TAX_INFO_EXISTENCE_QTY", required = true)
    protected BigInteger taxinfoexistenceqty;
    @XmlElement(name = "CAPITAL_VALUE_GROUP", required = true)
    protected BigInteger capitalvaluegroup;
    @XmlElement(name = "CAPITAL_VALUE_QTY", required = true)
    protected BigInteger capitalvalueqty;
    @XmlElement(name = "CAPITAL_VALUE_EUR", required = true)
    protected BigDecimal capitalvalueeur;

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
     *     {@link MsgApplicationIdPENType }
     *     
     */
    public MsgApplicationIdPENType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdPENType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdPENType value) {
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
     * Recupera il valore della proprietà schemegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSCHEMEGROUP() {
        return schemegroup;
    }

    /**
     * Imposta il valore della proprietà schemegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSCHEMEGROUP(BigInteger value) {
        this.schemegroup = value;
    }

    /**
     * Recupera il valore della proprietà schemeqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSCHEMEQTY() {
        return schemeqty;
    }

    /**
     * Imposta il valore della proprietà schemeqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSCHEMEQTY(BigInteger value) {
        this.schemeqty = value;
    }

    /**
     * Recupera il valore della proprietà eventgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTGROUP() {
        return eventgroup;
    }

    /**
     * Imposta il valore della proprietà eventgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTGROUP(BigInteger value) {
        this.eventgroup = value;
    }

    /**
     * Recupera il valore della proprietà eventqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTQTY() {
        return eventqty;
    }

    /**
     * Imposta il valore della proprietà eventqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTQTY(BigInteger value) {
        this.eventqty = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamountgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOAMOUNTGROUP() {
        return eventinfoamountgroup;
    }

    /**
     * Imposta il valore della proprietà eventinfoamountgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOAMOUNTGROUP(BigInteger value) {
        this.eventinfoamountgroup = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOAMOUNTQTY() {
        return eventinfoamountqty;
    }

    /**
     * Imposta il valore della proprietà eventinfoamountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOAMOUNTQTY(BigInteger value) {
        this.eventinfoamountqty = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoamounteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEVENTINFOAMOUNTEUR() {
        return eventinfoamounteur;
    }

    /**
     * Imposta il valore della proprietà eventinfoamounteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEVENTINFOAMOUNTEUR(BigDecimal value) {
        this.eventinfoamounteur = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoexistencegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOEXISTENCEGROUP() {
        return eventinfoexistencegroup;
    }

    /**
     * Imposta il valore della proprietà eventinfoexistencegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOEXISTENCEGROUP(BigInteger value) {
        this.eventinfoexistencegroup = value;
    }

    /**
     * Recupera il valore della proprietà eventinfoexistenceqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEVENTINFOEXISTENCEQTY() {
        return eventinfoexistenceqty;
    }

    /**
     * Imposta il valore della proprietà eventinfoexistenceqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEVENTINFOEXISTENCEQTY(BigInteger value) {
        this.eventinfoexistenceqty = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamountgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOAMOUNTGROUP() {
        return taxinfoamountgroup;
    }

    /**
     * Imposta il valore della proprietà taxinfoamountgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOAMOUNTGROUP(BigInteger value) {
        this.taxinfoamountgroup = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOAMOUNTQTY() {
        return taxinfoamountqty;
    }

    /**
     * Imposta il valore della proprietà taxinfoamountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOAMOUNTQTY(BigInteger value) {
        this.taxinfoamountqty = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoamounteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXINFOAMOUNTEUR() {
        return taxinfoamounteur;
    }

    /**
     * Imposta il valore della proprietà taxinfoamounteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXINFOAMOUNTEUR(BigDecimal value) {
        this.taxinfoamounteur = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoexistencegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEGROUP() {
        return taxinfoexistencegroup;
    }

    /**
     * Imposta il valore della proprietà taxinfoexistencegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEGROUP(BigInteger value) {
        this.taxinfoexistencegroup = value;
    }

    /**
     * Recupera il valore della proprietà taxinfoexistenceqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINFOEXISTENCEQTY() {
        return taxinfoexistenceqty;
    }

    /**
     * Imposta il valore della proprietà taxinfoexistenceqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINFOEXISTENCEQTY(BigInteger value) {
        this.taxinfoexistenceqty = value;
    }

    /**
     * Recupera il valore della proprietà capitalvaluegroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAPITALVALUEGROUP() {
        return capitalvaluegroup;
    }

    /**
     * Imposta il valore della proprietà capitalvaluegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAPITALVALUEGROUP(BigInteger value) {
        this.capitalvaluegroup = value;
    }

    /**
     * Recupera il valore della proprietà capitalvalueqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAPITALVALUEQTY() {
        return capitalvalueqty;
    }

    /**
     * Imposta il valore della proprietà capitalvalueqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAPITALVALUEQTY(BigInteger value) {
        this.capitalvalueqty = value;
    }

    /**
     * Recupera il valore della proprietà capitalvalueeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCAPITALVALUEEUR() {
        return capitalvalueeur;
    }

    /**
     * Imposta il valore della proprietà capitalvalueeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCAPITALVALUEEUR(BigDecimal value) {
        this.capitalvalueeur = value;
    }

}
