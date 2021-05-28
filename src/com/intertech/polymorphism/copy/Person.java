package com.intertech.polymorphism.copy;

public class Person {

	String firstName = "Hisham";
	String lastName = "Raihan";

	public String getDescription() {
		System.out.println("In Person");
		return firstName + " "+  lastName;
	}
}
