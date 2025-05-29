//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 07:08:57 PM CEST 
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
 * 			The user has the option to enter the data about the name of a party either as one long field or to spread the data over up to six elements or even to use both formats. If the user chooses the option to enter the data required in separate elements, the container element for this will be 'NameFix'. If the user chooses the option to enter the data required in a less structured way in 'NameFree' all available details on the name of the party shall be presented as one string of bytes, blank or "/" (slash) used as a delimiter between parts of the name.  The use of the fixed form is recommended as a rule to allow easy matching. However, the use of the free form is recommended if the sending state cannot reliably identify and distinguish the different parts of the name. The user may want to use both formats in special circumstances. In this case 'NameFix' has to precede 'NameFree'.
 * An optional attribute 'nameType' can be used to indicate a special kind of name, as for instance a nickname, a name-at-birth etc. 
 * 			
 * 
 * <p>Classe Java per Name_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Name_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NameFree" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="NameFix" type="{urn:oecd:ties:stf:v2}NameFix_Type"/&gt;
 *           &lt;element name="NameFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="nameType" type="{urn:oecd:ties:stf:v2}nameType_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name_Type", propOrder = {
    "content"
})
public class NameType {

    @XmlElementRefs({
        @XmlElementRef(name = "NameFree", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NameFix", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "nameType")
    protected NameTypeType nameType;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "NameFree" è usato da due diverse parti di uno schema. Vedere: 
     * riga 464 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stftypes-2.0.xsd
     * riga 461 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/stftypes-2.0.xsd
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
     * {@link JAXBElement }{@code <}{@link NameFixType }{@code >}
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
     * Recupera il valore della proprietà nameType.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeType }
     *     
     */
    public NameTypeType getNameType() {
        return nameType;
    }

    /**
     * Imposta il valore della proprietà nameType.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeType }
     *     
     */
    public void setNameType(NameTypeType value) {
        this.nameType = value;
    }

}
