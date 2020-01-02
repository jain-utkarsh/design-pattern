package com.design.pattern.structural.decorator;

public class AddCaramelDecorator extends Coffee{

	Coffee coffee;

	public AddCaramelDecorator(Coffee coffee) {
		super(coffee.calorie, coffee.coffeeName, coffee.coffeeDescription, coffee.price); 
		this.coffee = coffee;
	}

	@Override
	public void coffeeName() {
		System.out.println("Caramel " + coffee.coffeeName);
	}

	@Override
	public void coffeeDecription() {
		System.out.println(coffee.coffeeDescription+ " " + "and Caramel");
	}

	@Override
	public Double coffeePrice() {
		return 1 + coffee.price; 
	}

	@Override
	public int coffeeCalorie() {
		return 100 + coffee.calorie;
	}
	
	
}
