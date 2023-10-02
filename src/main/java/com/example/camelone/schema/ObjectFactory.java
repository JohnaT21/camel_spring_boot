//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.02 at 05:18:06 PM EAT 
//


package com.example.camelone.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.camelone.schema package. 
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

    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineNr_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "nr");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineAccID_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "accID");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineDocRef_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "docRef");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineEffDate_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "effDate");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineDesc_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "desc");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineAmnt_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "amnt");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineAmntTp_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "amntTp");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineVat_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "vat");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineRecRef_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "recRef");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineCustSupID_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "custSupID");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineInvRef_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "invRef");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineBankAccNr_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "bankAccNr");
    private final static QName _AuditfileCompanyTransactionsJournalTransactionTrLineBankIdCd_QNAME = new QName("http://www.auditfiles.nl/XAF/3.2", "bankIdCd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.camelone.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auditfile }
     * 
     */
    public Auditfile createAuditfile() {
        return new Auditfile();
    }

    /**
     * Create an instance of {@link Auditfile.Company }
     * 
     */
    public Auditfile.Company createAuditfileCompany() {
        return new Auditfile.Company();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Transactions }
     * 
     */
    public Auditfile.Company.Transactions createAuditfileCompanyTransactions() {
        return new Auditfile.Company.Transactions();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Transactions.Journal }
     * 
     */
    public Auditfile.Company.Transactions.Journal createAuditfileCompanyTransactionsJournal() {
        return new Auditfile.Company.Transactions.Journal();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Transactions.Journal.Transaction }
     * 
     */
    public Auditfile.Company.Transactions.Journal.Transaction createAuditfileCompanyTransactionsJournalTransaction() {
        return new Auditfile.Company.Transactions.Journal.Transaction();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Transactions.Journal.Transaction.TrLine }
     * 
     */
    public Auditfile.Company.Transactions.Journal.Transaction.TrLine createAuditfileCompanyTransactionsJournalTransactionTrLine() {
        return new Auditfile.Company.Transactions.Journal.Transaction.TrLine();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Periods }
     * 
     */
    public Auditfile.Company.Periods createAuditfileCompanyPeriods() {
        return new Auditfile.Company.Periods();
    }

    /**
     * Create an instance of {@link Auditfile.Company.VatCodes }
     * 
     */
    public Auditfile.Company.VatCodes createAuditfileCompanyVatCodes() {
        return new Auditfile.Company.VatCodes();
    }

    /**
     * Create an instance of {@link Auditfile.Company.GeneralLedger }
     * 
     */
    public Auditfile.Company.GeneralLedger createAuditfileCompanyGeneralLedger() {
        return new Auditfile.Company.GeneralLedger();
    }

    /**
     * Create an instance of {@link Auditfile.Company.CustomersSuppliers }
     * 
     */
    public Auditfile.Company.CustomersSuppliers createAuditfileCompanyCustomersSuppliers() {
        return new Auditfile.Company.CustomersSuppliers();
    }

    /**
     * Create an instance of {@link Auditfile.Company.CustomersSuppliers.CustomerSupplier }
     * 
     */
    public Auditfile.Company.CustomersSuppliers.CustomerSupplier createAuditfileCompanyCustomersSuppliersCustomerSupplier() {
        return new Auditfile.Company.CustomersSuppliers.CustomerSupplier();
    }

    /**
     * Create an instance of {@link Auditfile.Header }
     * 
     */
    public Auditfile.Header createAuditfileHeader() {
        return new Auditfile.Header();
    }

    /**
     * Create an instance of {@link Auditfile.Company.StreetAddress }
     * 
     */
    public Auditfile.Company.StreetAddress createAuditfileCompanyStreetAddress() {
        return new Auditfile.Company.StreetAddress();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat }
     * 
     */
    public Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat createAuditfileCompanyTransactionsJournalTransactionTrLineVat() {
        return new Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat();
    }

    /**
     * Create an instance of {@link Auditfile.Company.Periods.Period }
     * 
     */
    public Auditfile.Company.Periods.Period createAuditfileCompanyPeriodsPeriod() {
        return new Auditfile.Company.Periods.Period();
    }

    /**
     * Create an instance of {@link Auditfile.Company.VatCodes.VatCode }
     * 
     */
    public Auditfile.Company.VatCodes.VatCode createAuditfileCompanyVatCodesVatCode() {
        return new Auditfile.Company.VatCodes.VatCode();
    }

    /**
     * Create an instance of {@link Auditfile.Company.GeneralLedger.LedgerAccount }
     * 
     */
    public Auditfile.Company.GeneralLedger.LedgerAccount createAuditfileCompanyGeneralLedgerLedgerAccount() {
        return new Auditfile.Company.GeneralLedger.LedgerAccount();
    }

    /**
     * Create an instance of {@link Auditfile.Company.CustomersSuppliers.CustomerSupplier.StreetAddress }
     * 
     */
    public Auditfile.Company.CustomersSuppliers.CustomerSupplier.StreetAddress createAuditfileCompanyCustomersSuppliersCustomerSupplierStreetAddress() {
        return new Auditfile.Company.CustomersSuppliers.CustomerSupplier.StreetAddress();
    }

    /**
     * Create an instance of {@link Auditfile.Company.CustomersSuppliers.CustomerSupplier.BankAccount }
     * 
     */
    public Auditfile.Company.CustomersSuppliers.CustomerSupplier.BankAccount createAuditfileCompanyCustomersSuppliersCustomerSupplierBankAccount() {
        return new Auditfile.Company.CustomersSuppliers.CustomerSupplier.BankAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "nr", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineNr(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineNr_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "accID", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<Short> createAuditfileCompanyTransactionsJournalTransactionTrLineAccID(Short value) {
        return new JAXBElement<Short>(_AuditfileCompanyTransactionsJournalTransactionTrLineAccID_QNAME, Short.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "docRef", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<Integer> createAuditfileCompanyTransactionsJournalTransactionTrLineDocRef(Integer value) {
        return new JAXBElement<Integer>(_AuditfileCompanyTransactionsJournalTransactionTrLineDocRef_QNAME, Integer.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "effDate", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<XMLGregorianCalendar> createAuditfileCompanyTransactionsJournalTransactionTrLineEffDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AuditfileCompanyTransactionsJournalTransactionTrLineEffDate_QNAME, XMLGregorianCalendar.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "desc", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineDesc(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineDesc_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "amnt", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<Float> createAuditfileCompanyTransactionsJournalTransactionTrLineAmnt(Float value) {
        return new JAXBElement<Float>(_AuditfileCompanyTransactionsJournalTransactionTrLineAmnt_QNAME, Float.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "amntTp", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineAmntTp(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineAmntTp_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "vat", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat> createAuditfileCompanyTransactionsJournalTransactionTrLineVat(Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat value) {
        return new JAXBElement<Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat>(_AuditfileCompanyTransactionsJournalTransactionTrLineVat_QNAME, Auditfile.Company.Transactions.Journal.Transaction.TrLine.Vat.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "recRef", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineRecRef(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineRecRef_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "custSupID", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<Short> createAuditfileCompanyTransactionsJournalTransactionTrLineCustSupID(Short value) {
        return new JAXBElement<Short>(_AuditfileCompanyTransactionsJournalTransactionTrLineCustSupID_QNAME, Short.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "invRef", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineInvRef(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineInvRef_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "bankAccNr", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineBankAccNr(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineBankAccNr_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.auditfiles.nl/XAF/3.2", name = "bankIdCd", scope = Auditfile.Company.Transactions.Journal.Transaction.TrLine.class)
    public JAXBElement<String> createAuditfileCompanyTransactionsJournalTransactionTrLineBankIdCd(String value) {
        return new JAXBElement<String>(_AuditfileCompanyTransactionsJournalTransactionTrLineBankIdCd_QNAME, String.class, Auditfile.Company.Transactions.Journal.Transaction.TrLine.class, value);
    }

}
