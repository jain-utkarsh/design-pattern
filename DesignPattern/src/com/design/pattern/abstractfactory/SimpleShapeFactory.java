package com.design.pattern.abstractfactory;

public class SimpleShapeFactory implements Factory {

	@Override
	public Shape getShape(String shape){
		if(shape.equalsIgnoreCase("sqaure")) {
			return new Sqaure();
		}
		return new Rectangle();
	}

}
