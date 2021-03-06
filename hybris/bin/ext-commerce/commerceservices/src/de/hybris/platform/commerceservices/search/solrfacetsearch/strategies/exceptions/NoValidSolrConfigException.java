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
package de.hybris.platform.commerceservices.search.solrfacetsearch.strategies.exceptions;

import de.hybris.platform.commerceservices.search.solrfacetsearch.strategies.SolrFacetSearchConfigSelectionStrategy;


/**
 * Throws when {@link SolrFacetSearchConfigSelectionStrategy} cannot resolve suitable solr index config for the current
 * context.
 * 
 *
 * 
 */
public class NoValidSolrConfigException extends Exception
{

	/**
	 * @param message
	 */
	public NoValidSolrConfigException(final String message)
	{
		super(message);
	}

}
