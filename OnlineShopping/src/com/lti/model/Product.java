package com.lti.model;

public class Product {
	int productId;
	String productName;
	String productDescription;

	int quantity;
	double price;
	
	public double getPrice(){
	         return price;
	}
	public int getQuantity(){
	         return quantity;
	}

        public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
