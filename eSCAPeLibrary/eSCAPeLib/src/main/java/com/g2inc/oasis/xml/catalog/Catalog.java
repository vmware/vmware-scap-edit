//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:02:05 AM EDT 
//


package com.g2inc.oasis.xml.catalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for catalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}public"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}system"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}uri"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}rewriteSystem"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}rewriteURI"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}uriSuffix"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}systemSuffix"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegatePublic"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegateSystem"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegateURI"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}nextCatalog"/>
 *         &lt;element ref="{urn:oasis:names:tc:entity:xmlns:xml:catalog}group"/>
 *         &lt;any processContents='skip' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="prefer" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}systemOrPublic" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalog", propOrder = {
    "publicOrSystemOrUri"
})
public class Catalog
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "group", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delegateURI", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uriSuffix", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rewriteURI", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uri", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "system", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "public", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nextCatalog", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delegatePublic", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delegateSystem", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "systemSuffix", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rewriteSystem", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement
    protected List<Object> publicOrSystemOrUri;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "prefer")
    protected SystemOrPublic prefer;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the publicOrSystemOrUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicOrSystemOrUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicOrSystemOrUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DelegateURI }{@code >}
     * {@link JAXBElement }{@code <}{@link Group }{@code >}
     * {@link JAXBElement }{@code <}{@link UriSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link RewriteURI }{@code >}
     * {@link JAXBElement }{@code <}{@link Public }{@code >}
     * {@link JAXBElement }{@code <}{@link System }{@code >}
     * {@link JAXBElement }{@code <}{@link Uri }{@code >}
     * {@link JAXBElement }{@code <}{@link DelegatePublic }{@code >}
     * {@link JAXBElement }{@code <}{@link NextCatalog }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link DelegateSystem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link RewriteSystem }{@code >}
     * 
     * 
     */
    public List<Object> getPublicOrSystemOrUri() {
        if (publicOrSystemOrUri == null) {
            publicOrSystemOrUri = new ArrayList<Object>();
        }
        return this.publicOrSystemOrUri;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the prefer property.
     * 
     * @return
     *     possible object is
     *     {@link SystemOrPublic }
     *     
     */
    public SystemOrPublic getPrefer() {
        return prefer;
    }

    /**
     * Sets the value of the prefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemOrPublic }
     *     
     */
    public void setPrefer(SystemOrPublic value) {
        this.prefer = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
