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
package de.hybris.platform.accountsummaryaddon.attributehandlers;

import org.apache.commons.lang.StringUtils;

import de.hybris.platform.accountsummaryaddon.model.B2BDocumentPaymentInfoModel;

import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

public class B2BUseDocumentReferenceDynamicAttributeHandler extends AbstractDynamicAttributeHandler<String, B2BDocumentPaymentInfoModel>
{
	 @Override
	 public String get(final B2BDocumentPaymentInfoModel ruleSet)
	 {
			final boolean usingDocument = StringUtils.isBlank(ruleSet.getCcTransactionNumber());

			return usingDocument ? ruleSet.getUseDocument().getDocumentNumber() : ruleSet.getCcTransactionNumber();
	 }
	 
	 @Override
	 public void set(final B2BDocumentPaymentInfoModel paramMODEL, final String paramVALUE)
	 {
	  // Ignore
	 }
}
