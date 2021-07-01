package com.enthuware.Test3;

class Base {
	void method1() throws java.io.IOException, NullPointerException {
		someMethod("arguments");
		// some I/O operations
	}

	int someMethod(String str) {
		if (str == null)
			throw new NullPointerException();
		else
			return str.length();
	}
}

public class HandlingExceptions1 extends Base {
	void method1() {
		someMethod("args");
		System.out.println(someMethod("args"));
	}

	public static void main(String[] args) {
		HandlingExceptions1 hE1 = new HandlingExceptions1();
		hE1.method1();
		System.out.println(hE1.someMethod("This is Garretts"));
	}
}