/* @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. we should not disclose the information outside
 * otherwise terms and conditions will apply
 */
package com.tesco.enquiry.service;

import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;

/**
 * @author NarendraTeja by 06-Aug-2023
 *
 */
public interface ICreditLimitEnquiryService {
	
	public EnquiryResponse enquiry(EnquiryRequest creditLimitRequest);

}
