package com.design.pattern.behavioural.template;

public class Order {

	Double orderAmount;
	
	public Order(Double orderAmount) {
		super();
		this.orderAmount = orderAmount;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
}
