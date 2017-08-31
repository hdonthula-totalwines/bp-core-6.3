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
package de.hybris.platform.timedaccesspromotionsstorefront.jalo;

import de.hybris.platform.timedaccesspromotionsstorefront.jalo.GeneratedTimedaccesspromotionsstorefrontManager;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.timedaccesspromotionsstorefront.constants.TimedaccesspromotionsstorefrontConstants;

import org.apache.log4j.Logger;


@SuppressWarnings("PMD")
public class TimedaccesspromotionsstorefrontManager extends GeneratedTimedaccesspromotionsstorefrontManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TimedaccesspromotionsstorefrontManager.class.getName());

	public static final TimedaccesspromotionsstorefrontManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TimedaccesspromotionsstorefrontManager) em.getExtension(TimedaccesspromotionsstorefrontConstants.EXTENSIONNAME);
	}

}
