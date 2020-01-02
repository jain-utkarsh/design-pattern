package com.design.pattern.structural.decorator;

public class BaseCoffee extends Coffee{

	
	public BaseCoffee(int calorie, String coffeeName, String coffeeDescription, double price) {
		super(calorie, coffeeName, coffeeDescription, price);
	}

	@Override
	public void coffeeName() {
		System.out.println(this.coffeeName);
	}

	@Override
	public void coffeeDecription() {
		System.out.println(this.coffeeDescription);
	}

	@Override
	public Double coffeePrice() {
		return this.price;
	}

	@Override
	public int coffeeCalorie() {
		return this.calorie;
	}

	
}
