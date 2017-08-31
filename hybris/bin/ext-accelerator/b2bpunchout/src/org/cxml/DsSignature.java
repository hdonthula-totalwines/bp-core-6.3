/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.12 at 07:19:30 PM EDT 
//



package org.cxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dsSignedInfo",
    "dsSignatureValue",
    "dsKeyInfo",
    "dsObject"
})
@XmlRootElement(name = "ds:Signature")
public class DsSignature {

    @XmlAttribute(name = "xmlns:ds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsDs;
    @XmlAttribute(name = "xmlns:xades")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsXades;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "ds:SignedInfo", required = true)
    protected DsSignedInfo dsSignedInfo;
    @XmlElement(name = "ds:SignatureValue", required = true)
    protected DsSignatureValue dsSignatureValue;
    @XmlElement(name = "ds:KeyInfo")
    protected DsKeyInfo dsKeyInfo;
    @XmlElement(name = "ds:Object")
    protected List<DsObject> dsObject;

    /**
     * Gets the value of the xmlnsDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsDs() {
        if (xmlnsDs == null) {
            return "http://www.w3.org/2000/09/xmldsig#";
        } else {
            return xmlnsDs;
        }
    }

    /**
     * Sets the value of the xmlnsDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsDs(String value) {
        this.xmlnsDs = value;
    }

    /**
     * Gets the value of the xmlnsXades property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsXades() {
        if (xmlnsXades == null) {
            return "http://uri.etsi.org/01903/v1.3.2#";
        } else {
            return xmlnsXades;
        }
    }

    /**
     * Sets the value of the xmlnsXades property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsXades(String value) {
        this.xmlnsXades = value;
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
     * Gets the value of the dsSignedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DsSignedInfo }
     *     
     */
    public DsSignedInfo getDsSignedInfo() {
        return dsSignedInfo;
    }

    /**
     * Sets the value of the dsSignedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsSignedInfo }
     *     
     */
    public void setDsSignedInfo(DsSignedInfo value) {
        this.dsSignedInfo = value;
    }

    /**
     * Gets the value of the dsSignatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link DsSignatureValue }
     *     
     */
    public DsSignatureValue getDsSignatureValue() {
        return dsSignatureValue;
    }

    /**
     * Sets the value of the dsSignatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsSignatureValue }
     *     
     */
    public void setDsSignatureValue(DsSignatureValue value) {
        this.dsSignatureValue = value;
    }

    /**
     * Gets the value of the dsKeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DsKeyInfo }
     *     
     */
    public DsKeyInfo getDsKeyInfo() {
        return dsKeyInfo;
    }

    /**
     * Sets the value of the dsKeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsKeyInfo }
     *     
     */
    public void setDsKeyInfo(DsKeyInfo value) {
        this.dsKeyInfo = value;
    }

    /**
     * Gets the value of the dsObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsObject }
     * 
     * 
     */
    public List<DsObject> getDsObject() {
        if (dsObject == null) {
            dsObject = new ArrayList<DsObject>();
        }
        return this.dsObject;
    }

}
