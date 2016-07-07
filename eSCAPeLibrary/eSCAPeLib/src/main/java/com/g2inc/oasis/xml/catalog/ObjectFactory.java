//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:02:05 AM EDT 
//


package com.g2inc.oasis.xml.catalog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.g2inc.oasis.xml.catalog package. 
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

    private final static QName _Public_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "public");
    private final static QName _Group_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "group");
    private final static QName _NextCatalog_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "nextCatalog");
    private final static QName _System_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "system");
    private final static QName _Uri_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "uri");
    private final static QName _RewriteURI_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "rewriteURI");
    private final static QName _Catalog_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "catalog");
    private final static QName _DelegateURI_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "delegateURI");
    private final static QName _SystemSuffix_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "systemSuffix");
    private final static QName _DelegatePublic_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "delegatePublic");
    private final static QName _UriSuffix_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "uriSuffix");
    private final static QName _RewriteSystem_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "rewriteSystem");
    private final static QName _DelegateSystem_QNAME = new QName("urn:oasis:names:tc:entity:xmlns:xml:catalog", "delegateSystem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.g2inc.oasis.xml.catalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link RewriteURI }
     * 
     */
    public RewriteURI createRewriteURI() {
        return new RewriteURI();
    }

    /**
     * Create an instance of {@link DelegateURI }
     * 
     */
    public DelegateURI createDelegateURI() {
        return new DelegateURI();
    }

    /**
     * Create an instance of {@link RewriteSystem }
     * 
     */
    public RewriteSystem createRewriteSystem() {
        return new RewriteSystem();
    }

    /**
     * Create an instance of {@link DelegateSystem }
     * 
     */
    public DelegateSystem createDelegateSystem() {
        return new DelegateSystem();
    }

    /**
     * Create an instance of {@link Uri }
     * 
     */
    public Uri createUri() {
        return new Uri();
    }

    /**
     * Create an instance of {@link UriSuffix }
     * 
     */
    public UriSuffix createUriSuffix() {
        return new UriSuffix();
    }

    /**
     * Create an instance of {@link DelegatePublic }
     * 
     */
    public DelegatePublic createDelegatePublic() {
        return new DelegatePublic();
    }

    /**
     * Create an instance of {@link System }
     * 
     */
    public System createSystem() {
        return new System();
    }

    /**
     * Create an instance of {@link SystemSuffix }
     * 
     */
    public SystemSuffix createSystemSuffix() {
        return new SystemSuffix();
    }

    /**
     * Create an instance of {@link NextCatalog }
     * 
     */
    public NextCatalog createNextCatalog() {
        return new NextCatalog();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Public }
     * 
     */
    public Public createPublic() {
        return new Public();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Public }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "public")
    public JAXBElement<Public> createPublic(Public value) {
        return new JAXBElement<Public>(_Public_QNAME, Public.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "nextCatalog")
    public JAXBElement<NextCatalog> createNextCatalog(NextCatalog value) {
        return new JAXBElement<NextCatalog>(_NextCatalog_QNAME, NextCatalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link System }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "system")
    public JAXBElement<System> createSystem(System value) {
        return new JAXBElement<System>(_System_QNAME, System.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "uri")
    public JAXBElement<Uri> createUri(Uri value) {
        return new JAXBElement<Uri>(_Uri_QNAME, Uri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RewriteURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "rewriteURI")
    public JAXBElement<RewriteURI> createRewriteURI(RewriteURI value) {
        return new JAXBElement<RewriteURI>(_RewriteURI_QNAME, RewriteURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "catalog")
    public JAXBElement<Catalog> createCatalog(Catalog value) {
        return new JAXBElement<Catalog>(_Catalog_QNAME, Catalog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "delegateURI")
    public JAXBElement<DelegateURI> createDelegateURI(DelegateURI value) {
        return new JAXBElement<DelegateURI>(_DelegateURI_QNAME, DelegateURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "systemSuffix")
    public JAXBElement<SystemSuffix> createSystemSuffix(SystemSuffix value) {
        return new JAXBElement<SystemSuffix>(_SystemSuffix_QNAME, SystemSuffix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegatePublic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "delegatePublic")
    public JAXBElement<DelegatePublic> createDelegatePublic(DelegatePublic value) {
        return new JAXBElement<DelegatePublic>(_DelegatePublic_QNAME, DelegatePublic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "uriSuffix")
    public JAXBElement<UriSuffix> createUriSuffix(UriSuffix value) {
        return new JAXBElement<UriSuffix>(_UriSuffix_QNAME, UriSuffix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RewriteSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "rewriteSystem")
    public JAXBElement<RewriteSystem> createRewriteSystem(RewriteSystem value) {
        return new JAXBElement<RewriteSystem>(_RewriteSystem_QNAME, RewriteSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", name = "delegateSystem")
    public JAXBElement<DelegateSystem> createDelegateSystem(DelegateSystem value) {
        return new JAXBElement<DelegateSystem>(_DelegateSystem_QNAME, DelegateSystem.class, null, value);
    }

}
