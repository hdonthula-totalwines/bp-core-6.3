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

package de.hybris.platform.atddengine.keywords;


public final class KeywordLibraryContextHolder
{
	private static ThreadLocal<KeywordLibraryContext> threadLocal = new ThreadLocal<KeywordLibraryContext>();

	public static KeywordLibraryContext getKeywordLibraryContext()
	{
		return threadLocal.get();
	}

	public static void setKeywordLibraryContext(final KeywordLibraryContext keywordLibraryContext)
	{
		threadLocal.set(keywordLibraryContext);
	}

	private KeywordLibraryContextHolder()
	{

	}

}
