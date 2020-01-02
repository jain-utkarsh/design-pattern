package com.design.pattern.behavioural.template;

public class PayTmPayment extends Payment{

	private double payDiscount = 0.2;
	
	Order order;
	
	public PayTmPayment(Order order) {
		super();
		this.order = order;
	}

	@Override
	public double orderAmount() {
		return order.getOrderAmount() - payDiscount;
	}

	@Override
	public void chargeOrder() {
		System.out.println("Charging order from Paytm Wallet");
	}

	@Override
	public void sendPaymentNotification() {
		System.out.println("Send Payment Notification"); 
	}

}
