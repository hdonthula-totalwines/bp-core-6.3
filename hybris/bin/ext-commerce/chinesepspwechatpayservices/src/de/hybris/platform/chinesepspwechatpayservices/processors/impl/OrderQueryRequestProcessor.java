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
package de.hybris.platform.chinesepspwechatpayservices.processors.impl;

import de.hybris.platform.chinesepspwechatpayservices.data.WeChatPayQueryResult;
import de.hybris.platform.chinesepspwechatpayservices.exception.WeChatPayException;
import de.hybris.platform.chinesepspwechatpayservices.processors.AbstractWeChatPayRequestProcessor;
import de.hybris.platform.chinesepspwechatpayservices.wechatpay.WeChatPayConfiguration;
import de.hybris.platform.chinesepspwechatpayservices.wechatpay.WeChatPayHttpClient;
import de.hybris.platform.chinesepspwechatpayservices.wechatpay.WeChatPayUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.SAXException;

import groovy.util.Node;
import groovy.util.XmlParser;


/**
 * Processor to query order status in WeChat
 */
public class OrderQueryRequestProcessor extends AbstractWeChatPayRequestProcessor<Optional<WeChatPayQueryResult>>
{
	public OrderQueryRequestProcessor(final WeChatPayHttpClient httpClient, final String orderId,
			final WeChatPayConfiguration config)
	{
		super(config, httpClient);
		this.setUrl(config.getOrderQueryURL());
		this.addParameter("mch_id", config.getMechId());
		this.addParameter("nonce_str", getParams().generateNonce());
		this.addParameter("out_trade_no", orderId);
		this.addParameter("appid", config.getAppId());
		this.addParameter("sign", getParams().generateSignature(getConfig().getMechKey()));
	}

	@Override
	public Optional<WeChatPayQueryResult> process()
	{
		try
		{
			final String result = post();
			final Map<String, String> unifyResponseMap;
			final Node notifyXml = new XmlParser().parseText(result);
			unifyResponseMap = (Map<String, String>) notifyXml.children().stream().filter(x -> ((Node) x).children().size() > 0)
					.collect(Collectors.toMap(k -> ((Node) k).name(), k -> ((Node) k).children().get(0).toString()));
			final WeChatPayQueryResult weChatPayQueryResult = new WeChatPayQueryResult();
			final Map<String, String> camelCaseMap = WeChatPayUtils.convertKey2CamelCase(unifyResponseMap);
			BeanUtils.populate(weChatPayQueryResult, camelCaseMap);
			return Optional.of(weChatPayQueryResult);
		}
		catch (IOException | SAXException | ParserConfigurationException | IllegalAccessException | InvocationTargetException
				| WeChatPayException e)
		{
			debug("Problem in handling WeChatPay's query result message");
		}

		return Optional.empty();
	}

}
