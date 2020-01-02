package com.design.pattern.prototype;

public class PrototypeMain {
	public static void main(String args[]) {
		Employee e1 = new Employee("Urkarsh", "Jain", "utkarsh.jain@xyz.com");
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
