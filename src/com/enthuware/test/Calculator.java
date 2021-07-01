package com.enthuware.test;

public abstract class Calculator {
	static void calculate() {
	}
	public static void main(String[] args) {
		System.out.println("calculating");
		Calculator x = null;
		x.calculate();
	}
}
