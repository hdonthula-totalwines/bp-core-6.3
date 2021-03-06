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
package de.hybris.platform.mobileservices.text;

import static junit.framework.Assert.assertNotNull;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.mobileservices.model.text.MobileMessageContextModel;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class AliasesTest extends StatusRecordTestBase
{
	private static final Logger LOG = Logger.getLogger(AliasesTest.class.getName());

	@Before
	public void createConfiguration2() throws Exception
	{
		JaloSession.getCurrentSession().setUser(UserManager.getInstance().getAdminEmployee());
		importCsv("/testdata/testdata02.csv", "UTF-8");

	}

	@Test
	public void testAliases() throws Exception
	{
		final String pk = messageReceived("ES", "ES", "111", "34699111222", "Hello Ho");
		assertNotNull("Message count bot be passed to the reception layer", pk);
		LOG.info("Got pk " + pk);
		final MobileMessageContextModel message = waitForMessageToBeProcessed(pk);
		assertMessageSuccessfulyProcessed(message, assertSent, assertNoError, assertIsNotDefaultAction);
	}

}
