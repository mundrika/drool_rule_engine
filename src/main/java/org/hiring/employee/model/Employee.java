package org.hiring.employee.model;

public class Employee {
	String name;
	int age;
	boolean eligibiltyStatus;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getEligibiltyStatus() {
		return eligibiltyStatus;
	}
	public void setEligibiltyStatus(boolean eligibiltyStatus) {
		this.eligibiltyStatus = eligibiltyStatus;
	}

	public String sendResponse() {
		String response =null;
		if (eligibiltyStatus==true) {
			
			response = "Congratulation, "+ this.name + " you are eligible for hiring process !";
			
		}
		else {
			response = "Sorry, "+ this.name + " you are eligible for hiring process !";
		}
		return response;
	}
	
	
}
