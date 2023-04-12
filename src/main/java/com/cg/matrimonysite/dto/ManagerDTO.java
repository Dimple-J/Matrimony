package com.cg.matrimonysite.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class ManagerDTO {
    
	
	private int subId;
	
	@NotBlank(message ="Enter Month")
	@Max(value=12)
	private int subMonth;
	@NotBlank(message="Enter a valid year")
	@Max(value=3)
	private int subYear;
	@NotBlank(message="Amount field cannot be blank")
	private double amount;
	@NotBlank(message="Enter subscription type")
	@Max(value=15)
	private String subType;
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getSubMonth() {
		return subMonth;
	}
	public void setSubMonth(int subMonth) {
		this.subMonth = subMonth;
	}
	public int getSubYear() {
		return subYear;
	}
	public void setSubYear(int subYear) {
		this.subYear = subYear;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	
	
}
