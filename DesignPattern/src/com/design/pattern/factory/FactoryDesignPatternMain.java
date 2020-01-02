package com.design.pattern.factory;

public class FactoryDesignPatternMain {

	public static void main(String args[]) {
		Shape circle = ShapeFactory.getInstance(ShapeType.CIRCLE);
		Shape rectangle = ShapeFactory.getInstance(ShapeType.RECTANGLE);
		Shape square = ShapeFactory.getInstance(ShapeType.SQAURE);
		
		circle.draw();
		rectangle.draw();
		square.draw();
	}
}
