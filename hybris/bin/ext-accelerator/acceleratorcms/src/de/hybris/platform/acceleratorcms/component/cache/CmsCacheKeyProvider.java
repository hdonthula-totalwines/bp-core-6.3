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
package de.hybris.platform.acceleratorcms.component.cache;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.regioncache.key.CacheKey;

import javax.servlet.http.HttpServletRequest;


public interface CmsCacheKeyProvider<C extends AbstractCMSComponentModel>
{
	CacheKey getKey(HttpServletRequest request, C component);
}
