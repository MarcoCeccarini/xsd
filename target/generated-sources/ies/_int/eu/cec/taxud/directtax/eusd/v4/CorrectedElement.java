//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
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
 *         &lt;element name="ReqRefId" type="{urn:cec.eu.int:taxud:directtax:v4}UID_Type"/&gt;
 *         &lt;element name="Cancellation" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CancellationDocSpec_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectedEntity" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectableEntityParty_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectedArt4_2PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectedArt4_2PaymentData_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectedPayingAgent" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectablePAParty_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectedBeneficialOwner" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectedBeneficialOwner_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectedArt9PaymentData" type="{urn:cec.eu.int:taxud:directtax:eusd:v4}CorrectedArt9PaymentData_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "reqRefId",
    "cancellation",
    "correctedEntity",
    "correctedArt42PaymentData",
    "correctedPayingAgent",
    "correctedBeneficialOwner",
    "correctedArt9PaymentData"
})
@XmlRootElement(name = "CorrectedElement")
public class CorrectedElement {

    @XmlElement(name = "ReqRefId", required = true)
    protected String reqRefId;
    @XmlElement(name = "Cancellation")
    protected List<CancellationDocSpecType> cancellation;
    @XmlElement(name = "CorrectedEntity")
    protected List<CorrectableEntityPartyType> correctedEntity;
    @XmlElement(name = "CorrectedArt4_2PaymentData")
    protected List<CorrectedArt42PaymentDataType> correctedArt42PaymentData;
    @XmlElement(name = "CorrectedPayingAgent")
    protected List<CorrectablePAPartyType> correctedPayingAgent;
    @XmlElement(name = "CorrectedBeneficialOwner")
    protected List<CorrectedBeneficialOwnerType> correctedBeneficialOwner;
    @XmlElement(name = "CorrectedArt9PaymentData")
    protected List<CorrectedArt9PaymentDataType> correctedArt9PaymentData;

    /**
     * Recupera il valore della proprietà reqRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRefId() {
        return reqRefId;
    }

    /**
     * Imposta il valore della proprietà reqRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRefId(String value) {
        this.reqRefId = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationDocSpecType }
     * 
     * 
     */
    public List<CancellationDocSpecType> getCancellation() {
        if (cancellation == null) {
            cancellation = new ArrayList<CancellationDocSpecType>();
        }
        return this.cancellation;
    }

    /**
     * Gets the value of the correctedEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableEntityPartyType }
     * 
     * 
     */
    public List<CorrectableEntityPartyType> getCorrectedEntity() {
        if (correctedEntity == null) {
            correctedEntity = new ArrayList<CorrectableEntityPartyType>();
        }
        return this.correctedEntity;
    }

    /**
     * Gets the value of the correctedArt42PaymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedArt42PaymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedArt42PaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectedArt42PaymentDataType }
     * 
     * 
     */
    public List<CorrectedArt42PaymentDataType> getCorrectedArt42PaymentData() {
        if (correctedArt42PaymentData == null) {
            correctedArt42PaymentData = new ArrayList<CorrectedArt42PaymentDataType>();
        }
        return this.correctedArt42PaymentData;
    }

    /**
     * Gets the value of the correctedPayingAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedPayingAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedPayingAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectablePAPartyType }
     * 
     * 
     */
    public List<CorrectablePAPartyType> getCorrectedPayingAgent() {
        if (correctedPayingAgent == null) {
            correctedPayingAgent = new ArrayList<CorrectablePAPartyType>();
        }
        return this.correctedPayingAgent;
    }

    /**
     * Gets the value of the correctedBeneficialOwner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedBeneficialOwner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedBeneficialOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectedBeneficialOwnerType }
     * 
     * 
     */
    public List<CorrectedBeneficialOwnerType> getCorrectedBeneficialOwner() {
        if (correctedBeneficialOwner == null) {
            correctedBeneficialOwner = new ArrayList<CorrectedBeneficialOwnerType>();
        }
        return this.correctedBeneficialOwner;
    }

    /**
     * Gets the value of the correctedArt9PaymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedArt9PaymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedArt9PaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectedArt9PaymentDataType }
     * 
     * 
     */
    public List<CorrectedArt9PaymentDataType> getCorrectedArt9PaymentData() {
        if (correctedArt9PaymentData == null) {
            correctedArt9PaymentData = new ArrayList<CorrectedArt9PaymentDataType>();
        }
        return this.correctedArt9PaymentData;
    }

}
