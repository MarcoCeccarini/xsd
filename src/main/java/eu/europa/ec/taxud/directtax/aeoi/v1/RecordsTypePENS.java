//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:00 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the PEN category of income and capital.
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
 *           &lt;element name="PENS-110" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}PENS-110_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="PENS-120" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}PENS-120_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="PENS-130" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}PENS-130_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="PENS-140" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}PENS-140_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pens110",
    "pens120",
    "pens130",
    "pens140"
})
public class RecordsTypePENS {

    @XmlElement(name = "PENS-110")
    protected List<PENS110Type> pens110;
    @XmlElement(name = "PENS-120")
    protected List<PENS120Type> pens120;
    @XmlElement(name = "PENS-130")
    protected List<PENS130Type> pens130;
    @XmlElement(name = "PENS-140")
    protected List<PENS140Type> pens140;

    /**
     * Gets the value of the pens110 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pens110 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPENS110().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PENS110Type }
     * 
     * 
     */
    public List<PENS110Type> getPENS110() {
        if (pens110 == null) {
            pens110 = new ArrayList<PENS110Type>();
        }
        return this.pens110;
    }

    /**
     * Gets the value of the pens120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pens120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPENS120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PENS120Type }
     * 
     * 
     */
    public List<PENS120Type> getPENS120() {
        if (pens120 == null) {
            pens120 = new ArrayList<PENS120Type>();
        }
        return this.pens120;
    }

    /**
     * Gets the value of the pens130 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pens130 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPENS130().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PENS130Type }
     * 
     * 
     */
    public List<PENS130Type> getPENS130() {
        if (pens130 == null) {
            pens130 = new ArrayList<PENS130Type>();
        }
        return this.pens130;
    }

    /**
     * Gets the value of the pens140 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pens140 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPENS140().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PENS140Type }
     * 
     * 
     */
    public List<PENS140Type> getPENS140() {
        if (pens140 == null) {
            pens140 = new ArrayList<PENS140Type>();
        }
        return this.pens140;
    }

}
