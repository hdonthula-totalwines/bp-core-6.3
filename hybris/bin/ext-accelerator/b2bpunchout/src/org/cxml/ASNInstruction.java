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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lower",
    "upper"
})
@XmlRootElement(name = "ASNInstruction")
public class ASNInstruction {

    @XmlAttribute(name = "value1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value1;
    @XmlElement(name = "Lower")
    protected Lower lower;
    @XmlElement(name = "Upper")
    protected Upper upper;

    /**
     * Gets the value of the value1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link Lower }
     *     
     */
    public Lower getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lower }
     *     
     */
    public void setLower(Lower value) {
        this.lower = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link Upper }
     *     
     */
    public Upper getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Upper }
     *     
     */
    public void setUpper(Upper value) {
        this.upper = value;
    }

}
