package com.design.pattern.structural.proxy;

public class SimpleInternet implements Internet {

	@Override
	public void renderWebsite(String name) {
		System.out.println("Rendering Website : " + name);
	}

}
