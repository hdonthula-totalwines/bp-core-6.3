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


import de.hybris.platform.commerceservices.order.CommerceCartMergingException;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.core.model.order.CartModel;

import java.util.List;


/**
 * A strategy for merging carts.
 */
public interface CommerceCartMergingStrategy
{
	/**
	 * Merge two carts and add modifications
	 * 
	 * @param fromCart
	 *           - Cart from merging is done
	 * @param toCart
	 *           - Cart to merge to
	 * @param modifications
	 *           - List of modifications
	 * @throws CommerceCartMergingException
	 */
	void mergeCarts(CartModel fromCart, CartModel toCart, List<CommerceCartModification> modifications)
			throws CommerceCartMergingException;
}
