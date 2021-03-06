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
package de.hybris.platform.commerceservices.search.solrfacetsearch.provider.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ConfiguratorSettingsService;
import de.hybris.platform.product.model.AbstractConfiguratorSettingModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test suite for {@link ProductConfigurableValueProvider}
 */
@UnitTest
public class ProductConfigurableValueProviderTest
{

	@InjectMocks
	private final ProductConfigurableValueProvider valueProvider = new ProductConfigurableValueProvider();

	@Mock
	private FieldNameProvider fieldNameProvider;
	@Mock
	private ConfiguratorSettingsService configuratorSettingsService;

	private IndexConfig indexConfig;
	private IndexedProperty indexedProperty;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		indexConfig = new IndexConfig();
		indexedProperty = new IndexedProperty();
	}

	@After
	public void noMoreInteractions()
	{
		Mockito.verifyNoMoreInteractions(fieldNameProvider, configuratorSettingsService);
	}

	@Test
	public void testGetFieldValuesItemModelClass()
	{
		ItemModel model = new ItemModel();

		try
		{
			valueProvider.getFieldValues(indexConfig, indexedProperty, model);
			Assert.fail("Expecting getFieldValues method to throw an exception when model is instance of ItemModel");
		}
		catch (FieldValueProviderException e)
		{
			Assert.assertEquals("Can not populate 'configurable' field: model nullis not a product", e.getMessage());
		}
	}

	@Test
	public void testGetFieldValuesWrongClass()
	{
		Object model = new Object();

		try
		{
			valueProvider.getFieldValues(indexConfig, indexedProperty, model);
			Assert.fail("Expecting getFieldValues method to throw an exception when model is not instance of ProductModel");
		}
		catch (FieldValueProviderException e)
		{
			Assert.assertEquals("Can not populate 'configurable' field: model's class java.lang.Object can not be cast to ProductModel", e.getMessage());
		}
	}

	@Test
	public void testGetFieldValuesNotConfigurable() throws FieldValueProviderException
	{
		testGetFields(Collections.emptyList(), false);
	}

	@Test
	public void testGetFieldValuesConfigurable() throws FieldValueProviderException
	{
		AbstractConfiguratorSettingModel settingModel = new AbstractConfiguratorSettingModel();
		testGetFields(Collections.singletonList(settingModel), true);
	}

	protected void testGetFields(List<AbstractConfiguratorSettingModel> settingModels, boolean expectedValue) throws FieldValueProviderException
	{
		ProductModel productModel = new ProductModel();

		BDDMockito.given(configuratorSettingsService.getConfiguratorSettingsForProduct(productModel))
				.willReturn(settingModels);
		BDDMockito.given(fieldNameProvider.getFieldNames(indexedProperty, null))
				.willReturn(Arrays.asList("field name", "field name2"));

		List<FieldValue> fieldValueList = new ArrayList<>(valueProvider.getFieldValues(indexConfig, indexedProperty, productModel));

		Assert.assertEquals(2, fieldValueList.size());
		Assert.assertEquals("field name", fieldValueList.get(0).getFieldName());
		Assert.assertEquals(expectedValue, fieldValueList.get(0).getValue());
		Assert.assertEquals("field name2", fieldValueList.get(1).getFieldName());
		Assert.assertEquals(expectedValue, fieldValueList.get(1).getValue());

		Mockito.verify(configuratorSettingsService).getConfiguratorSettingsForProduct(productModel);
		Mockito.verify(fieldNameProvider).getFieldNames(indexedProperty, null);
	}
}
