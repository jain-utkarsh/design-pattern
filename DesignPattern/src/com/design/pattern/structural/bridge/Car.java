package com.design.pattern.structural.bridge;

public class Car extends Vehicle {

	String vehicle;

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		this.vehicle = "Car";
	}

	@Override
	public void vehicleBuild() {
		System.out.println("Car [vehicle=" + vehicle + "]");
		workshop1.work();
		workshop2.work();
	}

}
