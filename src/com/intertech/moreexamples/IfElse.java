package com.intertech.moreexamples;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean inMinneapolis = false;
		boolean inSaintPaul = true;

		if (!inMinneapolis) {

			System.out.println("Hello from Minneapolis!");

		} else if (inSaintPaul) {

			System.out.println("Hello from Saint Paul");
		} else {
			System.out.println("Hello from somewhere!");
			System.out.println("..can we visit you in St Paul");
		}
		System.out.println("Can we visit you sometime?");
		
		
		int myAge = 29;
		// boolean literal
		if (true) {

		}
		// boolean operator (>= is 'greater than or equal to')
		if (myAge <= 40) {
			System.out.println("29 years old");
		}

	}

	// boolean return value from a method
	boolean doSomething() {
		return true;
	}

}
