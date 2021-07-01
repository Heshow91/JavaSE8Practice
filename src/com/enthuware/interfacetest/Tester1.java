package com.enthuware.interfacetest;

public class Tester1 implements Interface1 {
	String name = " Little Guy";
	String m = "Misses Lady";

	public void testSayHey() {
		sayHey(name); // doenst have access to any instance variables
		System.out.println("Hello from Tester 1");
		sayName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tester1 t = new Tester1();
		
		Interface1.call();
		
		t.testSayHey();
		System.out.println("********");
		t.sayName();
	

	}

}
