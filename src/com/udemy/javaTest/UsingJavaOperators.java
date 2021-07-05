package com.udemy.javaTest;

public class UsingJavaOperators {

	static int x = 3;
	static int y = x + 3;

	public static void main(String[] args) {
		System.out.println(y);
		if ((x != 3) || (y > 5)) {
			System.out.println("Hello");
		} else {
			System.out.println("wtf are you doing");
		}
	}
}
