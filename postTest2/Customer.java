package com.tracking;

public class Customer {
	String custId;
	String custName;
	public Customer(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
}