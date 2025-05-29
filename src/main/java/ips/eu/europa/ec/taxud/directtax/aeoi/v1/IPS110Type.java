//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
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


/**
 * This type defines the statistics for IPS-110 - Party Overall Statistics.
 * 
 * <p>Classe Java per IPS-110_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IPS-110_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MSG_REF" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="MSG_DATE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_DESTINATION_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_TYPE_INDIC" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common_statistics:v2}MsgTypeIndic_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdIP_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="IS_NP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PERSON_ID_TIN_IS_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_TIN_ISNT_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_IS_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_SSN_ISNT_RR" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_VAT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_OTHER" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ID_NO_TYPE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_NAME_STRUCT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_NAME_FREE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_BIRTH_DATE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ADDRESS_STRUCT" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PERSON_ADDRESS_FREE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PARTY_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OWNERSHIP_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OWNERSHIP_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TRANSACTION_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TRANSACTION_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TRANSACTION_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="LOAN_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="LOAN_EVENT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_EVENT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_EVENT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="LOAN_COLLATERAL_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_COLLATERAL_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LOAN_COLLATERAL_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="INCOME_RIGHT_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INCOME_RIGHT_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INCOME_RIGHT_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *         &lt;element name="INCOME_PARTY_GROUP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INCOME_PARTY_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INCOME_PARTY_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPS-110_Type", propOrder = {
    "msgid",
    "msgref",
    "msgdate",
    "msgoriginatingcountry",
    "msgdestinationcountry",
    "msgtypeindic",
    "msgapplicationid",
    "msgtaxyear",
    "isnp",
    "personidtinisrr",
    "personidtinisntrr",
    "personidssnisrr",
    "personidssnisntrr",
    "personidvat",
    "personidother",
    "personidnotype",
    "personnamestruct",
    "personnamefree",
    "personbirthdate",
    "personaddressstruct",
    "personaddressfree",
    "partyqty",
    "ownershipgroup",
    "ownershipqty",
    "transactiongroup",
    "transactionqty",
    "transactioneur",
    "loangroup",
    "loanqty",
    "loaneur",
    "loaneventgroup",
    "loaneventqty",
    "loaneventeur",
    "loancollateralgroup",
    "loancollateralqty",
    "loancollateraleur",
    "incomerightgroup",
    "incomerightqty",
    "incomerighteur",
    "incomepartygroup",
    "incomepartyqty",
    "incomepartyeur"
})
public class IPS110Type {

    @XmlElement(name = "MSG_ID", required = true)
    protected BigInteger msgid;
    @XmlElement(name = "MSG_REF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgref;
    @XmlElement(name = "MSG_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgdate;
    @XmlElement(name = "MSG_ORIGINATING_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgoriginatingcountry;
    @XmlElement(name = "MSG_DESTINATION_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgdestinationcountry;
    @XmlElement(name = "MSG_TYPE_INDIC", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgtypeindic;
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdIPType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "IS_NP")
    protected boolean isnp;
    @XmlElement(name = "PERSON_ID_TIN_IS_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisrr;
    @XmlElement(name = "PERSON_ID_TIN_ISNT_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidtinisntrr;
    @XmlElement(name = "PERSON_ID_SSN_IS_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisrr;
    @XmlElement(name = "PERSON_ID_SSN_ISNT_RR", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidssnisntrr;
    @XmlElement(name = "PERSON_ID_VAT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidvat;
    @XmlElement(name = "PERSON_ID_OTHER", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidother;
    @XmlElement(name = "PERSON_ID_NO_TYPE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personidnotype;
    @XmlElement(name = "PERSON_NAME_STRUCT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personnamestruct;
    @XmlElement(name = "PERSON_NAME_FREE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personnamefree;
    @XmlElement(name = "PERSON_BIRTH_DATE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personbirthdate;
    @XmlElement(name = "PERSON_ADDRESS_STRUCT", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personaddressstruct;
    @XmlElement(name = "PERSON_ADDRESS_FREE", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger personaddressfree;
    @XmlElement(name = "PARTY_QTY", required = true)
    protected BigInteger partyqty;
    @XmlElement(name = "OWNERSHIP_GROUP", required = true)
    protected BigInteger ownershipgroup;
    @XmlElement(name = "OWNERSHIP_QTY", required = true)
    protected BigInteger ownershipqty;
    @XmlElement(name = "TRANSACTION_GROUP", required = true)
    protected BigInteger transactiongroup;
    @XmlElement(name = "TRANSACTION_QTY", required = true)
    protected BigInteger transactionqty;
    @XmlElement(name = "TRANSACTION_EUR", required = true)
    protected BigDecimal transactioneur;
    @XmlElement(name = "LOAN_GROUP", required = true)
    protected BigInteger loangroup;
    @XmlElement(name = "LOAN_QTY", required = true)
    protected BigInteger loanqty;
    @XmlElement(name = "LOAN_EUR", required = true)
    protected BigDecimal loaneur;
    @XmlElement(name = "LOAN_EVENT_GROUP", required = true)
    protected BigInteger loaneventgroup;
    @XmlElement(name = "LOAN_EVENT_QTY", required = true)
    protected BigInteger loaneventqty;
    @XmlElement(name = "LOAN_EVENT_EUR", required = true)
    protected BigDecimal loaneventeur;
    @XmlElement(name = "LOAN_COLLATERAL_GROUP", required = true)
    protected BigInteger loancollateralgroup;
    @XmlElement(name = "LOAN_COLLATERAL_QTY", required = true)
    protected BigInteger loancollateralqty;
    @XmlElement(name = "LOAN_COLLATERAL_EUR", required = true)
    protected BigDecimal loancollateraleur;
    @XmlElement(name = "INCOME_RIGHT_GROUP", required = true)
    protected BigInteger incomerightgroup;
    @XmlElement(name = "INCOME_RIGHT_QTY", required = true)
    protected BigInteger incomerightqty;
    @XmlElement(name = "INCOME_RIGHT_EUR", required = true)
    protected BigDecimal incomerighteur;
    @XmlElement(name = "INCOME_PARTY_GROUP", required = true)
    protected BigInteger incomepartygroup;
    @XmlElement(name = "INCOME_PARTY_QTY", required = true)
    protected BigInteger incomepartyqty;
    @XmlElement(name = "INCOME_PARTY_EUR", required = true)
    protected BigDecimal incomepartyeur;

    /**
     * Recupera il valore della proprietà msgid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMSGID() {
        return msgid;
    }

    /**
     * Imposta il valore della proprietà msgid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMSGID(BigInteger value) {
        this.msgid = value;
    }

    /**
     * Recupera il valore della proprietà msgref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGREF() {
        return msgref;
    }

    /**
     * Imposta il valore della proprietà msgref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGREF(String value) {
        this.msgref = value;
    }

    /**
     * Recupera il valore della proprietà msgdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGDATE() {
        return msgdate;
    }

    /**
     * Imposta il valore della proprietà msgdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGDATE(XMLGregorianCalendar value) {
        this.msgdate = value;
    }

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
     * Recupera il valore della proprietà msgdestinationcountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGDESTINATIONCOUNTRY() {
        return msgdestinationcountry;
    }

    /**
     * Imposta il valore della proprietà msgdestinationcountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGDESTINATIONCOUNTRY(String value) {
        this.msgdestinationcountry = value;
    }

    /**
     * Recupera il valore della proprietà msgtypeindic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTYPEINDIC() {
        return msgtypeindic;
    }

    /**
     * Imposta il valore della proprietà msgtypeindic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTYPEINDIC(String value) {
        this.msgtypeindic = value;
    }

    /**
     * Recupera il valore della proprietà msgapplicationid.
     * 
     * @return
     *     possible object is
     *     {@link MsgApplicationIdIPType }
     *     
     */
    public MsgApplicationIdIPType getMSGAPPLICATIONID() {
        return msgapplicationid;
    }

    /**
     * Imposta il valore della proprietà msgapplicationid.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgApplicationIdIPType }
     *     
     */
    public void setMSGAPPLICATIONID(MsgApplicationIdIPType value) {
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
     * Recupera il valore della proprietà personidtinisrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISRR() {
        return personidtinisrr;
    }

    /**
     * Imposta il valore della proprietà personidtinisrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISRR(BigInteger value) {
        this.personidtinisrr = value;
    }

    /**
     * Recupera il valore della proprietà personidtinisntrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDTINISNTRR() {
        return personidtinisntrr;
    }

    /**
     * Imposta il valore della proprietà personidtinisntrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDTINISNTRR(BigInteger value) {
        this.personidtinisntrr = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISRR() {
        return personidssnisrr;
    }

    /**
     * Imposta il valore della proprietà personidssnisrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISRR(BigInteger value) {
        this.personidssnisrr = value;
    }

    /**
     * Recupera il valore della proprietà personidssnisntrr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONIDSSNISNTRR() {
        return personidssnisntrr;
    }

    /**
     * Imposta il valore della proprietà personidssnisntrr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONIDSSNISNTRR(BigInteger value) {
        this.personidssnisntrr = value;
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
     * Recupera il valore della proprietà personnamestruct.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONNAMESTRUCT() {
        return personnamestruct;
    }

    /**
     * Imposta il valore della proprietà personnamestruct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONNAMESTRUCT(BigInteger value) {
        this.personnamestruct = value;
    }

    /**
     * Recupera il valore della proprietà personnamefree.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONNAMEFREE() {
        return personnamefree;
    }

    /**
     * Imposta il valore della proprietà personnamefree.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONNAMEFREE(BigInteger value) {
        this.personnamefree = value;
    }

    /**
     * Recupera il valore della proprietà personbirthdate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONBIRTHDATE() {
        return personbirthdate;
    }

    /**
     * Imposta il valore della proprietà personbirthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONBIRTHDATE(BigInteger value) {
        this.personbirthdate = value;
    }

    /**
     * Recupera il valore della proprietà personaddressstruct.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONADDRESSSTRUCT() {
        return personaddressstruct;
    }

    /**
     * Imposta il valore della proprietà personaddressstruct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONADDRESSSTRUCT(BigInteger value) {
        this.personaddressstruct = value;
    }

    /**
     * Recupera il valore della proprietà personaddressfree.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERSONADDRESSFREE() {
        return personaddressfree;
    }

    /**
     * Imposta il valore della proprietà personaddressfree.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERSONADDRESSFREE(BigInteger value) {
        this.personaddressfree = value;
    }

    /**
     * Recupera il valore della proprietà partyqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPARTYQTY() {
        return partyqty;
    }

    /**
     * Imposta il valore della proprietà partyqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPARTYQTY(BigInteger value) {
        this.partyqty = value;
    }

    /**
     * Recupera il valore della proprietà ownershipgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOWNERSHIPGROUP() {
        return ownershipgroup;
    }

    /**
     * Imposta il valore della proprietà ownershipgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOWNERSHIPGROUP(BigInteger value) {
        this.ownershipgroup = value;
    }

    /**
     * Recupera il valore della proprietà ownershipqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOWNERSHIPQTY() {
        return ownershipqty;
    }

    /**
     * Imposta il valore della proprietà ownershipqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOWNERSHIPQTY(BigInteger value) {
        this.ownershipqty = value;
    }

    /**
     * Recupera il valore della proprietà transactiongroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRANSACTIONGROUP() {
        return transactiongroup;
    }

    /**
     * Imposta il valore della proprietà transactiongroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRANSACTIONGROUP(BigInteger value) {
        this.transactiongroup = value;
    }

    /**
     * Recupera il valore della proprietà transactionqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRANSACTIONQTY() {
        return transactionqty;
    }

    /**
     * Imposta il valore della proprietà transactionqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRANSACTIONQTY(BigInteger value) {
        this.transactionqty = value;
    }

    /**
     * Recupera il valore della proprietà transactioneur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTRANSACTIONEUR() {
        return transactioneur;
    }

    /**
     * Imposta il valore della proprietà transactioneur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTRANSACTIONEUR(BigDecimal value) {
        this.transactioneur = value;
    }

    /**
     * Recupera il valore della proprietà loangroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANGROUP() {
        return loangroup;
    }

    /**
     * Imposta il valore della proprietà loangroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANGROUP(BigInteger value) {
        this.loangroup = value;
    }

    /**
     * Recupera il valore della proprietà loanqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANQTY() {
        return loanqty;
    }

    /**
     * Imposta il valore della proprietà loanqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANQTY(BigInteger value) {
        this.loanqty = value;
    }

    /**
     * Recupera il valore della proprietà loaneur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOANEUR() {
        return loaneur;
    }

    /**
     * Imposta il valore della proprietà loaneur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOANEUR(BigDecimal value) {
        this.loaneur = value;
    }

    /**
     * Recupera il valore della proprietà loaneventgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANEVENTGROUP() {
        return loaneventgroup;
    }

    /**
     * Imposta il valore della proprietà loaneventgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANEVENTGROUP(BigInteger value) {
        this.loaneventgroup = value;
    }

    /**
     * Recupera il valore della proprietà loaneventqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANEVENTQTY() {
        return loaneventqty;
    }

    /**
     * Imposta il valore della proprietà loaneventqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANEVENTQTY(BigInteger value) {
        this.loaneventqty = value;
    }

    /**
     * Recupera il valore della proprietà loaneventeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOANEVENTEUR() {
        return loaneventeur;
    }

    /**
     * Imposta il valore della proprietà loaneventeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOANEVENTEUR(BigDecimal value) {
        this.loaneventeur = value;
    }

    /**
     * Recupera il valore della proprietà loancollateralgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANCOLLATERALGROUP() {
        return loancollateralgroup;
    }

    /**
     * Imposta il valore della proprietà loancollateralgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANCOLLATERALGROUP(BigInteger value) {
        this.loancollateralgroup = value;
    }

    /**
     * Recupera il valore della proprietà loancollateralqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOANCOLLATERALQTY() {
        return loancollateralqty;
    }

    /**
     * Imposta il valore della proprietà loancollateralqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOANCOLLATERALQTY(BigInteger value) {
        this.loancollateralqty = value;
    }

    /**
     * Recupera il valore della proprietà loancollateraleur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOANCOLLATERALEUR() {
        return loancollateraleur;
    }

    /**
     * Imposta il valore della proprietà loancollateraleur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOANCOLLATERALEUR(BigDecimal value) {
        this.loancollateraleur = value;
    }

    /**
     * Recupera il valore della proprietà incomerightgroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINCOMERIGHTGROUP() {
        return incomerightgroup;
    }

    /**
     * Imposta il valore della proprietà incomerightgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINCOMERIGHTGROUP(BigInteger value) {
        this.incomerightgroup = value;
    }

    /**
     * Recupera il valore della proprietà incomerightqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINCOMERIGHTQTY() {
        return incomerightqty;
    }

    /**
     * Imposta il valore della proprietà incomerightqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINCOMERIGHTQTY(BigInteger value) {
        this.incomerightqty = value;
    }

    /**
     * Recupera il valore della proprietà incomerighteur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINCOMERIGHTEUR() {
        return incomerighteur;
    }

    /**
     * Imposta il valore della proprietà incomerighteur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINCOMERIGHTEUR(BigDecimal value) {
        this.incomerighteur = value;
    }

    /**
     * Recupera il valore della proprietà incomepartygroup.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINCOMEPARTYGROUP() {
        return incomepartygroup;
    }

    /**
     * Imposta il valore della proprietà incomepartygroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINCOMEPARTYGROUP(BigInteger value) {
        this.incomepartygroup = value;
    }

    /**
     * Recupera il valore della proprietà incomepartyqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINCOMEPARTYQTY() {
        return incomepartyqty;
    }

    /**
     * Imposta il valore della proprietà incomepartyqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINCOMEPARTYQTY(BigInteger value) {
        this.incomepartyqty = value;
    }

    /**
     * Recupera il valore della proprietà incomepartyeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINCOMEPARTYEUR() {
        return incomepartyeur;
    }

    /**
     * Imposta il valore della proprietà incomepartyeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINCOMEPARTYEUR(BigDecimal value) {
        this.incomepartyeur = value;
    }

}
