package com.intertech.interfacepractice;

public class Programmer extends Employee {
	private int linesOfCode = 1000;
	private double payPerLinesOfCode = 3.00;

	public double pay() {
		return (linesOfCode * payPerLinesOfCode);
	}

}
