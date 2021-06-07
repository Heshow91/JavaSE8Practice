package com.java.polymorphismarray;

public class Secretary extends Employee {
	public static void main(String[] args) {

		Employee e = new Manager();
		e = new Secretary();

		Employee[] staff = new Employee[3];
		staff[0] = new Employee();
		staff[0].name = "Wayel";

		staff[1] = new Secretary();
		staff[1].name = "Sahi";

		staff[2] = new Manager();
		staff[2].name = "Hisham";
		
		//to access department need to cast Manager
		((Manager)staff[2]).department = "MI6";
		//((Manager)staff[0]).department = "Front House";
		//((Manager)staff[0]).department = "Server";
		
		for (int j = 0; j < staff.length; j++) {
			System.out.println(staff[j]);
		}//for each     variable : collection
		for (Employee employee : staff) {
			System.out.println(employee);
		}
		
	}
}
