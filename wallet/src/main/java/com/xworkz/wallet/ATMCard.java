package com.xworkz.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ATMCard {
	
	@Value("${cardNo}")
	private long cardNo;
	
	@Value("${cvv}")
	private int cvv;
	
	@Value("${cardType}")
	private CARDTYPE cardType;
	
	@Value("${color}")
	private String color;
	
	@Value("${expiryDate}")
	private String expiryDate; 
	
	
	public ATMCard() {
		System.out.println(this.getClass().getSimpleName()+" Beam Created");
		
	}


	public ATMCard(long cardNo, int cvv, CARDTYPE cardType, String color, String expiryDate) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.cardType = cardType;
		this.color = color;
		this.expiryDate = expiryDate;
	}


	public long getCardNo() {
		return cardNo;
	}


	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public CARDTYPE getCardType() {
		return cardType;
	}


	public void setCardType(CARDTYPE cardType) {
		this.cardType = cardType;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	@Override
	public String toString() {
		return "ATMCard [cardNo=" + cardNo + ", cvv=" + cvv + ", cardType=" + cardType + ", color=" + color
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	

}
