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
 * This type defines the statistics for DAC2-200 - Financial Institutions and Account statistics.
 * 
 * <p>Classe Java per DAC2-200_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DAC2-200_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SS_CODE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="REPORTING_PERIOD" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="FINANCIAL_INSTITUTION_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FINANCIAL_INSTITUTION_WITH_IN_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RECORDS_TOTAL" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "DAC2-200_Type", propOrder = {
    "sscode",
    "reportingperiod",
    "financialinstitutiontotal",
    "financialinstitutionwithintotal",
    "recordstotal",
    "amounttotal",
    "crs501TOTAL",
    "crs502TOTAL",
    "crs503TOTAL",
    "crs504TOTAL"
})
public class DAC2200Type {

    @XmlElement(name = "SS_CODE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sscode;
    @XmlElement(name = "REPORTING_PERIOD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingperiod;
    @XmlElement(name = "FINANCIAL_INSTITUTION_TOTAL", required = true)
    protected BigInteger financialinstitutiontotal;
    @XmlElement(name = "FINANCIAL_INSTITUTION_WITH_IN_TOTAL", required = true)
    protected BigInteger financialinstitutionwithintotal;
    @XmlElement(name = "RECORDS_TOTAL", required = true)
    protected BigInteger recordstotal;
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
     * Recupera il valore della proprietà financialinstitutiontotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFINANCIALINSTITUTIONTOTAL() {
        return financialinstitutiontotal;
    }

    /**
     * Imposta il valore della proprietà financialinstitutiontotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFINANCIALINSTITUTIONTOTAL(BigInteger value) {
        this.financialinstitutiontotal = value;
    }

    /**
     * Recupera il valore della proprietà financialinstitutionwithintotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFINANCIALINSTITUTIONWITHINTOTAL() {
        return financialinstitutionwithintotal;
    }

    /**
     * Imposta il valore della proprietà financialinstitutionwithintotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFINANCIALINSTITUTIONWITHINTOTAL(BigInteger value) {
        this.financialinstitutionwithintotal = value;
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
