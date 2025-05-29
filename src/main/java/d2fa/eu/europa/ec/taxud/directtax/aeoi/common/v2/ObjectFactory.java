//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:05 AM CEST 
//


package eu.europa.ec.taxud.directtax.aeoi.common.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import oecd.ties.stf.v2.GenderType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.taxud.directtax.aeoi.common.v2 package. 
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

    private final static QName _AddressOptTypeCountryCode_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "CountryCode");
    private final static QName _AddressOptTypeAddressFree_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "AddressFree");
    private final static QName _AddressOptTypeAddressStruct_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "AddressStruct");
    private final static QName _PaymentTypeAmount_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "Amount");
    private final static QName _PaymentTypePaymentDate_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "PaymentDate");
    private final static QName _PaymentTypeAccountInformation_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "AccountInformation");
    private final static QName _NameOptTypeNameFree_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "NameFree");
    private final static QName _NameOptTypeNameStruct_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "NameStruct");
    private final static QName _NaturalPersonTypeBirth_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "Birth");
    private final static QName _NaturalPersonTypeID_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "ID");
    private final static QName _NaturalPersonTypeAddress_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "Address");
    private final static QName _NaturalPersonTypeName_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "Name");
    private final static QName _NaturalPersonTypeActingCapacity_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "ActingCapacity");
    private final static QName _NaturalPersonTypeGender_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "Gender");
    private final static QName _NaturalPersonTypeResidenceCountryCode_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "ResidenceCountryCode");
    private final static QName _NaturalPersonTypeNationalityCountryCode_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "NationalityCountryCode");
    private final static QName _NaturalPersonTypeOtherPartyInfo_QNAME = new QName("urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", "OtherPartyInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.taxud.directtax.aeoi.common.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinancialInfoType }
     * 
     */
    public FinancialInfoType createFinancialInfoType() {
        return new FinancialInfoType();
    }

    /**
     * Create an instance of {@link I18NStringType }
     * 
     */
    public I18NStringType createI18NStringType() {
        return new I18NStringType();
    }

    /**
     * Create an instance of {@link AdjustablePrecisionDateType }
     * 
     */
    public AdjustablePrecisionDateType createAdjustablePrecisionDateType() {
        return new AdjustablePrecisionDateType();
    }

    /**
     * Create an instance of {@link PersonIdType }
     * 
     */
    public PersonIdType createPersonIdType() {
        return new PersonIdType();
    }

    /**
     * Create an instance of {@link PersonIdOptType }
     * 
     */
    public PersonIdOptType createPersonIdOptType() {
        return new PersonIdOptType();
    }

    /**
     * Create an instance of {@link NaturalPersonType }
     * 
     */
    public NaturalPersonType createNaturalPersonType() {
        return new NaturalPersonType();
    }

    /**
     * Create an instance of {@link NaturalPersonOptType }
     * 
     */
    public NaturalPersonOptType createNaturalPersonOptType() {
        return new NaturalPersonOptType();
    }

    /**
     * Create an instance of {@link BirthType }
     * 
     */
    public BirthType createBirthType() {
        return new BirthType();
    }

    /**
     * Create an instance of {@link BirthOptType }
     * 
     */
    public BirthOptType createBirthOptType() {
        return new BirthOptType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link NameOptType }
     * 
     */
    public NameOptType createNameOptType() {
        return new NameOptType();
    }

    /**
     * Create an instance of {@link NameStructType }
     * 
     */
    public NameStructType createNameStructType() {
        return new NameStructType();
    }

    /**
     * Create an instance of {@link NameStructOptType }
     * 
     */
    public NameStructOptType createNameStructOptType() {
        return new NameStructOptType();
    }

    /**
     * Create an instance of {@link NonNaturalPersonType }
     * 
     */
    public NonNaturalPersonType createNonNaturalPersonType() {
        return new NonNaturalPersonType();
    }

    /**
     * Create an instance of {@link NonNaturalPersonOptType }
     * 
     */
    public NonNaturalPersonOptType createNonNaturalPersonOptType() {
        return new NonNaturalPersonOptType();
    }

    /**
     * Create an instance of {@link NonNaturalPersonNameType }
     * 
     */
    public NonNaturalPersonNameType createNonNaturalPersonNameType() {
        return new NonNaturalPersonNameType();
    }

    /**
     * Create an instance of {@link NonNaturalPersonNameOptType }
     * 
     */
    public NonNaturalPersonNameOptType createNonNaturalPersonNameOptType() {
        return new NonNaturalPersonNameOptType();
    }

    /**
     * Create an instance of {@link CommencementType }
     * 
     */
    public CommencementType createCommencementType() {
        return new CommencementType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link AccountInformationType }
     * 
     */
    public AccountInformationType createAccountInformationType() {
        return new AccountInformationType();
    }

    /**
     * Create an instance of {@link BankAccountNumberType }
     * 
     */
    public BankAccountNumberType createBankAccountNumberType() {
        return new BankAccountNumberType();
    }

    /**
     * Create an instance of {@link SecuritiesIdentificationNumberType }
     * 
     */
    public SecuritiesIdentificationNumberType createSecuritiesIdentificationNumberType() {
        return new SecuritiesIdentificationNumberType();
    }

    /**
     * Create an instance of {@link MoneyAmountType }
     * 
     */
    public MoneyAmountType createMoneyAmountType() {
        return new MoneyAmountType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AddressOptType }
     * 
     */
    public AddressOptType createAddressOptType() {
        return new AddressOptType();
    }

    /**
     * Create an instance of {@link AddressStructType }
     * 
     */
    public AddressStructType createAddressStructType() {
        return new AddressStructType();
    }

    /**
     * Create an instance of {@link AddressStructOptType }
     * 
     */
    public AddressStructOptType createAddressStructOptType() {
        return new AddressStructOptType();
    }

    /**
     * Create an instance of {@link FinancialInfoType.Payments }
     * 
     */
    public FinancialInfoType.Payments createFinancialInfoTypePayments() {
        return new FinancialInfoType.Payments();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "CountryCode", scope = AddressOptType.class)
    public JAXBElement<String> createAddressOptTypeCountryCode(String value) {
        return new JAXBElement<String>(_AddressOptTypeCountryCode_QNAME, String.class, AddressOptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "AddressFree", scope = AddressOptType.class)
    public JAXBElement<String> createAddressOptTypeAddressFree(String value) {
        return new JAXBElement<String>(_AddressOptTypeAddressFree_QNAME, String.class, AddressOptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressStructOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "AddressStruct", scope = AddressOptType.class)
    public JAXBElement<AddressStructOptType> createAddressOptTypeAddressStruct(AddressStructOptType value) {
        return new JAXBElement<AddressStructOptType>(_AddressOptTypeAddressStruct_QNAME, AddressStructOptType.class, AddressOptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "CountryCode", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeCountryCode(String value) {
        return new JAXBElement<String>(_AddressOptTypeCountryCode_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "AddressFree", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressFree(String value) {
        return new JAXBElement<String>(_AddressOptTypeAddressFree_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressStructType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "AddressStruct", scope = AddressType.class)
    public JAXBElement<AddressStructType> createAddressTypeAddressStruct(AddressStructType value) {
        return new JAXBElement<AddressStructType>(_AddressOptTypeAddressStruct_QNAME, AddressStructType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoneyAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "Amount", scope = PaymentType.class)
    public JAXBElement<MoneyAmountType> createPaymentTypeAmount(MoneyAmountType value) {
        return new JAXBElement<MoneyAmountType>(_PaymentTypeAmount_QNAME, MoneyAmountType.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustablePrecisionDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "PaymentDate", scope = PaymentType.class)
    public JAXBElement<AdjustablePrecisionDateType> createPaymentTypePaymentDate(AdjustablePrecisionDateType value) {
        return new JAXBElement<AdjustablePrecisionDateType>(_PaymentTypePaymentDate_QNAME, AdjustablePrecisionDateType.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "AccountInformation", scope = PaymentType.class)
    public JAXBElement<AccountInformationType> createPaymentTypeAccountInformation(AccountInformationType value) {
        return new JAXBElement<AccountInformationType>(_PaymentTypeAccountInformation_QNAME, AccountInformationType.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "NameFree", scope = NameOptType.class)
    public JAXBElement<String> createNameOptTypeNameFree(String value) {
        return new JAXBElement<String>(_NameOptTypeNameFree_QNAME, String.class, NameOptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameStructOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "NameStruct", scope = NameOptType.class)
    public JAXBElement<NameStructOptType> createNameOptTypeNameStruct(NameStructOptType value) {
        return new JAXBElement<NameStructOptType>(_NameOptTypeNameStruct_QNAME, NameStructOptType.class, NameOptType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "NameFree", scope = NameType.class)
    public JAXBElement<String> createNameTypeNameFree(String value) {
        return new JAXBElement<String>(_NameOptTypeNameFree_QNAME, String.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameStructType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "NameStruct", scope = NameType.class)
    public JAXBElement<NameStructType> createNameTypeNameStruct(NameStructType value) {
        return new JAXBElement<NameStructType>(_NameOptTypeNameStruct_QNAME, NameStructType.class, NameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BirthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "Birth", scope = NaturalPersonType.class)
    public JAXBElement<BirthType> createNaturalPersonTypeBirth(BirthType value) {
        return new JAXBElement<BirthType>(_NaturalPersonTypeBirth_QNAME, BirthType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "ID", scope = NaturalPersonType.class)
    public JAXBElement<PersonIdType> createNaturalPersonTypeID(PersonIdType value) {
        return new JAXBElement<PersonIdType>(_NaturalPersonTypeID_QNAME, PersonIdType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "Address", scope = NaturalPersonType.class)
    public JAXBElement<AddressType> createNaturalPersonTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_NaturalPersonTypeAddress_QNAME, AddressType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "Name", scope = NaturalPersonType.class)
    public JAXBElement<NameType> createNaturalPersonTypeName(NameType value) {
        return new JAXBElement<NameType>(_NaturalPersonTypeName_QNAME, NameType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapacityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "ActingCapacity", scope = NaturalPersonType.class)
    public JAXBElement<CapacityType> createNaturalPersonTypeActingCapacity(CapacityType value) {
        return new JAXBElement<CapacityType>(_NaturalPersonTypeActingCapacity_QNAME, CapacityType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "Gender", scope = NaturalPersonType.class)
    public JAXBElement<GenderType> createNaturalPersonTypeGender(GenderType value) {
        return new JAXBElement<GenderType>(_NaturalPersonTypeGender_QNAME, GenderType.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "ResidenceCountryCode", scope = NaturalPersonType.class)
    public JAXBElement<String> createNaturalPersonTypeResidenceCountryCode(String value) {
        return new JAXBElement<String>(_NaturalPersonTypeResidenceCountryCode_QNAME, String.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "NationalityCountryCode", scope = NaturalPersonType.class)
    public JAXBElement<String> createNaturalPersonTypeNationalityCountryCode(String value) {
        return new JAXBElement<String>(_NaturalPersonTypeNationalityCountryCode_QNAME, String.class, NaturalPersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link I18NStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:directtax:aeoi:common:v2", name = "OtherPartyInfo", scope = NaturalPersonType.class)
    public JAXBElement<I18NStringType> createNaturalPersonTypeOtherPartyInfo(I18NStringType value) {
        return new JAXBElement<I18NStringType>(_NaturalPersonTypeOtherPartyInfo_QNAME, I18NStringType.class, NaturalPersonType.class, value);
    }

}
