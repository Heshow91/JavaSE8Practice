package com.intertech.polymorphism;

public class Person {

	String firstName = "Hisham";
	String lastName = "Raihan";

	public String getDescription() {
		System.out.println("In Person");
		return firstName + " "+  lastName;
	}
}
