package com.design.pattern.factory;

public class ShapeFactory {

	public static Shape getInstance(ShapeType shapeType) {
		if(shapeType == ShapeType.CIRCLE) {
			return new Circle();
		}
		else if(shapeType == ShapeType.SQAURE) {
			return new Sqaure();
		}
		else {
			return new Rectangle();
		}
	}
}
