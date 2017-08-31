//
// HYBAddress.h
// [y] hybris Platform
//
// Copyright (c) 2000-2016 hybris AG
// All rights reserved.
//
// This software is the confidential and proprietary information of hybris
// ("Confidential Information"). You shall not disclose such Confidential
// Information and shall use it only in accordance with the terms of the
// license agreement you entered into with hybris.
//
// Warning:This file was auto-generated by OCC2Ojbc.
//

#import <Foundation/Foundation.h>
#import "MTLModel.h"
#import "MTLJSONAdapter.h"

@class HYBCountry;
@class HYBRegion;


@interface HYBAddress : MTLModel <MTLJSONSerializing>

@property (nonatomic) NSString *lastName;
@property (nonatomic) HYBCountry *country;
@property (nonatomic) NSString *town;
@property (nonatomic) NSString *companyName;
@property (nonatomic) NSString *postalCode;
@property (nonatomic) NSString *title;
@property (nonatomic) NSString *titleCode;
@property (nonatomic) NSString *firstName;
@property (nonatomic) NSString *formattedAddress;
@property (nonatomic) NSString *phone;
@property (nonatomic) BOOL visibleInAddressBook;
@property (nonatomic) BOOL shippingAddress;
@property (nonatomic) NSString *id;
@property (nonatomic) HYBRegion *region;
@property (nonatomic) NSString *line2;
@property (nonatomic) NSString *line1;
@property (nonatomic) NSString *email;


+ (instancetype)addressWithParams:(NSDictionary*)params;

@end