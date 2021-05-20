package com.java.practice;

public class Operators {

	public static void main(String[] args) {

		someBoolOperators();
		System.out.println("*******************");
		arithmeticOperators();
	}

	public static void someBoolOperators() {
		boolean courseInSession = true;
		int lectureCount = 150;

		if (!courseInSession) {
			System.out.println("Course is not in session.");
		}
		if (lectureCount != 150) {
			System.out.println("The lecture count is somthing other than 150");
		}
		if (lectureCount == 150) {
			System.out.println("The lecture count is 150");
		}
		if (lectureCount < 10) {
			System.out.println("Lecture count is less than 10");
		} else if (lectureCount >= 20 && lectureCount <= 30) {
			System.out.println("Lecture count is between 20 and 30");
		} else if (lectureCount > 100) {
			System.out.println("Lecture count is 101 or greater");
		}
	}

	public static void arithmeticOperators() {
		int x = 0;
		x = x + 5;
		System.out.println(x);
		x += 5; // same as x + 5
		System.out.println(x);
		x -= 5; // same as x - 5
		System.out.println(x);
		x /= 5; // same as x / 5
		System.out.println(x);
		x %= 5; // same as x % 5
		System.out.println(x);

	}
}
