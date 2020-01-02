package com.design.pattern.creational.abstractfactory;

public class RoundedShapeFactory implements Factory {

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}
		return new RoundedRectangle();
	}

}
