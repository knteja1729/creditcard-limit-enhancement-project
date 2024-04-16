/* @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. we should not disclose the information outside
 * otherwise terms and conditions will apply
 */
package com.tesco.enquiry.model;

/**
 * @author NarendraTeja by 06-Aug-2023
 *
 */


public class EnquiryResponse {
	
	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
		return cardNum;
	}
	/**
	 * @param cardNum the cardNum to set
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the availableAmount
	 */
	public long getAvailableAmount() {
		return availableAmount;
	}
	/**
	 * @param availableAmount the availableAmount to set
	 */
	public void setAvailableAmount(long availableAmount) {
		this.availableAmount = availableAmount;
	}
	/**
	 * @return the increaseAmount
	 */
	public long getIncreaseAmount() {
		return increaseAmount;
	}
	/**
	 * @param increaseAmount the increaseAmount to set
	 */
	public void setIncreaseAmount(long increaseAmount) {
		this.increaseAmount = increaseAmount;
	}
	/**
	 * @return the increasePer
	 */
	public float getIncreasePer() {
		return increasePer;
	}
	/**
	 * @param increasePer the increasePer to set
	 */
	public void setIncreasePer(float increasePer) {
		this.increasePer = increasePer;
	}
	private String cardNum;
	private String cvv;
	private long availableAmount;
	private long increaseAmount;
	private float increasePer;

}
