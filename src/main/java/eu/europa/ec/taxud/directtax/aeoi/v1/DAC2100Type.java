//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.MessageTypeIndicatorType;


/**
 * This type defines the statistics for DAC2-100 - Message Reconciliation with CCN/CSI.
 * 
 * <p>Classe Java per DAC2-100_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DAC2-100_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MESSAGE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SS_CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="RR_CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="SENDING_COMPANY_IN" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MESSAGE_TYPE" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="WARNING" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}StringMin1Max4000_Type"/&gt;
 *         &lt;element name="CONTACT" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}StringMin1Max4000_Type"/&gt;
 *         &lt;element name="MESSAGE_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MESSAGE_TYPE_INDICATOR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MessageTypeIndicator_Type"/&gt;
 *         &lt;element name="REPORTING_PERIOD" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="MESSAGE_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="ACCOUNT_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AMOUNT_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS501_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS502_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS503_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS504_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAC2-100_Type", propOrder = {
    "messageid",
    "sscode",
    "rrcode",
    "sendingcompanyin",
    "messagetype",
    "warning",
    "contact",
    "messageref",
    "messagetypeindicator",
    "reportingperiod",
    "messagedate",
    "accounttotal",
    "amounttotal",
    "crs501TOTAL",
    "crs502TOTAL",
    "crs503TOTAL",
    "crs504TOTAL"
})
public class DAC2100Type {

    @XmlElement(name = "MESSAGE_ID", required = true)
    protected BigInteger messageid;
    @XmlElement(name = "SS_CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sscode;
    @XmlElement(name = "RR_CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String rrcode;
    @XmlElement(name = "SENDING_COMPANY_IN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sendingcompanyin;
    @XmlElement(name = "MESSAGE_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String messagetype;
    @XmlElement(name = "WARNING", required = true)
    protected String warning;
    @XmlElement(name = "CONTACT", required = true)
    protected String contact;
    @XmlElement(name = "MESSAGE_REF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String messageref;
    @XmlElement(name = "MESSAGE_TYPE_INDICATOR", required = true)
    @XmlSchemaType(name = "token")
    protected MessageTypeIndicatorType messagetypeindicator;
    @XmlElement(name = "REPORTING_PERIOD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingperiod;
    @XmlElement(name = "MESSAGE_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar messagedate;
    @XmlElement(name = "ACCOUNT_TOTAL", required = true)
    protected BigInteger accounttotal;
    @XmlElement(name = "AMOUNT_TOTAL", required = true)
    protected BigDecimal amounttotal;
    @XmlElement(name = "CRS501_TOTAL", required = true)
    protected BigDecimal crs501TOTAL;
    @XmlElement(name = "CRS502_TOTAL", required = true)
    protected BigDecimal crs502TOTAL;
    @XmlElement(name = "CRS503_TOTAL", required = true)
    protected BigDecimal crs503TOTAL;
    @XmlElement(name = "CRS504_TOTAL", required = true)
    protected BigDecimal crs504TOTAL;

    /**
     * Recupera il valore della proprietà messageid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMESSAGEID() {
        return messageid;
    }

    /**
     * Imposta il valore della proprietà messageid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMESSAGEID(BigInteger value) {
        this.messageid = value;
    }

    /**
     * Recupera il valore della proprietà sscode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSCODE() {
        return sscode;
    }

    /**
     * Imposta il valore della proprietà sscode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSCODE(String value) {
        this.sscode = value;
    }

    /**
     * Recupera il valore della proprietà rrcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRCODE() {
        return rrcode;
    }

    /**
     * Imposta il valore della proprietà rrcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRCODE(String value) {
        this.rrcode = value;
    }

    /**
     * Recupera il valore della proprietà sendingcompanyin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDINGCOMPANYIN() {
        return sendingcompanyin;
    }

    /**
     * Imposta il valore della proprietà sendingcompanyin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDINGCOMPANYIN(String value) {
        this.sendingcompanyin = value;
    }

    /**
     * Recupera il valore della proprietà messagetype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGETYPE() {
        return messagetype;
    }

    /**
     * Imposta il valore della proprietà messagetype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGETYPE(String value) {
        this.messagetype = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWARNING() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWARNING(String value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACT() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACT(String value) {
        this.contact = value;
    }

    /**
     * Recupera il valore della proprietà messageref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGEREF() {
        return messageref;
    }

    /**
     * Imposta il valore della proprietà messageref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGEREF(String value) {
        this.messageref = value;
    }

    /**
     * Recupera il valore della proprietà messagetypeindicator.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeIndicatorType }
     *     
     */
    public MessageTypeIndicatorType getMESSAGETYPEINDICATOR() {
        return messagetypeindicator;
    }

    /**
     * Imposta il valore della proprietà messagetypeindicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeIndicatorType }
     *     
     */
    public void setMESSAGETYPEINDICATOR(MessageTypeIndicatorType value) {
        this.messagetypeindicator = value;
    }

    /**
     * Recupera il valore della proprietà reportingperiod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREPORTINGPERIOD() {
        return reportingperiod;
    }

    /**
     * Imposta il valore della proprietà reportingperiod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREPORTINGPERIOD(XMLGregorianCalendar value) {
        this.reportingperiod = value;
    }

    /**
     * Recupera il valore della proprietà messagedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMESSAGEDATE() {
        return messagedate;
    }

    /**
     * Imposta il valore della proprietà messagedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMESSAGEDATE(XMLGregorianCalendar value) {
        this.messagedate = value;
    }

    /**
     * Recupera il valore della proprietà accounttotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACCOUNTTOTAL() {
        return accounttotal;
    }

    /**
     * Imposta il valore della proprietà accounttotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACCOUNTTOTAL(BigInteger value) {
        this.accounttotal = value;
    }

    /**
     * Recupera il valore della proprietà amounttotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTTOTAL() {
        return amounttotal;
    }

    /**
     * Imposta il valore della proprietà amounttotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTTOTAL(BigDecimal value) {
        this.amounttotal = value;
    }

    /**
     * Recupera il valore della proprietà crs501TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS501TOTAL() {
        return crs501TOTAL;
    }

    /**
     * Imposta il valore della proprietà crs501TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS501TOTAL(BigDecimal value) {
        this.crs501TOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs502TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS502TOTAL() {
        return crs502TOTAL;
    }

    /**
     * Imposta il valore della proprietà crs502TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS502TOTAL(BigDecimal value) {
        this.crs502TOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs503TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS503TOTAL() {
        return crs503TOTAL;
    }

    /**
     * Imposta il valore della proprietà crs503TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS503TOTAL(BigDecimal value) {
        this.crs503TOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs504TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS504TOTAL() {
        return crs504TOTAL;
    }

    /**
     * Imposta il valore della proprietà crs504TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS504TOTAL(BigDecimal value) {
        this.crs504TOTAL = value;
    }

}
