/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.liveeditaddon.admin.converters.populator;

import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.liveeditaddon.admin.ComponentActionMenuRequestData;
import de.hybris.liveeditaddon.admin.ComponentAdminMenuActionData;
import de.hybris.liveeditaddon.admin.strategies.ComponentAdminActionEnabledStrategy;
import de.hybris.liveeditaddon.enums.CMSComponentAdminAction;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * Test suite for {@link de.hybris.liveeditaddon.admin.converters.populator.SimpleComponentAdminMenuActionPopulator}
 */
@UnitTest
public class SimpleComponentAdminMenuActionPopulatorTest
{
	private final static String TEST_ADDON = "testAddon";
	private final static String ACTION_TYPE_NAME = "actionTypeName";
	@Mock
	private EnumerationService enumerationService;
	private final CMSComponentAdminAction cmsComponentAdminAction = CMSComponentAdminAction.SHOW;
	private SimpleComponentAdminMenuActionPopulator populator;
	@Mock
	private ComponentAdminActionEnabledStrategy componentAdminActionEnabledStrategy;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		populator = new SimpleComponentAdminMenuActionPopulator();
		populator.setEnumerationService(enumerationService);
		populator.setAdminActionEnabledStrategy(componentAdminActionEnabledStrategy);
		populator.setAddOn(TEST_ADDON);
		populator.setType(cmsComponentAdminAction);
		given(enumerationService.getEnumerationName(cmsComponentAdminAction)).willReturn(ACTION_TYPE_NAME);
	}

	@Test
	public void testPopulate()
	{
		final ComponentActionMenuRequestData sourceActionMenuRequestData = new ComponentActionMenuRequestData();
		final ComponentAdminMenuActionData targetAdminMenuActionData = new ComponentAdminMenuActionData();
		given(Boolean.valueOf(componentAdminActionEnabledStrategy.isEnabled(sourceActionMenuRequestData))).willReturn(Boolean.TRUE);
		given(
				Boolean.valueOf(componentAdminActionEnabledStrategy.isVisible(sourceActionMenuRequestData,
						Boolean.TRUE.booleanValue()))).willReturn(Boolean.TRUE);

		populator.populate(sourceActionMenuRequestData, targetAdminMenuActionData);

		Assert.assertEquals(targetAdminMenuActionData.getActionType(), cmsComponentAdminAction);
		Assert.assertEquals(targetAdminMenuActionData.getName(), ACTION_TYPE_NAME);
		Assert.assertEquals(targetAdminMenuActionData.getEnabled(), Boolean.TRUE);
		Assert.assertEquals(targetAdminMenuActionData.getVisible(), Boolean.TRUE);
		Assert.assertEquals(targetAdminMenuActionData.getAddon(), TEST_ADDON);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPopulateWithNullSource()
	{
		final ComponentAdminMenuActionData targetAdminMenuActionData = new ComponentAdminMenuActionData();
		populator.populate(null, targetAdminMenuActionData);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPopulateWithNullTarget()
	{
		final ComponentActionMenuRequestData sourceActionMenuRequestData = new ComponentActionMenuRequestData();
		populator.populate(sourceActionMenuRequestData, null);
	}
}
