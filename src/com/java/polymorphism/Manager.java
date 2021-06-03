package com.java.polymorphism;

public class Manager extends Employee {
	public String department;

	public String toString() {
		return super.toString() + " Managers: " + department;
	}
}
