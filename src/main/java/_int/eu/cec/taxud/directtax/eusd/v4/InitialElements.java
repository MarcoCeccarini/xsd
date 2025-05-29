//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:55 AM CEST 
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
 *         &lt;element name="Article4_2" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}EntityInfo_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Article9" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}Article9_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "article42",
    "article9"
})
@XmlRootElement(name = "InitialElements")
public class InitialElements {

    @XmlElement(name = "Article4_2")
    protected List<EntityInfoType> article42;
    @XmlElement(name = "Article9")
    protected List<Article9Type> article9;

    /**
     * Gets the value of the article42 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the article42 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticle42().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityInfoType }
     * 
     * 
     */
    public List<EntityInfoType> getArticle42() {
        if (article42 == null) {
            article42 = new ArrayList<EntityInfoType>();
        }
        return this.article42;
    }

    /**
     * Gets the value of the article9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the article9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticle9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Article9Type }
     * 
     * 
     */
    public List<Article9Type> getArticle9() {
        if (article9 == null) {
            article9 = new ArrayList<Article9Type>();
        }
        return this.article9;
    }

}
