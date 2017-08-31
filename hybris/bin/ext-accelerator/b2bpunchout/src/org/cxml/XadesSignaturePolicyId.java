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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesSigPolicyId",
    "dsTransforms",
    "xadesSigPolicyHash",
    "xadesSigPolicyQualifiers"
})
@XmlRootElement(name = "xades:SignaturePolicyId")
public class XadesSignaturePolicyId {

    @XmlElement(name = "xades:SigPolicyId", required = true)
    protected XadesSigPolicyId xadesSigPolicyId;
    @XmlElement(name = "ds:Transforms")
    protected DsTransforms dsTransforms;
    @XmlElement(name = "xades:SigPolicyHash", required = true)
    protected XadesSigPolicyHash xadesSigPolicyHash;
    @XmlElement(name = "xades:SigPolicyQualifiers")
    protected XadesSigPolicyQualifiers xadesSigPolicyQualifiers;

    /**
     * Gets the value of the xadesSigPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSigPolicyId }
     *     
     */
    public XadesSigPolicyId getXadesSigPolicyId() {
        return xadesSigPolicyId;
    }

    /**
     * Sets the value of the xadesSigPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSigPolicyId }
     *     
     */
    public void setXadesSigPolicyId(XadesSigPolicyId value) {
        this.xadesSigPolicyId = value;
    }

    /**
     * Gets the value of the dsTransforms property.
     * 
     * @return
     *     possible object is
     *     {@link DsTransforms }
     *     
     */
    public DsTransforms getDsTransforms() {
        return dsTransforms;
    }

    /**
     * Sets the value of the dsTransforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsTransforms }
     *     
     */
    public void setDsTransforms(DsTransforms value) {
        this.dsTransforms = value;
    }

    /**
     * Gets the value of the xadesSigPolicyHash property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSigPolicyHash }
     *     
     */
    public XadesSigPolicyHash getXadesSigPolicyHash() {
        return xadesSigPolicyHash;
    }

    /**
     * Sets the value of the xadesSigPolicyHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSigPolicyHash }
     *     
     */
    public void setXadesSigPolicyHash(XadesSigPolicyHash value) {
        this.xadesSigPolicyHash = value;
    }

    /**
     * Gets the value of the xadesSigPolicyQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSigPolicyQualifiers }
     *     
     */
    public XadesSigPolicyQualifiers getXadesSigPolicyQualifiers() {
        return xadesSigPolicyQualifiers;
    }

    /**
     * Sets the value of the xadesSigPolicyQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSigPolicyQualifiers }
     *     
     */
    public void setXadesSigPolicyQualifiers(XadesSigPolicyQualifiers value) {
        this.xadesSigPolicyQualifiers = value;
    }

}
