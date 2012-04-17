//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 11:12:33 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}serviceType">
 *       &lt;sequence>
 *         &lt;element name="baseDn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pivotAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="fetchedAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="getAllFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getOneFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapServiceType", propOrder = {
    "baseDn",
    "pivotAttributes",
    "fetchedAttributes",
    "getAllFilter",
    "getOneFilter"
})
@XmlSeeAlso({
    LdapSourceServiceType.class,
    LdapDestinationServiceType.class
})
public abstract class LdapServiceType
    extends ServiceType
{

    @XmlElement(required = true)
    protected String baseDn;
    protected ValuesType pivotAttributes;
    protected ValuesType fetchedAttributes;
    @XmlElement(required = true)
    protected String getAllFilter;
    @XmlElement(required = true)
    protected String getOneFilter;

    /**
     * Gets the value of the baseDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDn() {
        return baseDn;
    }

    /**
     * Sets the value of the baseDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDn(String value) {
        this.baseDn = value;
    }

    /**
     * Gets the value of the pivotAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getPivotAttributes() {
        return pivotAttributes;
    }

    /**
     * Sets the value of the pivotAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setPivotAttributes(ValuesType value) {
        this.pivotAttributes = value;
    }

    /**
     * Gets the value of the fetchedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getFetchedAttributes() {
        return fetchedAttributes;
    }

    /**
     * Sets the value of the fetchedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setFetchedAttributes(ValuesType value) {
        this.fetchedAttributes = value;
    }

    /**
     * Gets the value of the getAllFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAllFilter() {
        return getAllFilter;
    }

    /**
     * Sets the value of the getAllFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAllFilter(String value) {
        this.getAllFilter = value;
    }

    /**
     * Gets the value of the getOneFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetOneFilter() {
        return getOneFilter;
    }

    /**
     * Sets the value of the getOneFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetOneFilter(String value) {
        this.getOneFilter = value;
    }

}
