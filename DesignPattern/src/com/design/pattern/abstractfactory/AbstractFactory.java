package com.design.pattern.abstractfactory;

public class AbstractFactory {

	public static Factory getFactory(boolean roundedFactory) {
		if(roundedFactory) return new RoundedShapeFactory();
		return new SimpleShapeFactory();
	}
	
}
