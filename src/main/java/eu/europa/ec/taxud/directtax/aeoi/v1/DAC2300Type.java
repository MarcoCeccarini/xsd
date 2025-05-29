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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type defines the statistics for DAC2-300 - Unique Account statistics.
 * 
 * <p>Classe Java per DAC2-300_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DAC2-300_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="REPORTING_PERIOD" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="DOCREFID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}StringMin1Max200_Type"/&gt;
 *         &lt;element name="ACCOUNT_NUMBER_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}AccountNumberType_Type"/&gt;
 *         &lt;element name="HOLDER_QTY_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CRS101_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CRS102_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CRS103_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ACCOUNT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RECORDS_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AMOUNT_AVG_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS501_AVG_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS502_AVG_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS503_AVG_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS504_AVG_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="AMOUNT_SUM_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS501_SUM_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS502_SUM_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS503_SUM_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="CRS504_SUM_TOTAL" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAC2-300_Type", propOrder = {
    "code",
    "reportingperiod",
    "docrefid",
    "accountnumbertype",
    "holderqtygroup",
    "crs101COUNT",
    "crs102COUNT",
    "crs103COUNT",
    "accountqty",
    "recordstotal",
    "amountavgtotal",
    "crs501AVGTOTAL",
    "crs502AVGTOTAL",
    "crs503AVGTOTAL",
    "crs504AVGTOTAL",
    "amountsumtotal",
    "crs501SUMTOTAL",
    "crs502SUMTOTAL",
    "crs503SUMTOTAL",
    "crs504SUMTOTAL"
})
public class DAC2300Type {

