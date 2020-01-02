package com.design.pattern.creational.prototype;

public class Employee implements Cloneable {

	private String fName;
	private String lName;
	private String email;
	
	
	public Employee(String fName, String lName, String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}

	protected Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
