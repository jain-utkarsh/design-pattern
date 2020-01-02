package com.design.pattern.structural.adapter;

public class AdapterDesignMain {
	public static void main(String[] args) {
		Bird bird = new Parrot();
		bird.tweet();
		
		ToyBird toybird = new ToyBirdTweety();
		BirdAdapter birdAdapter = new BirdAdapter(toybird);
		birdAdapter.tweet();
	}
}
