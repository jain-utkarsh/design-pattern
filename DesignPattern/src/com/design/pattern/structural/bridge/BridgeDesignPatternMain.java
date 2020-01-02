package com.design.pattern.structural.bridge;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		Workshop workShop1 = new Produce();
		Workshop workShop2 = new Assemble();
		Vehicle b = new Bike(workShop1, workShop2);
		b.vehicleBuild();
		
		Workshop workShopCar = new Produce();
		Workshop workShop2Car = new Assemble();
		Vehicle c = new Car(workShopCar, workShop2Car);
		c.vehicleBuild();
		
	}
}
