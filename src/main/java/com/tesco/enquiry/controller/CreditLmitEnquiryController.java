/* @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. we should not disclose the information outside
 * otherwise terms and conditions will apply
 */
package com.tesco.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;
import com.tesco.enquiry.service.ICreditLimitEnquiryService;
import com.tesco.enquiry.vaidator.CreditLimitEnquiryValidator;

/**
 * @author NarendraTeja by 06-Aug-2023
 *
 */

@RestController
@RequestMapping("/v1")
public class CreditLmitEnquiryController {
	
	@Autowired
	private CreditLimitEnquiryValidator creditLimitEnquiryValidator;
	
	@Autowired
	private ICreditLimitEnquiryService creditLimitServive;
	
	@GetMapping("/enquiry/{promocode}")
	public EnquiryResponse enquiry(@PathVariable("promocode") String promocode,
									   @RequestHeader("client_Id") String clientId,
									   @RequestHeader("channel_Id") String channelId,
									   @RequestHeader("message_ts") String messageTimeStamp,
									   @RequestHeader("request_Id") String requestId) {
		
		//1--Get the request from client/consumer
		
		//2-- Validate Request
		
		EnquiryRequest creditLimitRequest = new EnquiryRequest();
		
		creditLimitEnquiryValidator.valdateRequest(creditLimitRequest);
		
		//3--Prepare the request for Service class
		EnquiryResponse enquiryResponse = creditLimitServive.enquiry(creditLimitRequest);
		
		//4--call service class and get the response
		
		
		
		return null;
	}
	
	
}
