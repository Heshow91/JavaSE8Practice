package com.intertech.interfacepractice;

public class Manager extends Employee {
	private double salary = 75000.00;
	private double bonus = 10000.00;

	public double pay() {
		return (salary / 24) + (bonus / 24);
	}
}
