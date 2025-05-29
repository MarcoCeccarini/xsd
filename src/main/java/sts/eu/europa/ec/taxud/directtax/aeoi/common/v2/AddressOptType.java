//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

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
 * Alternative for Address_Type where all mandatory fields are optional. Used for Representatives, Counterparts and Administrators.
 * 
 * <p>Classe Java per AddressOpt_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressOpt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AddressStruct" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AddressStructOpt_Type"/&gt;
 *             &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="addressType" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}AddressType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressOpt_Type", propOrder = {
    "content"
})
public class AddressOptType {

    @XmlElementRefs({
        @XmlElementRef(name = "AddressFree", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressStruct", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CountryCode", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "addressType")
    protected AddressTypeType addressType;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "AddressFree" è usato da due diverse parti di uno schema. Vedere: 
     * riga 554 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/commontypes_v2.xsd
     * riga 551 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/commontypes_v2.xsd
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
     * {@link JAXBElement }{@code <}{@link AddressStructOptType }{@code >}
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
     * Recupera il valore della proprietà addressType.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeType }
     *     
     */
    public AddressTypeType getAddressType() {
        return addressType;
    }

    /**
     * Imposta il valore della proprietà addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeType }
     *     
     */
    public void setAddressType(AddressTypeType value) {
        this.addressType = value;
    }

}
