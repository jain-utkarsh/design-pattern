package com.design.pattern.structural.flyweight;

public class CounterTerrorist implements Player {

	String defaultWeapon;
	String task;
	
	public CounterTerrorist() {
		defaultWeapon = "counterTerrorist Pistol";
		task = "Defuse bomb";
	}
	@Override
	public void setWeapon(String weapon) {
		defaultWeapon = weapon;
	}

	@Override
	public void playerWork() {
		System.out.println("CounterTerrorist [defaultWeapon=" + defaultWeapon + ", task=" + task + "]"); 
	}
	

}
