//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:02 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the Status Message.
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
 *           &lt;element name="STS-110" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}STS-110_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="STS-120" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}STS-120_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "sts110",
    "sts120"
})
public class RecordsTypeSTS {

    @XmlElement(name = "STS-110")
    protected List<STS110Type> sts110;
    @XmlElement(name = "STS-120")
    protected List<STS120Type> sts120;

    /**
     * Gets the value of the sts110 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts110 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTS110().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STS110Type }
     * 
     * 
     */
    public List<STS110Type> getSTS110() {
        if (sts110 == null) {
            sts110 = new ArrayList<STS110Type>();
        }
        return this.sts110;
    }

    /**
     * Gets the value of the sts120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTS120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STS120Type }
     * 
     * 
     */
    public List<STS120Type> getSTS120() {
        if (sts120 == null) {
            sts120 = new ArrayList<STS120Type>();
        }
        return this.sts120;
    }

}
