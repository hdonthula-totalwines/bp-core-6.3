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
package de.hybris.platform.acceleratorservices.futurestock;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Service for 'Future Stock Management'.
 * 
 * @spring.bean stockService
 */
public interface FutureStockService // NOSONAR
{
	String BEAN_NAME = "futureStockService";

	/**
	 * Gets the future product availability for the specified products, for each future date.
	 * 
	 * @param products
	 *           the list of products
	 * @return A map of quantity for each available date for each product in the list.
	 */
	Map<String, Map<Date, Integer>> getFutureAvailability(List<ProductModel> products);

}
