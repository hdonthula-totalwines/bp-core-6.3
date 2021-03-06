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
package de.hybris.platform.acceleratorservices.email.impl;

import de.hybris.platform.acceleratorservices.email.CMSEmailPageService;
import de.hybris.platform.acceleratorservices.email.dao.EmailPageDao;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.internal.service.AbstractBusinessService;

import org.springframework.beans.factory.annotation.Required;


/**
 * Service to handle CMS EmailPage and EmailPageTemplate.
 */
public class DefaultCMSEmailPageService extends AbstractBusinessService implements CMSEmailPageService
{
	private EmailPageDao emailPageDao;

	protected EmailPageDao getEmailPageDao()
	{
		return emailPageDao;
	}

	@Required
	public void setEmailPageDao(final EmailPageDao emailPageDao)
	{
		this.emailPageDao = emailPageDao;
	}

	@Override
	public EmailPageModel getEmailPageForFrontendTemplate(final String frontendTemplateName,
			final CatalogVersionModel catalogVersion)
	{
		return getEmailPageDao().findEmailPageByFrontendTemplateName(frontendTemplateName, catalogVersion);
	}
}
