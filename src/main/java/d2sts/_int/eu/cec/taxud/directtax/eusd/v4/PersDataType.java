//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oecd.ties.stf.v2.LegalPersDataType;


/**
 * <p>Classe Java per PersData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IndivPersData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}IndivPersData_Type"/&gt;
 *         &lt;element name="LegalPersData" type="{urn:oecd:ties:stf:v2}LegalPersData_Type"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersData_Type", propOrder = {
    "indivPersData",
    "legalPersData"
})
public class PersDataType {

    @XmlElement(name = "IndivPersData")
    protected IndivPersDataType indivPersData;
    @XmlElement(name = "LegalPersData")
    protected LegalPersDataType legalPersData;

    /**
     * Recupera il valore della proprietà indivPersData.
     * 
     * @return
     *     possible object is
     *     {@link IndivPersDataType }
     *     
     */
    public IndivPersDataType getIndivPersData() {
        return indivPersData;
    }

    /**
     * Imposta il valore della proprietà indivPersData.
     * 
     * @param value
     *     allowed object is
     *     {@link IndivPersDataType }
     *     
     */
    public void setIndivPersData(IndivPersDataType value) {
        this.indivPersData = value;
    }

    /**
     * Recupera il valore della proprietà legalPersData.
     * 
     * @return
     *     possible object is
     *     {@link LegalPersDataType }
     *     
     */
    public LegalPersDataType getLegalPersData() {
        return legalPersData;
    }

    /**
     * Imposta il valore della proprietà legalPersData.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalPersDataType }
     *     
     */
    public void setLegalPersData(LegalPersDataType value) {
        this.legalPersData = value;
    }

}
