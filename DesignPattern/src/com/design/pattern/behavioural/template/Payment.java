package com.design.pattern.behavioural.template;

public abstract class Payment {

	public boolean orderEligibleForPayment() {
		if(orderAmount() > 0) { 
			return true;
		}
		return false;
	}
	
	public abstract double orderAmount();
	
	public abstract void chargeOrder();
	
	public abstract void sendPaymentNotification();
}
