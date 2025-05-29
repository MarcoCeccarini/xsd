//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the IE category of income and capital.
 * 
 * <p>Classe Java per Records_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Records_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="IES-110" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IES-110_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IES-120" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IES-120_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IES-130" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IES-130_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Records_Type", propOrder = {
    "ies110",
    "ies120",
    "ies130"
})
public class RecordsTypeIES {

    @XmlElement(name = "IES-110")
    protected List<IES110Type> ies110;
    @XmlElement(name = "IES-120")
    protected List<IES120Type> ies120;
    @XmlElement(name = "IES-130")
    protected List<IES130Type> ies130;

    /**
     * Gets the value of the ies110 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ies110 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIES110().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IES110Type }
     * 
     * 
     */
    public List<IES110Type> getIES110() {
        if (ies110 == null) {
            ies110 = new ArrayList<IES110Type>();
        }
        return this.ies110;
    }

    /**
     * Gets the value of the ies120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ies120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIES120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IES120Type }
     * 
     * 
     */
    public List<IES120Type> getIES120() {
        if (ies120 == null) {
            ies120 = new ArrayList<IES120Type>();
        }
        return this.ies120;
    }

    /**
     * Gets the value of the ies130 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ies130 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIES130().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IES130Type }
     * 
     * 
     */
    public List<IES130Type> getIES130() {
        if (ies130 == null) {
            ies130 = new ArrayList<IES130Type>();
        }
        return this.ies130;
    }

}
