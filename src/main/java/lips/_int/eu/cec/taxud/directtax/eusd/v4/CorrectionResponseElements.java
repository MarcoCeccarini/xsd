//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:cec.eu.int:taxud:directtax:eusd:v4}RequestRejection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectedElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestRejection",
    "correctedElement"
})
@XmlRootElement(name = "CorrectionResponseElements")
public class CorrectionResponseElements {

    @XmlElement(name = "RequestRejection")
    protected List<RequestRejectionType> requestRejection;
    @XmlElement(name = "CorrectedElement")
    protected List<CorrectedElement> correctedElement;

    /**
     * Gets the value of the requestRejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestRejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestRejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestRejectionType }
     * 
     * 
     */
    public List<RequestRejectionType> getRequestRejection() {
        if (requestRejection == null) {
            requestRejection = new ArrayList<RequestRejectionType>();
        }
        return this.requestRejection;
    }

    /**
     * Gets the value of the correctedElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectedElement }
     * 
     * 
     */
    public List<CorrectedElement> getCorrectedElement() {
        if (correctedElement == null) {
            correctedElement = new ArrayList<CorrectedElement>();
        }
        return this.correctedElement;
    }

}
