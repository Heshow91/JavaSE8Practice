package com.intertech.interfacepractice;

import com.intertech.polymorphism.Person;

public abstract class Employee extends Person {
	public double pay() {
		return 0;
	}
	String title = "Associate";

	public String getDescription() {
		System.out.println("In Employee");
		return super.getDescription() + " : " + title;
	}

	public static void main(String[] args) {
		Person p = new Employee();
		System.out.println(p.getDescription());
	}
}
