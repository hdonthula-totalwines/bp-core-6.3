/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.hybris.cis.client.shared.exception;


import com.hybris.cis.client.shared.exception.codes.StandardServiceExceptionCodes;
import com.hybris.cis.client.shared.exception.codes.ServiceExceptionDetail;

import java.util.List;


/**
 * Indicates that an internal error occured in CIS. This should never happen and if it does, a bug needs to be fixed.
 */
public class InternalServerErrorException extends AbstractCisClientException
{
	private static final long serialVersionUID = -981349022802378073L;

	public InternalServerErrorException(final Exception e)
	{
		super(new ServiceExceptionDetail(StandardServiceExceptionCodes.INTERNAL_SERVER_ERROR, e.getClass().getName() + " : "
				+ e.getMessage()));
	}

    public InternalServerErrorException(List<ServiceExceptionDetail> details)
    {
        super(details);
    }
}
