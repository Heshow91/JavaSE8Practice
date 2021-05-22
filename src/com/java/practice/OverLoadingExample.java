package com.java.practice;

public class OverLoadingExample {

	public static void sayHello(String firtName) {

	}

	public static void sayHello(String firtName, int dob) {

	}

	public static void main(String[] args) {
		sayHello("Jay", 80);
	}
}
