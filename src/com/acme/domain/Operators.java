package com.acme.domain;

public class Operators {

	public static void main(String[] args) {

		boolA();
		System.out.println("****************");
		increment();
		System.out.println("****************");
		ternary();
		System.out.println("****************");
		precedence();
	}

	static public boolean isSleeping() {
		System.out.println("isSleeping() ");
		return false;
	}

	static public boolean isHome() {
		System.out.println("isHome() ");
		return true;
	}

	public static void boolA() {
		if (isSleeping() || isHome()) {
			System.out.println("BoolA: Shhh... Wayels Sleeping");
		}
	}

	public static void increment() {
		int x = 0;
		// x++ old value 0 new value 1 then return old value
		// ++x old value 1 new value 2 then return new value
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);

		System.out.println("for y ");
		int y = 0;
		y = y++;
		// ++y;
		System.out.println(y);
	}

	public static void ternary() {
		String status = "";
		if (isSleeping()) {
			status = "Sleeping";
		} else {
			status = "Working";
		}
		String status2 = isSleeping() ? "Sleeping" : "Working";
	}
	public static void precedence() {
		int x = 3 + 2 * 5;
		int y = (3+2) * 5;
		System.out.println(x);
		System.out.println(y);
	}
	
}
