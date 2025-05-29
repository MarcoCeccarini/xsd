//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the financial account information in tax matters for both Initial and Correction messages.
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
 *           &lt;element name="DAC2-100" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}DAC2-100_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="DAC2-200" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}DAC2-200_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="DAC2-300" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}DAC2-300_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="DAC2-400" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}DAC2-400_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="DAC2-500" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}DAC2-500_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dac2100",
    "dac2200",
    "dac2300",
    "dac2400",
    "dac2500"
})
public class RecordsTypeFA {

    @XmlElement(name = "DAC2-100")
    protected List<DAC2100Type> dac2100;
    @XmlElement(name = "DAC2-200")
    protected List<DAC2200Type> dac2200;
    @XmlElement(name = "DAC2-300")
    protected List<DAC2300Type> dac2300;
    @XmlElement(name = "DAC2-400")
    protected List<DAC2400Type> dac2400;
    @XmlElement(name = "DAC2-500")
    protected List<DAC2500Type> dac2500;

    /**
     * Gets the value of the dac2100 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac2100 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC2100().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC2100Type }
     * 
     * 
     */
    public List<DAC2100Type> getDAC2100() {
        if (dac2100 == null) {
            dac2100 = new ArrayList<DAC2100Type>();
        }
        return this.dac2100;
    }

    /**
     * Gets the value of the dac2200 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac2200 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC2200().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC2200Type }
     * 
     * 
     */
    public List<DAC2200Type> getDAC2200() {
        if (dac2200 == null) {
            dac2200 = new ArrayList<DAC2200Type>();
        }
        return this.dac2200;
    }

    /**
     * Gets the value of the dac2300 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac2300 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC2300().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC2300Type }
     * 
     * 
     */
    public List<DAC2300Type> getDAC2300() {
        if (dac2300 == null) {
            dac2300 = new ArrayList<DAC2300Type>();
        }
        return this.dac2300;
    }

    /**
     * Gets the value of the dac2400 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac2400 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC2400().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC2400Type }
     * 
     * 
     */
    public List<DAC2400Type> getDAC2400() {
        if (dac2400 == null) {
            dac2400 = new ArrayList<DAC2400Type>();
        }
        return this.dac2400;
    }

    /**
     * Gets the value of the dac2500 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac2500 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC2500().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC2500Type }
     * 
     * 
     */
    public List<DAC2500Type> getDAC2500() {
        if (dac2500 == null) {
            dac2500 = new ArrayList<DAC2500Type>();
        }
        return this.dac2500;
    }

}
