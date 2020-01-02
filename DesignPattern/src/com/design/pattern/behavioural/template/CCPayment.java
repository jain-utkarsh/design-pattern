package com.design.pattern.behavioural.template;

public class CCPayment extends Payment {

	Order order;
	
	
	public CCPayment(Order order) {
		super();
		this.order = order;
	}

	@Override
	public double orderAmount() {
		return order.getOrderAmount();
	}

	@Override
	public void chargeOrder() {
		System.out.println("Charging order from CC");
	}

	@Override
	public void sendPaymentNotification() {
		System.out.println("Send Payment Notification"); 
	}

}
