package com.design.pattern.structural.composite;

public class Manager implements Employee {

	String fName;
	String lName;
	boolean isManager;
	
	public Manager(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.isManager = true;
	}

	public void showEmployee(){
		System.out.println("Manager [fName=" + fName + ", lName=" + lName + ", isManager=" + isManager + "]");
	}

}
