//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the LIP category of income and capital.
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
 *         &lt;element name="LIPS-110" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}LIPS-110_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIPS-120" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}LIPS-120_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "lips110",
    "lips120"
})
public class RecordsTypeLIPS {

    @XmlElement(name = "LIPS-110")
    protected List<LIPS110Type> lips110;
    @XmlElement(name = "LIPS-120")
    protected List<LIPS120Type> lips120;

    /**
     * Gets the value of the lips110 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lips110 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIPS110().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIPS110Type }
     * 
     * 
     */
    public List<LIPS110Type> getLIPS110() {
        if (lips110 == null) {
            lips110 = new ArrayList<LIPS110Type>();
        }
        return this.lips110;
    }

    /**
     * Gets the value of the lips120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lips120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIPS120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIPS120Type }
     * 
     * 
     */
    public List<LIPS120Type> getLIPS120() {
        if (lips120 == null) {
            lips120 = new ArrayList<LIPS120Type>();
        }
        return this.lips120;
    }

}
