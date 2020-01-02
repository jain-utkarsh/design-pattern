package com.design.pattern.structural.facade;

public class OrderServiceImpl implements OrderService {
	
	PaymentService paymentService = new PaymentService();
	EmailService emailService = new EmailService();
	InvertoryService inventoryService = new InvertoryService();
	
	@Override
	public void placeOrder() {
		inventoryService.checkInventory();
		paymentService.processPayment();
		emailService.sendEmail(); 
	}

}
