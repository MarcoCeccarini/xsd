//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stf.v2.GenderType;


/**
 * <p>Classe Java per NaturalPerson_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NaturalPerson_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Birth" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Birth_Type"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ID" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}PersonId_Type" maxOccurs="unbounded"/&gt;
 *             &lt;element name="Birth" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Birth_Type" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Address" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Name_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ActingCapacity" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}Capacity_Type"/&gt;
 *         &lt;element name="Gender" type="{urn:oecd:ties:stf:v2}Gender_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type"/&gt;
 *         &lt;element name="NationalityCountryCode" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherPartyInfo" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}I18nString_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturalPerson_Type", propOrder = {
    "content"
})
public class NaturalPersonType {

    @XmlElementRefs({
        @XmlElementRef(name = "OtherPartyInfo", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Gender", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ResidenceCountryCode", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Birth", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Name", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ActingCapacity", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ID", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Address", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NationalityCountryCode", namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "Birth" è usato da due diverse parti di uno schema. Vedere: 
     * riga 300 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/commontypes_v2.xsd
     * riga 297 di file:/C:/Users/Marco/IBM/rationalsdp/workspace/xsd/src/main/resources/commontypes_v2.xsd
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
     * {@link JAXBElement }{@code <}{@link I18NStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BirthType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * {@link JAXBElement }{@code <}{@link CapacityType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
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

}
