package com.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {
	
	List<Employee> empList = new ArrayList<>();

	public void addEmployee(Employee e) {
		empList.add(e);
	}
	
	public void remove(Employee e) {
		empList.remove(e);
	}
	
	public void clear() {
		empList.clear();
	}
	
	@Override
	public void showEmployee() {
		empList.forEach((e) -> e.showEmployee()); 
	}
	
	
}
