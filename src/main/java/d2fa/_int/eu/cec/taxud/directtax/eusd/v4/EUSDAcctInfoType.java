//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stf.v2.OBANType;
import oecd.ties.stf.v2.OSINType;


/**
 * <p>Classe Java per EUSDAcctInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EUSDAcctInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;choice&gt;
 *               &lt;element name="IBAN" type="{urn:oecd:ties:stf:v2}IBAN_Type"/&gt;
 *               &lt;element name="OBAN" type="{urn:oecd:ties:stf:v2}OBAN_Type"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element name="SWIFT" type="{urn:oecd:ties:stf:v2}SWIFT_Type" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="ISIN" type="{urn:oecd:ties:stf:v2}ISIN_Type"/&gt;
 *           &lt;element name="OSIN" type="{urn:oecd:ties:stf:v2}OSIN_Type"/&gt;
 *           &lt;element name="Other" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Other_Type"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="shared" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}shared_Type" default="unknown_if_shared" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EUSDAcctInfo_Type", propOrder = {
    "iban",
    "oban",
    "swift",
    "isin",
    "osin",
    "other"
})
public class EUSDAcctInfoType {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "OBAN")
    protected OBANType oban;
    @XmlElement(name = "SWIFT")
    protected String swift;
    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "OSIN")
    protected OSINType osin;
    @XmlElement(name = "Other")
    protected OtherType other;
    @XmlAttribute(name = "shared")
    protected SharedType shared;

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietà oban.
     * 
     * @return
     *     possible object is
     *     {@link OBANType }
     *     
     */
    public OBANType getOBAN() {
        return oban;
    }

    /**
     * Imposta il valore della proprietà oban.
     * 
     * @param value
     *     allowed object is
     *     {@link OBANType }
     *     
     */
    public void setOBAN(OBANType value) {
        this.oban = value;
    }

    /**
     * Recupera il valore della proprietà swift.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFT() {
        return swift;
    }

    /**
     * Imposta il valore della proprietà swift.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFT(String value) {
        this.swift = value;
    }

    /**
     * Recupera il valore della proprietà isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Imposta il valore della proprietà isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Recupera il valore della proprietà osin.
     * 
     * @return
     *     possible object is
     *     {@link OSINType }
     *     
     */
    public OSINType getOSIN() {
        return osin;
    }

    /**
     * Imposta il valore della proprietà osin.
     * 
     * @param value
     *     allowed object is
     *     {@link OSINType }
     *     
     */
    public void setOSIN(OSINType value) {
        this.osin = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link OtherType }
     *     
     */
    public OtherType getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType }
     *     
     */
    public void setOther(OtherType value) {
        this.other = value;
    }

    /**
     * Recupera il valore della proprietà shared.
     * 
     * @return
     *     possible object is
     *     {@link SharedType }
     *     
     */
    public SharedType getShared() {
        if (shared == null) {
            return SharedType.UNKNOWN_IF_SHARED;
        } else {
            return shared;
        }
    }

    /**
     * Imposta il valore della proprietà shared.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedType }
     *     
     */
    public void setShared(SharedType value) {
        this.shared = value;
    }

}
