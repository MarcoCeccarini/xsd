//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oecd.ties.stf.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NameTypeNameFree_QNAME = new QName("urn:oecd:ties:stf:v2", "NameFree");
    private final static QName _NameTypeNameFix_QNAME = new QName("urn:oecd:ties:stf:v2", "NameFix");
    private final static QName _AddressTypeCountryCode_QNAME = new QName("urn:oecd:ties:stf:v2", "CountryCode");
    private final static QName _AddressTypeAddressFree_QNAME = new QName("urn:oecd:ties:stf:v2", "AddressFree");
    private final static QName _AddressTypeAddressFix_QNAME = new QName("urn:oecd:ties:stf:v2", "AddressFix");
    private final static QName _AcctInfoTypeIBAN_QNAME = new QName("urn:oecd:ties:stf:v2", "IBAN");
    private final static QName _AcctInfoTypeOBAN_QNAME = new QName("urn:oecd:ties:stf:v2", "OBAN");
    private final static QName _AcctInfoTypeISIN_QNAME = new QName("urn:oecd:ties:stf:v2", "ISIN");
    private final static QName _AcctInfoTypeOSIN_QNAME = new QName("urn:oecd:ties:stf:v2", "OSIN");
    private final static QName _AcctInfoTypeSWIFT_QNAME = new QName("urn:oecd:ties:stf:v2", "SWIFT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oecd.ties.stf.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameFixType }
     * 
     */
    public NameFixType createNameFixType() {
        return new NameFixType();
    }

    /**
     * Create an instance of {@link SpecificPaymentTypeType }
     * 
     */
    public SpecificPaymentTypeType createSpecificPaymentTypeType() {
        return new SpecificPaymentTypeType();
    }

    /**
     * Create an instance of {@link AcctInfoType }
     * 
     */
    public AcctInfoType createAcctInfoType() {
        return new AcctInfoType();
    }

    /**
     * Create an instance of {@link AddressFixType }
     * 
     */
    public AddressFixType createAddressFixType() {
        return new AddressFixType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DocSpecType }
     * 
     */
    public DocSpecType createDocSpecType() {
        return new DocSpecType();
    }

    /**
     * Create an instance of {@link IndivPersDataType }
     * 
     */
    public IndivPersDataType createIndivPersDataType() {
        return new IndivPersDataType();
    }

    /**
     * Create an instance of {@link LegalPersDataType }
     * 
     */
    public LegalPersDataType createLegalPersDataType() {
        return new LegalPersDataType();
    }

    /**
     * Create an instance of {@link MessageSpecType }
     * 
     */
    public MessageSpecType createMessageSpecType() {
        return new MessageSpecType();
    }

    /**
     * Create an instance of {@link MonAmntType }
     * 
     */
    public MonAmntType createMonAmntType() {
        return new MonAmntType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link OBANType }
     * 
     */
    public OBANType createOBANType() {
        return new OBANType();
    }

    /**
     * Create an instance of {@link OSINType }
     * 
     */
    public OSINType createOSINType() {
        return new OSINType();
    }

    /**
     * Create an instance of {@link OtherInfoType }
     * 
     */
    public OtherInfoType createOtherInfoType() {
        return new OtherInfoType();
    }

    /**
     * Create an instance of {@link PartyIdType }
     * 
     */
    public PartyIdType createPartyIdType() {
        return new PartyIdType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link PersDataType }
     * 
     */
    public PersDataType createPersDataType() {
        return new PersDataType();
    }

    /**
     * Create an instance of {@link PaymentDataType }
     * 
     */
    public PaymentDataType createPaymentDataType() {
        return new PaymentDataType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link NameFixType.FirstName }
     * 
     */
    public NameFixType.FirstName createNameFixTypeFirstName() {
        return new NameFixType.FirstName();
    }

    /**
     * Create an instance of {@link NameFixType.MiddleName }
     * 
     */
    public NameFixType.MiddleName createNameFixTypeMiddleName() {
        return new NameFixType.MiddleName();
    }

    /**
     * Create an instance of {@link NameFixType.NamePrefix }
     * 
     */
    public NameFixType.NamePrefix createNameFixTypeNamePrefix() {
        return new NameFixType.NamePrefix();
    }

    /**
     * Create an instance of {@link NameFixType.LastName }
     * 
     */
    public NameFixType.LastName createNameFixTypeLastName() {
        return new NameFixType.LastName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "NameFree", scope = NameType.class)
    public JAXBElement<String> createNameTypeNameFree(String value) {
        return new JAXBElement<String>(_NameTypeNameFree_QNAME, String.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameFixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "NameFix", scope = NameType.class)
    public JAXBElement<NameFixType> createNameTypeNameFix(NameFixType value) {
        return new JAXBElement<NameFixType>(_NameTypeNameFix_QNAME, NameFixType.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "CountryCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCountryCode(String value) {
        return new JAXBElement<String>(_AddressTypeCountryCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "AddressFree", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressFree(String value) {
        return new JAXBElement<String>(_AddressTypeAddressFree_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "AddressFix", scope = AddressType.class)
    public JAXBElement<AddressFixType> createAddressTypeAddressFix(AddressFixType value) {
        return new JAXBElement<AddressFixType>(_AddressTypeAddressFix_QNAME, AddressFixType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "IBAN", scope = AcctInfoType.class)
    public JAXBElement<String> createAcctInfoTypeIBAN(String value) {
        return new JAXBElement<String>(_AcctInfoTypeIBAN_QNAME, String.class, AcctInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OBANType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "OBAN", scope = AcctInfoType.class)
    public JAXBElement<OBANType> createAcctInfoTypeOBAN(OBANType value) {
        return new JAXBElement<OBANType>(_AcctInfoTypeOBAN_QNAME, OBANType.class, AcctInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "ISIN", scope = AcctInfoType.class)
    public JAXBElement<String> createAcctInfoTypeISIN(String value) {
        return new JAXBElement<String>(_AcctInfoTypeISIN_QNAME, String.class, AcctInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OSINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "OSIN", scope = AcctInfoType.class)
    public JAXBElement<OSINType> createAcctInfoTypeOSIN(OSINType value) {
        return new JAXBElement<OSINType>(_AcctInfoTypeOSIN_QNAME, OSINType.class, AcctInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:stf:v2", name = "SWIFT", scope = AcctInfoType.class)
    public JAXBElement<String> createAcctInfoTypeSWIFT(String value) {
        return new JAXBElement<String>(_AcctInfoTypeSWIFT_QNAME, String.class, AcctInfoType.class, value);
    }

}
