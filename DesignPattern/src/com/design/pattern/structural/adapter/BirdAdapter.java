package com.design.pattern.structural.adapter;

public class BirdAdapter implements Bird {
	
	ToyBird toyBird;
	
	public BirdAdapter(ToyBird toyBird) {
		this.toyBird = toyBird;
	}

	@Override
	public void tweet() {
		toyBird.makeRoboticSound();
	}

}
