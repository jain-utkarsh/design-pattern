package com.design.pattern.behavioural.template;

public class TemplateDesignPatternDemo {

	public static void main(String[] args) {
		Payment ccPayment = new CCPayment(new Order(2d)); 
		System.out.println(ccPayment.orderEligibleForPayment());
		
		Payment paytmPayment = new PayTmPayment(new Order(0.2d)); 
		System.out.println(paytmPayment.orderEligibleForPayment());
	}
}
