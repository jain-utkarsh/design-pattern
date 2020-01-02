package com.design.pattern.structural.composite;

public class Engineer implements Employee {

	String fName;
	String lName;
	boolean isManager;
	
	public Engineer(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.isManager = false;
	}

	public void showEmployee(){
		System.out.println("Engineer [fName=" + fName + ", lName=" + lName + ", isManager=" + isManager + "]");
	}
	
}
