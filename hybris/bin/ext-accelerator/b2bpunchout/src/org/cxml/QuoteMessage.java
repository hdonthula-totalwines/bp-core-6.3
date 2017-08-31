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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quoteMessageHeader",
    "quoteItemIn"
})
@XmlRootElement(name = "QuoteMessage")
public class QuoteMessage {

    @XmlElement(name = "QuoteMessageHeader", required = true)
    protected QuoteMessageHeader quoteMessageHeader;
    @XmlElement(name = "QuoteItemIn", required = true)
    protected List<QuoteItemIn> quoteItemIn;

    /**
     * Gets the value of the quoteMessageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteMessageHeader }
     *     
     */
    public QuoteMessageHeader getQuoteMessageHeader() {
        return quoteMessageHeader;
    }

    /**
     * Sets the value of the quoteMessageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteMessageHeader }
     *     
     */
    public void setQuoteMessageHeader(QuoteMessageHeader value) {
        this.quoteMessageHeader = value;
    }

    /**
     * Gets the value of the quoteItemIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItemIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItemIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItemIn }
     * 
     * 
     */
    public List<QuoteItemIn> getQuoteItemIn() {
        if (quoteItemIn == null) {
            quoteItemIn = new ArrayList<QuoteItemIn>();
        }
        return this.quoteItemIn;
    }

}
