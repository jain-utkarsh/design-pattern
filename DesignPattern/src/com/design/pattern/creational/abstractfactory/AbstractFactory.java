package com.design.pattern.creational.abstractfactory;

public class AbstractFactory {

	public static Factory getFactory(boolean roundedFactory) {
		if(roundedFactory) return new RoundedShapeFactory();
		return new SimpleShapeFactory();
	}
	
}
