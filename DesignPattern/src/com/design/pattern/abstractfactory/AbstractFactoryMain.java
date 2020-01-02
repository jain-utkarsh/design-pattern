package com.design.pattern.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String args []) {
		Factory roundedFactory = AbstractFactory.getFactory(true);
		Factory simpleFactory = AbstractFactory.getFactory(false);
		
		Shape roundedSqaure = roundedFactory.getShape("square");
		Shape roundedRectangle = roundedFactory.getShape("rectangle");
		Shape rectangle = simpleFactory.getShape("rectangle");
		Shape sqaure = simpleFactory.getShape("sqaure");
		
		roundedSqaure.draw();
		roundedRectangle.draw();
		rectangle.draw();
		sqaure.draw();

	}
}
