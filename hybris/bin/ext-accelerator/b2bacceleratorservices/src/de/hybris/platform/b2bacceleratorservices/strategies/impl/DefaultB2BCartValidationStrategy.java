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
package de.hybris.platform.b2bacceleratorservices.strategies.impl;


import de.hybris.platform.b2bacceleratorservices.enums.CheckoutPaymentType;
import de.hybris.platform.commerceservices.strategies.impl.DefaultCartValidationStrategy;
import de.hybris.platform.core.model.order.CartModel;


public class DefaultB2BCartValidationStrategy extends DefaultCartValidationStrategy
{
	@Override
	protected void validateDelivery(final CartModel cartModel)
	{
		final CheckoutPaymentType paymentType = cartModel.getPaymentType();

		if (paymentType == null || CheckoutPaymentType.CARD.equals(paymentType))
		{
			super.validateDelivery(cartModel);
		}
	}
}
