package com.design.pattern.behavioural.iterator;

public class InteratorDesignPattern {
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		CustomIterator customIterator = list.iterator();
		while(customIterator.hasNext()) {
			Emloyee e = (Emloyee) customIterator.next();
			System.out.println(e.id); 
		}
	}
}
