package com.intertech.jss.polymorphism;

public class TechWriter extends Employee {
	private double rate = 20.00;
	private int hoursWorked = 40;

	public double pay() {
		return (rate * hoursWorked);
	}
}
