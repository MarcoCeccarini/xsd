//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:58 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Data (other than Name and Address) to describe and identify a party. Depending on the type of the party (individual or legal person) element 'IndivPersData' or element 'LegalPersData' must be used. 
 * 			
 * 
 * <p>Classe Java per PersData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IndivPersData" type="{urn:oecd:ties:stf:v2}IndivPersData_Type"/&gt;
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
     * Recupera il valore della propriet� indivPersData.
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
     * Imposta il valore della propriet� indivPersData.
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
     * Recupera il valore della propriet� legalPersData.
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
     * Imposta il valore della propriet� legalPersData.
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
