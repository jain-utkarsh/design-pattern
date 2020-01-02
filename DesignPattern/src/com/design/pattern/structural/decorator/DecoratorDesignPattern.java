package com.design.pattern.structural.decorator;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		Coffee baseCoffee = new BaseCoffee(20, "Base Coffee", "This is a base coffee", 5d);
		baseCoffee.coffeeName();
		System.out.println(baseCoffee.coffeePrice());
		System.out.println(baseCoffee.coffeeCalorie());
		baseCoffee.coffeeDecription();
		
		Coffee caramelCoffee = new AddCaramelDecorator(baseCoffee);
		caramelCoffee.coffeeName();
		System.out.println(caramelCoffee.coffeePrice());
		System.out.println(caramelCoffee.coffeeCalorie());
		caramelCoffee.coffeeDecription();
	}
}
