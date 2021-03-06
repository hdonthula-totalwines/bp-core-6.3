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
package de.hybris.platform.commerceservices.order.impl;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.QuoteModel;
import de.hybris.platform.order.strategies.impl.DefaultCreateCartFromQuoteStrategy;


/**
 * Commerce specific extension of {@link DefaultCreateCartFromQuoteStrategy}
 */
public class CommerceCreateCartFromQuoteStrategy extends DefaultCreateCartFromQuoteStrategy
{

	@Override
	protected void postProcess(final QuoteModel original, final CartModel copy)
	{
		super.postProcess(original, copy);
		copy.setQuoteReference(original);
		original.setCartReference(copy);
	}


}
