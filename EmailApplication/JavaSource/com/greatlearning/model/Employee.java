package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;

	// Default Constructor
	public Employee() {
	}

	// parameterized constructor

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// setters

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	// getters
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

}
