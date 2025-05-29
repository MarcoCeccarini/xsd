//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:03 AM CEST 
//


package _int.eu.cec.taxud.directtax.eusd.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per NameStruct_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NameStruct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrecedingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FirstName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MiddleName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NamePrefix" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GenerationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameStruct_Type", propOrder = {
    "precedingTitle",
    "title",
    "firstName",
    "middleName",
    "namePrefix",
    "lastName",
    "generationIdentifier",
    "suffix",
    "generalSuffix"
})
public class NameStructType {

    @XmlElement(name = "PrecedingTitle")
    protected String precedingTitle;
    @XmlElement(name = "Title")
    protected List<String> title;
    @XmlElement(name = "FirstName", required = true)
    protected NameStructType.FirstName firstName;
    @XmlElement(name = "MiddleName")
    protected List<NameStructType.MiddleName> middleName;
    @XmlElement(name = "NamePrefix")
    protected NameStructType.NamePrefix namePrefix;
    @XmlElement(name = "LastName", required = true)
    protected NameStructType.LastName lastName;
    @XmlElement(name = "GenerationIdentifier")
    protected List<String> generationIdentifier;
    @XmlElement(name = "Suffix")
    protected List<String> suffix;
    @XmlElement(name = "GeneralSuffix")
    protected String generalSuffix;

    /**
     * Recupera il valore della proprietà precedingTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingTitle() {
        return precedingTitle;
    }

    /**
     * Imposta il valore della proprietà precedingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingTitle(String value) {
        this.precedingTitle = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<String>();
        }
        return this.title;
    }

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link NameStructType.FirstName }
     *     
     */
    public NameStructType.FirstName getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameStructType.FirstName }
     *     
     */
    public void setFirstName(NameStructType.FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameStructType.MiddleName }
     * 
     * 
     */
    public List<NameStructType.MiddleName> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<NameStructType.MiddleName>();
        }
        return this.middleName;
    }

    /**
     * Recupera il valore della proprietà namePrefix.
     * 
     * @return
     *     possible object is
     *     {@link NameStructType.NamePrefix }
     *     
     */
    public NameStructType.NamePrefix getNamePrefix() {
        return namePrefix;
    }

    /**
     * Imposta il valore della proprietà namePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link NameStructType.NamePrefix }
     *     
     */
    public void setNamePrefix(NameStructType.NamePrefix value) {
        this.namePrefix = value;
    }

    /**
     * Recupera il valore della proprietà lastName.
     * 
     * @return
     *     possible object is
     *     {@link NameStructType.LastName }
     *     
     */
    public NameStructType.LastName getLastName() {
        return lastName;
    }

    /**
     * Imposta il valore della proprietà lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameStructType.LastName }
     *     
     */
    public void setLastName(NameStructType.LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the generationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGenerationIdentifier() {
        if (generationIdentifier == null) {
            generationIdentifier = new ArrayList<String>();
        }
        return this.generationIdentifier;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuffix() {
        if (suffix == null) {
            suffix = new ArrayList<String>();
        }
        return this.suffix;
    }

    /**
     * Recupera il valore della proprietà generalSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralSuffix() {
        return generalSuffix;
    }

    /**
     * Imposta il valore della proprietà generalSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralSuffix(String value) {
        this.generalSuffix = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FirstName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        @XmlSchemaType(name = "anySimpleType")
        protected String xnlNameType;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà xnlNameType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Imposta il valore della proprietà xnlNameType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LastName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        @XmlSchemaType(name = "anySimpleType")
        protected String xnlNameType;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà xnlNameType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Imposta il valore della proprietà xnlNameType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MiddleName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        @XmlSchemaType(name = "anySimpleType")
        protected String xnlNameType;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà xnlNameType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Imposta il valore della proprietà xnlNameType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="xnlNameType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NamePrefix {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        @XmlSchemaType(name = "anySimpleType")
        protected String xnlNameType;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà xnlNameType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Imposta il valore della proprietà xnlNameType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }

}
