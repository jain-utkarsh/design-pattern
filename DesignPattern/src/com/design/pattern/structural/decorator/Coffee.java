package com.design.pattern.structural.decorator;

public abstract class Coffee {

	int calorie;
	String coffeeName;
	String coffeeDescription; 
	double price;
	
	
	
	public Coffee(int calorie, String coffeeName, String coffeeDescription, double price) {
		super();
		this.calorie = calorie;
		this.coffeeName = coffeeName;
		this.coffeeDescription = coffeeDescription;
		this.price = price;
	}

	public abstract void coffeeName();
	
	public abstract void coffeeDecription();
	
	public abstract Double coffeePrice();
	
	public abstract int coffeeCalorie();
	
	
	
}
