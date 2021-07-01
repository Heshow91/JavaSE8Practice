package com.enthuware.interfacetest;

public interface Interface1 {
	String m = "Mister Man";

	default void sayHey(String n) {
		System.out.println("Hey From Interface 1" + n);
	}

	default void sayName() {
		// doesn't have access to instance variables
		System.out.println("Hey this is name from Interface 1 " + m);
	}
	public static void call() {
		System.out.println("We are calling static from Interface 1 ");
	}
}
