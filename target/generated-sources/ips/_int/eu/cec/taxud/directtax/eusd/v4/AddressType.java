//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

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
 * <p>Classe Java per Address_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{urn:cec.eu.int:taxud:directtax:v4}CountryCode_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AddressStruct" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}AddressStruct_Type"/&gt;
 *             &lt;element name="AddressFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="legalAddressType" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}legalAddressType_Type" /&gt;
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
        @XmlElementRef(name = "CountryCode", namespace = "urn:cec.eu.int:taxud:directtax:eusd:v4", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressStruct", namespace = "urn:cec.eu.int:taxud:directtax:eusd:v4", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressFree", namespace = "urn:cec.eu.int:taxud:directtax:eusd:v4", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "legalAddressType")
    protected String legalAddressType;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "AddressFree" è usato da due diverse parti di uno schema. Vedere: 
     * riga 351 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stfmodifiedtypes_v4.xsd
     * riga 348 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stfmodifiedtypes_v4.xsd
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
     * {@link JAXBElement }{@code <}{@link AddressStructType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
     *     {@link String }
     *     
     */
    public String getLegalAddressType() {
        return legalAddressType;
    }

    /**
     * Imposta il valore della proprietà legalAddressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAddressType(String value) {
        this.legalAddressType = value;
    }

}
