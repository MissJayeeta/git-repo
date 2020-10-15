package com.lti.model;

public class Customer {
	int custId;
	String custName;
	String custCity;

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

}
