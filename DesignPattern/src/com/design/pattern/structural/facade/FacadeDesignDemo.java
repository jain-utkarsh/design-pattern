package com.design.pattern.structural.facade;

public class FacadeDesignDemo {
	public static void main(String[] args) {
		OrderService orderService = new OrderServiceImpl();
		orderService.placeOrder();
	}
}
