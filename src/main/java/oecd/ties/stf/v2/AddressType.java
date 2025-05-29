//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
//


package oecd.ties.stf.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			The user has the option to enter the data about the address of a party either as one long field or to spread the data over up to eight  elements or even to use both formats. If the user chooses the option to enter the data required in separate elements, the container element for this will be 'AddressFix'. If the user chooses the option to enter the data required in a less structured way in 'AddressFree' all available address details shall be presented as one string of bytes, blank or "/" (slash) or carriage return- line feed used as a delimiter between parts of the address. PLEASE NOTE that the address country code is outside  both of these elements. The use of the fixed form is recommended as a rule to allow easy matching. However, the use of the free form is recommended if the sending state cannot reliably identify and distinguish the different parts of the address. The user may want to use both formats e.g. if besides separating the logical parts of the address he also wants to indicate a suitable breakdown into print-lines by delimiters in the free text form. In this case 'AddressFix' has to precede 'AddressFree'.
 * 			
 * 
 * <p>Classe Java per Address_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{urn:oecd:ties:stf:v2}CountryCode_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AddressFix" type="{urn:oecd:ties:stf:v2}AddressFix_Type"/&gt;
 *             &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="legalAddressType" type="{urn:oecd:ties:stf:v2}legalAddressType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Type", propOrder = {
    "content"
})
public class AddressType {

    @XmlElementRefs({
        @XmlElementRef(name = "AddressFree", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CountryCode", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressFix", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "legalAddressType")
    protected LegalAddressTypeType legalAddressType;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "AddressFree" è usato da due diverse parti di uno schema. Vedere: 
     * riga 230 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stftypes-2.0.xsd
     * riga 227 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stftypes-2.0.xsd
     * <p>
     * Per eliminare questa proprietà, applicare una personalizzazione della proprietà a una 
     * delle seguenti due dichiarazioni per modificarne il nome: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Recupera il valore della proprietà legalAddressType.
     * 
     * @return
     *     possible object is
     *     {@link LegalAddressTypeType }
     *     
     */
    public LegalAddressTypeType getLegalAddressType() {
        return legalAddressType;
    }

    /**
     * Imposta il valore della proprietà legalAddressType.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalAddressTypeType }
     *     
     */
    public void setLegalAddressType(LegalAddressTypeType value) {
        this.legalAddressType = value;
    }

}
