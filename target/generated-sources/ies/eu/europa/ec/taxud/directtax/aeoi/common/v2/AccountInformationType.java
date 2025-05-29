//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per AccountInformation_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccountInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BAN" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}BankAccountNumber_Type" minOccurs="0"/&gt;
 *         &lt;element name="OtherAccountInformation" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SIN" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}SecuritiesIdentificationNumber_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInformation_Type", propOrder = {
    "ban",
    "otherAccountInformation",
    "sin"
})
public class AccountInformationType {

    @XmlElement(name = "BAN")
    protected BankAccountNumberType ban;
    @XmlElement(name = "OtherAccountInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> otherAccountInformation;
    @XmlElement(name = "SIN")
    protected SecuritiesIdentificationNumberType sin;

    /**
     * Recupera il valore della proprietà ban.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountNumberType }
     *     
     */
    public BankAccountNumberType getBAN() {
        return ban;
    }

    /**
     * Imposta il valore della proprietà ban.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountNumberType }
     *     
     */
    public void setBAN(BankAccountNumberType value) {
        this.ban = value;
    }

    /**
     * Gets the value of the otherAccountInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAccountInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAccountInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherAccountInformation() {
        if (otherAccountInformation == null) {
            otherAccountInformation = new ArrayList<String>();
        }
        return this.otherAccountInformation;
    }

    /**
     * Recupera il valore della proprietà sin.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesIdentificationNumberType }
     *     
     */
    public SecuritiesIdentificationNumberType getSIN() {
        return sin;
    }

    /**
     * Imposta il valore della proprietà sin.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesIdentificationNumberType }
     *     
     */
    public void setSIN(SecuritiesIdentificationNumberType value) {
        this.sin = value;
    }

}
