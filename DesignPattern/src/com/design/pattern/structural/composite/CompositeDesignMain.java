package com.design.pattern.structural.composite;

public class CompositeDesignMain {

	public static void main(String[] args) {
		Employee manager1 = new Manager("Manager 1", "Manager Last 1");
		Employee manager2 = new Manager("Manager 2", "Manager Last 2");
		Employee engineer1 = new Engineer("Engineer 1", "Engineer Last 1");
		Employee engineer2 = new Engineer("Engineer 2", "Engineer Last 2");
		
		Composite c = new Composite();
		c.addEmployee(manager1); 
		c.addEmployee(manager2); 
		c.addEmployee(engineer1); 
		c.addEmployee(engineer2); 
		
		c.showEmployee();
	}
}
