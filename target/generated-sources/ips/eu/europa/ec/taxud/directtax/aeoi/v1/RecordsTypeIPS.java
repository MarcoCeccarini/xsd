//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:46:47 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines the statistics related to the IP category of income and capital.
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
 *           &lt;element name="IPS-110" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-110_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-120" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-120_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-130" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-130_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-140" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-140_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-150" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-150_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-160" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-160_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="IPS-170" type="{urn:ec.europa.eu:taxud:directtax:aeoi:v1}IPS-170_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "ips110",
    "ips120",
    "ips130",
    "ips140",
    "ips150",
    "ips160",
    "ips170"
})
public class RecordsTypeIPS {

    @XmlElement(name = "IPS-110")
    protected List<IPS110Type> ips110;
    @XmlElement(name = "IPS-120")
    protected List<IPS120Type> ips120;
    @XmlElement(name = "IPS-130")
    protected List<IPS130Type> ips130;
    @XmlElement(name = "IPS-140")
    protected List<IPS140Type> ips140;
    @XmlElement(name = "IPS-150")
    protected List<IPS150Type> ips150;
    @XmlElement(name = "IPS-160")
    protected List<IPS160Type> ips160;
    @XmlElement(name = "IPS-170")
    protected List<IPS170Type> ips170;

    /**
     * Gets the value of the ips110 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips110 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS110().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS110Type }
     * 
     * 
     */
    public List<IPS110Type> getIPS110() {
        if (ips110 == null) {
            ips110 = new ArrayList<IPS110Type>();
        }
        return this.ips110;
    }

    /**
     * Gets the value of the ips120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS120Type }
     * 
     * 
     */
    public List<IPS120Type> getIPS120() {
        if (ips120 == null) {
            ips120 = new ArrayList<IPS120Type>();
        }
        return this.ips120;
    }

    /**
     * Gets the value of the ips130 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips130 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS130().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS130Type }
     * 
     * 
     */
    public List<IPS130Type> getIPS130() {
        if (ips130 == null) {
            ips130 = new ArrayList<IPS130Type>();
        }
        return this.ips130;
    }

    /**
     * Gets the value of the ips140 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips140 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS140().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS140Type }
     * 
     * 
     */
    public List<IPS140Type> getIPS140() {
        if (ips140 == null) {
            ips140 = new ArrayList<IPS140Type>();
        }
        return this.ips140;
    }

    /**
     * Gets the value of the ips150 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips150 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS150().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS150Type }
     * 
     * 
     */
    public List<IPS150Type> getIPS150() {
        if (ips150 == null) {
            ips150 = new ArrayList<IPS150Type>();
        }
        return this.ips150;
    }

    /**
     * Gets the value of the ips160 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips160 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS160().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS160Type }
     * 
     * 
     */
    public List<IPS160Type> getIPS160() {
        if (ips160 == null) {
            ips160 = new ArrayList<IPS160Type>();
        }
        return this.ips160;
    }

    /**
     * Gets the value of the ips170 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ips170 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPS170().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPS170Type }
     * 
     * 
     */
    public List<IPS170Type> getIPS170() {
        if (ips170 == null) {
            ips170 = new ArrayList<IPS170Type>();
        }
        return this.ips170;
    }

}
