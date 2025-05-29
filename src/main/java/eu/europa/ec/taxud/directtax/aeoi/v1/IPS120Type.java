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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type defines the statistics for IPS-120 - Property Quantity and Value Statistics.
 * 
 * <p>Classe Java per IPS-120_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IPS-120_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSG_ORIGINATING_COUNTRY" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="MSG_APPLICATION_ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}MsgApplicationIdIP_Type"/&gt;
 *         &lt;element name="MSG_TAX_YEAR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}DateYearMonthDay_Type"/&gt;
 *         &lt;element name="IP_TYPE" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPType_Type"/&gt;
 *         &lt;element name="NATURE_EXIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SIZE_EXIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VALUE_EXIST" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PROPERTY_QTY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PROPERTY_EUR" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AmountValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPS-120_Type", propOrder = {
    "msgoriginatingcountry",
    "msgapplicationid",
    "msgtaxyear",
    "iptype",
    "natureexist",
    "sizeexist",
    "valueexist",
    "propertyqty",
    "propertyeur"
})
public class IPS120Type {

    @XmlElement(name = "MSG_ORIGINATING_COUNTRY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String msgoriginatingcountry;
    @XmlElement(name = "MSG_APPLICATION_ID", required = true)
    @XmlSchemaType(name = "token")
    protected MsgApplicationIdIPType msgapplicationid;
    @XmlElement(name = "MSG_TAX_YEAR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgtaxyear;
    @XmlElement(name = "IP_TYPE", required = true)
    @XmlSchemaType(name = "token")
    protected IPTypeType iptype;
    @XmlElement(name = "NATURE_EXIST")
    protected boolean natureexist;
    @XmlElement(name = "SIZE_EXIST")
    protected boolean sizeexist;
    @XmlElement(name = "VALUE_EXIST")
    protected boolean valueexist;
    @XmlElement(name = "PROPERTY_QTY", required = true)
    protected BigInteger propertyqty;
    @XmlElement(name = "PROPERTY_EUR", required = true)
    protected BigDecimal propertyeur;

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
     * Recupera il valore della proprietà iptype.
     * 
     * @return
     *     possible object is
     *     {@link IPTypeType }
     *     
     */
    public IPTypeType getIPTYPE() {
        return iptype;
    }

    /**
     * Imposta il valore della proprietà iptype.
     * 
     * @param value
     *     allowed object is
     *     {@link IPTypeType }
     *     
     */
    public void setIPTYPE(IPTypeType value) {
        this.iptype = value;
    }

    /**
     * Recupera il valore della proprietà natureexist.
     * 
     */
    public boolean isNATUREEXIST() {
        return natureexist;
    }

    /**
     * Imposta il valore della proprietà natureexist.
     * 
     */
    public void setNATUREEXIST(boolean value) {
        this.natureexist = value;
    }

    /**
     * Recupera il valore della proprietà sizeexist.
     * 
     */
    public boolean isSIZEEXIST() {
        return sizeexist;
    }

    /**
     * Imposta il valore della proprietà sizeexist.
     * 
     */
    public void setSIZEEXIST(boolean value) {
        this.sizeexist = value;
    }

    /**
     * Recupera il valore della proprietà valueexist.
     * 
     */
    public boolean isVALUEEXIST() {
        return valueexist;
    }

    /**
     * Imposta il valore della proprietà valueexist.
     * 
     */
    public void setVALUEEXIST(boolean value) {
        this.valueexist = value;
    }

    /**
     * Recupera il valore della proprietà propertyqty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPROPERTYQTY() {
        return propertyqty;
    }

    /**
     * Imposta il valore della proprietà propertyqty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPROPERTYQTY(BigInteger value) {
        this.propertyqty = value;
    }

    /**
     * Recupera il valore della proprietà propertyeur.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPROPERTYEUR() {
        return propertyeur;
    }

    /**
     * Imposta il valore della proprietà propertyeur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPROPERTYEUR(BigDecimal value) {
        this.propertyeur = value;
    }

}
