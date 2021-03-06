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
package de.hybris.platform.stocknotificationfacades.populators;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerinterestsservices.productinterest.ProductInterestService;
import de.hybris.platform.notificationservices.enums.NotificationType;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;


public class ProductWatchingPopulator implements Populator<ProductModel, ProductData>
{

	@Resource(name = "productInterestService")
	private ProductInterestService productInterestService;

	@Resource(name = "baseStoreService")
	private BaseStoreService baseStoreService;

	@Resource(name = "baseSiteService")
	private BaseSiteService baseSiteService;

	@Resource(name = "userService")
	private UserService userService;

	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		final BaseStoreModel baseStore = getBaseStoreService().getCurrentBaseStore();
		final BaseSiteModel baseSite = getBaseSiteService().getCurrentBaseSite();
		final UserModel currentUser = getUserService().getCurrentUser();
		if (currentUser instanceof CustomerModel)
		{
			final CustomerModel customer = (CustomerModel) currentUser;
			if (getProductInterestService().getProductInterest(source, customer, NotificationType.BACK_IN_STOCK, baseStore, baseSite)
					.isPresent())
			{
				target.setIsWatching(Boolean.TRUE);
			}
		}

	}


	protected ProductInterestService getProductInterestService()
	{
		return productInterestService;
	}

	@Required
	public void setProductInterestService(final ProductInterestService productInterestService)
	{
		this.productInterestService = productInterestService;
	}


	protected BaseStoreService getBaseStoreService()
	{
		return baseStoreService;
	}


	@Required
	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}


	protected BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}


	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}


	protected UserService getUserService()
	{
		return userService;
	}


	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}


}
