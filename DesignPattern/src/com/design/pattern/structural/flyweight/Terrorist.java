package com.design.pattern.structural.flyweight;

public class Terrorist implements Player {

	String defaultWeapon;
	String task;
	
	public Terrorist() {
		defaultWeapon = "Terrorist Pistol";
		task = "Plant the bomb";
	}
	@Override
	public void setWeapon(String weapon) {
		defaultWeapon = weapon;
	}

	@Override
	public void playerWork() {
		System.out.println("Terrorist [defaultWeapon=" + defaultWeapon + ", task=" + task + "]"); 
	}

}
