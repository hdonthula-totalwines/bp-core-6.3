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
package de.hybris.platform.b2b.occ.security;

/**
 * Global class for all Spring Security Access constants. Used .
 */
public final class SecuredAccessConstants
{
	private SecuredAccessConstants()
	{
		//empty to avoid instantiating this constant class
	}

	public static final String ROLE_GUEST = "ROLE_GUEST";
	public static final String ROLE_CUSTOMERGROUP = "ROLE_CUSTOMERGROUP";
	public static final String ROLE_TRUSTED_CLIENT = "ROLE_TRUSTED_CLIENT";
	public static final String ROLE_CUSTOMERMANAGERGROUP = "ROLE_CUSTOMERMANAGERGROUP";
}
