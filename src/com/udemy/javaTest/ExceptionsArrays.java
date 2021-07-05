package com.udemy.javaTest;

public class ExceptionsArrays {

	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32 };
		int denom[] = { 2, 0, 4, 4 };
		// catching exceptions allows for the code to run after catching
		// the exception
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] / denom[i]);
			} catch (ArithmeticException ex) {
				System.out.println("Cant divide by zero homie");
			}

			finally {

				System.out.println(numer.length + denom.length);
			}

		}
	}
}
