//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.22 alle 03:45:18 PM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * An amount: a value with a currency attribute.
 * 
 * <p>Classe Java per MoneyAmount_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MoneyAmount_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:ec.europa.eu:taxud:directtax:aeoi:common:v2&gt;AmountValue_Type"&gt;
 *       &lt;attribute name="currency" use="required" type="{urn:ec.europa.eu:taxud:directtax:aeoi:common:v2}currCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyAmount_Type", propOrder = {
    "value"
})
public class MoneyAmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currency", required = true)
    protected CurrCodeType currency;

    /**
     * GEN-DT-AMOUNT: A decimal amount, restricted to two decimal places.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà currency.
     * 
     * @return
     *     possible object is
     *     {@link CurrCodeType }
     *     
     */
    public CurrCodeType getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della proprietà currency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCodeType }
     *     
     */
    public void setCurrency(CurrCodeType value) {
        this.currency = value;
    }

}
