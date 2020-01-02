package com.design.pattern.structural.bridge;

public class Bike extends Vehicle {

	String vehicle;
	
	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		this.vehicle = "Bike";
	}

	@Override
	public void vehicleBuild() {
		System.out.println("Bike [vehicle=" + vehicle + "]");
		workshop1.work();
		workshop2.work();
	}

}
