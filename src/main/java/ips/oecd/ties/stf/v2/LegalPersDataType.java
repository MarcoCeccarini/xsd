//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:09:57 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 			Data (other than Name and Address) to describe and identify a legal entity. Currently the foundation date is the only subelement. It is defined as required inside 'LegalPersData_Type', as an empty element should not appear in the document. However, the  element containing LegalPersData is optional. 'FoundDate' is of type date, that is in the  form ccyy-mm-dd.
 * 			
 * 
 * <p>Classe Java per LegalPersData_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LegalPersData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FoundDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalPersData_Type", propOrder = {
    "foundDate"
})
public class LegalPersDataType {

    @XmlElement(name = "FoundDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar foundDate;

    /**
     * Recupera il valore della proprietà foundDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundDate() {
        return foundDate;
    }

    /**
     * Imposta il valore della proprietà foundDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundDate(XMLGregorianCalendar value) {
        this.foundDate = value;
    }

}
