//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.AccountHolderTypeType;
import eu.europa.ec.taxud.directtax.aeoi.common_statistics.v2.MessageTypeIndicatorType;


/**
 * This type defines the statistics for DAC2-500 - Controlling Person details statistics.
 * 
 * <p>Classe Java per DAC2-500_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DAC2-500_Type"&gt;
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
 *         &lt;element name="ACCOUNT_NUMBER_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}AccountNumberType_Type"/&gt;
 *         &lt;element name="ACCOUNT_HOLDER_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}AccountHolderType_Type"/&gt;
 *         &lt;element name="CLOSED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DORMANT_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CONTROLLING_PERSON_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}ControllingPersonType_Type"/&gt;
 *         &lt;element name="CONTROLLING_PERSON_OIN_CNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CONTROLLING_PERSON_TIN_CNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CONTROLLING_PERSON_RES_CTRY_CNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CONTROLLING_PERSON_IS_NP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RECORDS_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CTRL_AMOUNT_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CTRL_CRS501_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CTRL_CRS502_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CTRL_CRS503_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CTRL_CRS504_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAC2-500_Type", propOrder = {
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
    "accountnumbertype",
    "accountholdertype",
    "closedaccount",
    "dormantaccount",
    "controllingpersontype",
    "controllingpersonoincnt",
    "controllingpersontincnt",
    "controllingpersonresctrycnt",
    "controllingpersonisnp",
    "recordstotal",
    "ctrlamounttotal",
    "ctrlcrs501TOTAL",
    "ctrlcrs502TOTAL",
    "ctrlcrs503TOTAL",
    "ctrlcrs504TOTAL"
})
public class DAC2500Type {

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
    @XmlElement(name = "ACCOUNT_NUMBER_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected AccountNumberTypeType accountnumbertype;
    @XmlElement(name = "ACCOUNT_HOLDER_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected AccountHolderTypeType accountholdertype;
    @XmlElement(name = "CLOSED_ACCOUNT")
    protected boolean closedaccount;
    @XmlElement(name = "DORMANT_ACCOUNT")
    protected Boolean dormantaccount;
    @XmlElement(name = "CONTROLLING_PERSON_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected ControllingPersonTypeType controllingpersontype;
    @XmlElement(name = "CONTROLLING_PERSON_OIN_CNT", required = true)
    protected BigInteger controllingpersonoincnt;
    @XmlElement(name = "CONTROLLING_PERSON_TIN_CNT", required = true)
    protected BigInteger controllingpersontincnt;
    @XmlElement(name = "CONTROLLING_PERSON_RES_CTRY_CNT", required = true)
    protected BigInteger controllingpersonresctrycnt;
    @XmlElement(name = "CONTROLLING_PERSON_IS_NP")
    protected boolean controllingpersonisnp;
    @XmlElement(name = "RECORDS_TOTAL", required = true)
    protected BigInteger recordstotal;
    @XmlElement(name = "CTRL_AMOUNT_TOTAL", required = true)
    protected BigDecimal ctrlamounttotal;
    @XmlElement(name = "CTRL_CRS501_TOTAL", required = true)
    protected BigDecimal ctrlcrs501TOTAL;
    @XmlElement(name = "CTRL_CRS502_TOTAL", required = true)
    protected BigDecimal ctrlcrs502TOTAL;
    @XmlElement(name = "CTRL_CRS503_TOTAL", required = true)
    protected BigDecimal ctrlcrs503TOTAL;
    @XmlElement(name = "CTRL_CRS504_TOTAL", required = true)
    protected BigDecimal ctrlcrs504TOTAL;

    /**
     * Recupera il valore della propriet� messageid.
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
     * Imposta il valore della propriet� messageid.
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
     * Recupera il valore della propriet� sscode.
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
     * Imposta il valore della propriet� sscode.
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
     * Recupera il valore della propriet� rrcode.
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
     * Imposta il valore della propriet� rrcode.
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
     * Recupera il valore della propriet� sendingcompanyin.
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
     * Imposta il valore della propriet� sendingcompanyin.
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
     * Recupera il valore della propriet� messagetype.
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
     * Imposta il valore della propriet� messagetype.
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
     * Recupera il valore della propriet� warning.
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
     * Imposta il valore della propriet� warning.
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
     * Recupera il valore della propriet� contact.
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
     * Imposta il valore della propriet� contact.
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
     * Recupera il valore della propriet� messageref.
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
     * Imposta il valore della propriet� messageref.
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
     * Recupera il valore della propriet� messagetypeindicator.
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
     * Imposta il valore della propriet� messagetypeindicator.
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
     * Recupera il valore della propriet� reportingperiod.
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
     * Imposta il valore della propriet� reportingperiod.
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
     * Recupera il valore della propriet� messagedate.
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
     * Imposta il valore della propriet� messagedate.
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
     * Recupera il valore della propriet� accountnumbertype.
     * 
     * @return
     *     possible object is
     *     {@link AccountNumberTypeType }
     *     
     */
    public AccountNumberTypeType getACCOUNTNUMBERTYPE() {
        return accountnumbertype;
    }

    /**
     * Imposta il valore della propriet� accountnumbertype.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountNumberTypeType }
     *     
     */
    public void setACCOUNTNUMBERTYPE(AccountNumberTypeType value) {
        this.accountnumbertype = value;
    }

    /**
     * Recupera il valore della propriet� accountholdertype.
     * 
     * @return
     *     possible object is
     *     {@link AccountHolderTypeType }
     *     
     */
    public AccountHolderTypeType getACCOUNTHOLDERTYPE() {
        return accountholdertype;
    }

    /**
     * Imposta il valore della propriet� accountholdertype.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHolderTypeType }
     *     
     */
    public void setACCOUNTHOLDERTYPE(AccountHolderTypeType value) {
        this.accountholdertype = value;
    }

    /**
     * Recupera il valore della propriet� closedaccount.
     * 
     */
    public boolean isCLOSEDACCOUNT() {
        return closedaccount;
    }

    /**
     * Imposta il valore della propriet� closedaccount.
     * 
     */
    public void setCLOSEDACCOUNT(boolean value) {
        this.closedaccount = value;
    }

    /**
     * Recupera il valore della propriet� dormantaccount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDORMANTACCOUNT() {
        return dormantaccount;
    }

    /**
     * Imposta il valore della propriet� dormantaccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDORMANTACCOUNT(Boolean value) {
        this.dormantaccount = value;
    }

    /**
     * Recupera il valore della propriet� controllingpersontype.
     * 
     * @return
     *     possible object is
     *     {@link ControllingPersonTypeType }
     *     
     */
    public ControllingPersonTypeType getCONTROLLINGPERSONTYPE() {
        return controllingpersontype;
    }

    /**
     * Imposta il valore della propriet� controllingpersontype.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllingPersonTypeType }
     *     
     */
    public void setCONTROLLINGPERSONTYPE(ControllingPersonTypeType value) {
        this.controllingpersontype = value;
    }

    /**
     * Recupera il valore della propriet� controllingpersonoincnt.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONTROLLINGPERSONOINCNT() {
        return controllingpersonoincnt;
    }

    /**
     * Imposta il valore della propriet� controllingpersonoincnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONTROLLINGPERSONOINCNT(BigInteger value) {
        this.controllingpersonoincnt = value;
    }

    /**
     * Recupera il valore della propriet� controllingpersontincnt.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONTROLLINGPERSONTINCNT() {
        return controllingpersontincnt;
    }

    /**
     * Imposta il valore della propriet� controllingpersontincnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONTROLLINGPERSONTINCNT(BigInteger value) {
        this.controllingpersontincnt = value;
    }

    /**
     * Recupera il valore della propriet� controllingpersonresctrycnt.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONTROLLINGPERSONRESCTRYCNT() {
        return controllingpersonresctrycnt;
    }

    /**
     * Imposta il valore della propriet� controllingpersonresctrycnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONTROLLINGPERSONRESCTRYCNT(BigInteger value) {
        this.controllingpersonresctrycnt = value;
    }

    /**
     * Recupera il valore della propriet� controllingpersonisnp.
     * 
     */
    public boolean isCONTROLLINGPERSONISNP() {
        return controllingpersonisnp;
    }

    /**
     * Imposta il valore della propriet� controllingpersonisnp.
     * 
     */
    public void setCONTROLLINGPERSONISNP(boolean value) {
        this.controllingpersonisnp = value;
    }

    /**
     * Recupera il valore della propriet� recordstotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECORDSTOTAL() {
        return recordstotal;
    }

    /**
     * Imposta il valore della propriet� recordstotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECORDSTOTAL(BigInteger value) {
        this.recordstotal = value;
    }

    /**
     * Recupera il valore della propriet� ctrlamounttotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTRLAMOUNTTOTAL() {
        return ctrlamounttotal;
    }

    /**
     * Imposta il valore della propriet� ctrlamounttotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTRLAMOUNTTOTAL(BigDecimal value) {
        this.ctrlamounttotal = value;
    }

    /**
     * Recupera il valore della propriet� ctrlcrs501TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTRLCRS501TOTAL() {
        return ctrlcrs501TOTAL;
    }

    /**
     * Imposta il valore della propriet� ctrlcrs501TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTRLCRS501TOTAL(BigDecimal value) {
        this.ctrlcrs501TOTAL = value;
    }

    /**
     * Recupera il valore della propriet� ctrlcrs502TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTRLCRS502TOTAL() {
        return ctrlcrs502TOTAL;
    }

    /**
     * Imposta il valore della propriet� ctrlcrs502TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTRLCRS502TOTAL(BigDecimal value) {
        this.ctrlcrs502TOTAL = value;
    }

    /**
     * Recupera il valore della propriet� ctrlcrs503TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTRLCRS503TOTAL() {
        return ctrlcrs503TOTAL;
    }

    /**
     * Imposta il valore della propriet� ctrlcrs503TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTRLCRS503TOTAL(BigDecimal value) {
        this.ctrlcrs503TOTAL = value;
    }

    /**
     * Recupera il valore della propriet� ctrlcrs504TOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCTRLCRS504TOTAL() {
        return ctrlcrs504TOTAL;
    }

    /**
     * Imposta il valore della propriet� ctrlcrs504TOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCTRLCRS504TOTAL(BigDecimal value) {
        this.ctrlcrs504TOTAL = value;
    }

}