    @XmlElement(name = "CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlElement(name = "REPORTING_PERIOD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingperiod;
    @XmlElement(name = "DOCREFID", required = true)
    protected String docrefid;
    @XmlElement(name = "ACCOUNT_NUMBER_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected AccountNumberTypeType accountnumbertype;
    @XmlElement(name = "HOLDER_QTY_GROUP", required = true)
    protected BigInteger holderqtygroup;
    @XmlElement(name = "CRS101_COUNT", required = true)
    protected BigInteger crs101COUNT;
    @XmlElement(name = "CRS102_COUNT", required = true)
    protected BigInteger crs102COUNT;
    @XmlElement(name = "CRS103_COUNT", required = true)
    protected BigInteger crs103COUNT;
    @XmlElement(name = "ACCOUNT_QTY", required = true)
    protected BigInteger accountqty;
    @XmlElement(name = "RECORDS_TOTAL", required = true)
    protected BigInteger recordstotal;
    @XmlElement(name = "AMOUNT_AVG_TOTAL", required = true)
    protected BigDecimal amountavgtotal;
    @XmlElement(name = "CRS501_AVG_TOTAL", required = true)
    protected BigDecimal crs501AVGTOTAL;
    @XmlElement(name = "CRS502_AVG_TOTAL", required = true)
    protected BigDecimal crs502AVGTOTAL;
    @XmlElement(name = "CRS503_AVG_TOTAL", required = true)
    protected BigDecimal crs503AVGTOTAL;
    @XmlElement(name = "CRS504_AVG_TOTAL", required = true)
    protected BigDecimal crs504AVGTOTAL;
    @XmlElement(name = "AMOUNT_SUM_TOTAL", required = true)
    protected BigDecimal amountsumtotal;
    @XmlElement(name = "CRS501_SUM_TOTAL", required = true)
    protected BigDecimal crs501SUMTOTAL;
    @XmlElement(name = "CRS502_SUM_TOTAL", required = true)
    protected BigDecimal crs502SUMTOTAL;
    @XmlElement(name = "CRS503_SUM_TOTAL", required = true)
    protected BigDecimal crs503SUMTOTAL;
    @XmlElement(name = "CRS504_SUM_TOTAL", required = true)
    protected BigDecimal crs504SUMTOTAL;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
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
     * Recupera il valore della proprietà docrefid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCREFID() {
        return docrefid;
    }

    /**
     * Imposta il valore della proprietà docrefid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCREFID(String value) {
        this.docrefid = value;
    }

    /**
     * Recupera il valore della proprietà accountnumbertype.
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
     * Imposta il valore della proprietà accountnumbertype.
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
     * Recupera il valore della proprietà holderqtygroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHOLDERQTYGROUP() {
        return holderqtygroup;
    }

    /**
     * Imposta il valore della proprietà holderqtygroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHOLDERQTYGROUP(BigInteger value) {
        this.holderqtygroup = value;
    }

    /**
     * Recupera il valore della proprietà crs101COUNT.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCRS101COUNT() {
        return crs101COUNT;
    }

    /**
     * Imposta il valore della proprietà crs101COUNT.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCRS101COUNT(BigInteger value) {
        this.crs101COUNT = value;
    }

    /**
     * Recupera il valore della proprietà crs102COUNT.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCRS102COUNT() {
        return crs102COUNT;
    }

    /**
     * Imposta il valore della proprietà crs102COUNT.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCRS102COUNT(BigInteger value) {
        this.crs102COUNT = value;
    }

    /**
     * Recupera il valore della proprietà crs103COUNT.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCRS103COUNT() {
        return crs103COUNT;
    }

    /**
     * Imposta il valore della proprietà crs103COUNT.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCRS103COUNT(BigInteger value) {
        this.crs103COUNT = value;
    }

    /**
     * Recupera il valore della proprietà accountqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACCOUNTQTY() {
        return accountqty;
    }

    /**
     * Imposta il valore della proprietà accountqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACCOUNTQTY(BigInteger value) {
        this.accountqty = value;
    }

    /**
     * Recupera il valore della proprietà recordstotal.
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
     * Imposta il valore della proprietà recordstotal.
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
     * Recupera il valore della proprietà amountavgtotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTAVGTOTAL() {
        return amountavgtotal;
    }

    /**
     * Imposta il valore della proprietà amountavgtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTAVGTOTAL(BigDecimal value) {
        this.amountavgtotal = value;
    }

    /**
     * Recupera il valore della proprietà crs501AVGTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS501AVGTOTAL() {
        return crs501AVGTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs501AVGTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS501AVGTOTAL(BigDecimal value) {
        this.crs501AVGTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs502AVGTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS502AVGTOTAL() {
        return crs502AVGTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs502AVGTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS502AVGTOTAL(BigDecimal value) {
        this.crs502AVGTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs503AVGTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS503AVGTOTAL() {
        return crs503AVGTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs503AVGTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS503AVGTOTAL(BigDecimal value) {
        this.crs503AVGTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs504AVGTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS504AVGTOTAL() {
        return crs504AVGTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs504AVGTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS504AVGTOTAL(BigDecimal value) {
        this.crs504AVGTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà amountsumtotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTSUMTOTAL() {
        return amountsumtotal;
    }

    /**
     * Imposta il valore della proprietà amountsumtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTSUMTOTAL(BigDecimal value) {
        this.amountsumtotal = value;
    }

    /**
     * Recupera il valore della proprietà crs501SUMTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS501SUMTOTAL() {
        return crs501SUMTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs501SUMTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS501SUMTOTAL(BigDecimal value) {
        this.crs501SUMTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs502SUMTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS502SUMTOTAL() {
        return crs502SUMTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs502SUMTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS502SUMTOTAL(BigDecimal value) {
        this.crs502SUMTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs503SUMTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS503SUMTOTAL() {
        return crs503SUMTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs503SUMTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS503SUMTOTAL(BigDecimal value) {
        this.crs503SUMTOTAL = value;
    }

    /**
     * Recupera il valore della proprietà crs504SUMTOTAL.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRS504SUMTOTAL() {
        return crs504SUMTOTAL;
    }

    /**
     * Imposta il valore della proprietà crs504SUMTOTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRS504SUMTOTAL(BigDecimal value) {
        this.crs504SUMTOTAL = value;
    }

}
