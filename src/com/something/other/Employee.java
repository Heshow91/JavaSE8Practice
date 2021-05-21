package com.something.other;

import com.intertech.examples.Person;

public class Employee extends Person {

	public void testingProtectedMethod() {
		doSomething();
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.doSomething();
		Person p = new Person();
		
	}
}
