//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package oecd.ties.stf.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			It may be desirable or even necessary to extend the information about a payment by including information about the account that was used for the payment and/or the security to which the payment relates. One or more such entries can be given in an element of this type. The element itself is optional unless stated otherwise for a particular document type, if it is present, however, it must not be empty. 
 * 			
 * 
 * <p>Classe Java per AcctInfo_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcctInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="IBAN" type="{urn:oecd:ties:stf:v2}IBAN_Type"/&gt;
 *           &lt;element name="OBAN" type="{urn:oecd:ties:stf:v2}OBAN_Type"/&gt;
 *           &lt;element name="ISIN" type="{urn:oecd:ties:stf:v2}ISIN_Type"/&gt;
 *           &lt;element name="OSIN" type="{urn:oecd:ties:stf:v2}OSIN_Type"/&gt;
 *           &lt;element name="SWIFT" type="{urn:oecd:ties:stf:v2}SWIFT_Type"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfo_Type", propOrder = {
    "ibanOrOBANOrISIN"
})
public class AcctInfoType {

    @XmlElementRefs({
        @XmlElementRef(name = "ISIN", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SWIFT", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OBAN", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OSIN", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IBAN", namespace = "urn:oecd:ties:stf:v2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> ibanOrOBANOrISIN;

    /**
     * Gets the value of the ibanOrOBANOrISIN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ibanOrOBANOrISIN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIBANOrOBANOrISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OBANType }{@code >}
     * {@link JAXBElement }{@code <}{@link OSINType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getIBANOrOBANOrISIN() {
        if (ibanOrOBANOrISIN == null) {
            ibanOrOBANOrISIN = new ArrayList<JAXBElement<?>>();
        }
        return this.ibanOrOBANOrISIN;
    }

}
