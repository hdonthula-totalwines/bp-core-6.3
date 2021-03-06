/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25 Aug 2017 4:31:27 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.warehousingwebservices.dto.order;

public  class DeclineEntryWsDTO  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>DeclineEntryWsDTO.productCode</code> property defined at extension <code>warehousingwebservices</code>. */
		
	private String productCode;

	/** <i>Generated property</i> for <code>DeclineEntryWsDTO.quantity</code> property defined at extension <code>warehousingwebservices</code>. */
		
	private Long quantity;

	/** <i>Generated property</i> for <code>DeclineEntryWsDTO.reallocationWarehouseCode</code> property defined at extension <code>warehousingwebservices</code>. */
		
	private String reallocationWarehouseCode;

	/** <i>Generated property</i> for <code>DeclineEntryWsDTO.reason</code> property defined at extension <code>warehousingwebservices</code>. */
		
	private String reason;

	/** <i>Generated property</i> for <code>DeclineEntryWsDTO.comment</code> property defined at extension <code>warehousingwebservices</code>. */
		
	private String comment;
	
	public DeclineEntryWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

		
	
	public String getProductCode() 
	{
		return productCode;
	}
	
		
	
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}

		
	
	public Long getQuantity() 
	{
		return quantity;
	}
	
		
	
	public void setReallocationWarehouseCode(final String reallocationWarehouseCode)
	{
		this.reallocationWarehouseCode = reallocationWarehouseCode;
	}

		
	
	public String getReallocationWarehouseCode() 
	{
		return reallocationWarehouseCode;
	}
	
		
	
	public void setReason(final String reason)
	{
		this.reason = reason;
	}

		
	
	public String getReason() 
	{
		return reason;
	}
	
		
	
	public void setComment(final String comment)
	{
		this.comment = comment;
	}

		
	
	public String getComment() 
	{
		return comment;
	}
	


}