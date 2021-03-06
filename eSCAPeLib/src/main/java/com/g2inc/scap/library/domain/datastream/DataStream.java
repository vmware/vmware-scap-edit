//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 09:02:05 AM EDT 
//


package com.g2inc.scap.library.domain.datastream;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dictionaries" type="{http://scap.nist.gov/schema/scap/source/1.2}refListType" minOccurs="0"/>
 *         &lt;element name="checklists" type="{http://scap.nist.gov/schema/scap/source/1.2}refListType" minOccurs="0"/>
 *         &lt;element name="checks" type="{http://scap.nist.gov/schema/scap/source/1.2}refListType"/>
 *         &lt;element name="extended-components" type="{http://scap.nist.gov/schema/scap/source/1.2}refListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *             &lt;pattern value="scap_[^_]+_datastream_.+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="use-case" use="required">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://scap.nist.gov/schema/scap/source/1.2}useCaseType {http://www.w3.org/2001/XMLSchema}token">
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scap-version" use="required">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://scap.nist.gov/schema/scap/source/1.2}scapVersionType {http://www.w3.org/2001/XMLSchema}token">
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dictionaries",
    "checklists",
    "checks",
    "extendedComponents"
})
@XmlRootElement(name = "data-stream")
public class DataStream
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected RefListType dictionaries;
    protected RefListType checklists;
    @XmlElement(required = true)
    protected RefListType checks;
    @XmlElement(name = "extended-components")
    protected RefListType extendedComponents;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "use-case", required = true)
    protected String useCase;
    @XmlAttribute(name = "scap-version", required = true)
    protected String scapVersion;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the dictionaries property.
     * 
     * @return
     *     possible object is
     *     {@link RefListType }
     *     
     */
    public RefListType getDictionaries() {
        return dictionaries;
    }

    /**
     * Sets the value of the dictionaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefListType }
     *     
     */
    public void setDictionaries(RefListType value) {
        this.dictionaries = value;
    }

    /**
     * Gets the value of the checklists property.
     * 
     * @return
     *     possible object is
     *     {@link RefListType }
     *     
     */
    public RefListType getChecklists() {
        return checklists;
    }

    /**
     * Sets the value of the checklists property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefListType }
     *     
     */
    public void setChecklists(RefListType value) {
        this.checklists = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link RefListType }
     *     
     */
    public RefListType getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefListType }
     *     
     */
    public void setChecks(RefListType value) {
        this.checks = value;
    }

    /**
     * Gets the value of the extendedComponents property.
     * 
     * @return
     *     possible object is
     *     {@link RefListType }
     *     
     */
    public RefListType getExtendedComponents() {
        return extendedComponents;
    }

    /**
     * Sets the value of the extendedComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefListType }
     *     
     */
    public void setExtendedComponents(RefListType value) {
        this.extendedComponents = value;
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
     * Gets the value of the useCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCase() {
        return useCase;
    }

    /**
     * Sets the value of the useCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCase(String value) {
        this.useCase = value;
    }

    /**
     * Gets the value of the scapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScapVersion() {
        return scapVersion;
    }

    /**
     * Sets the value of the scapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScapVersion(String value) {
        this.scapVersion = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
