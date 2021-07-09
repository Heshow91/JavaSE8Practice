package com.udemy.javaTest;

public class StringArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
		
		System.out.println(planets.length);
		System.out.println(planets[1].length());
		System.out.println("5 + 2 = " + 3+4);
		System.out.println("5 + 2 = " + (3 + 4));
		String str = " ";
		str = str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
	}

}
