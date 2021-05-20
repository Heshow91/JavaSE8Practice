package com.java.practice;

public class Primitives {

	public static void main(String[] args) {
		
		// conditional
		boolean bool = true;
		if (bool) {
			System.out.println("b is true");
		} else {
			System.out.println("b is false");
		}
		// sizes of all types of integer are guaranteed from system to system
		// any number that doesnt have a decimal is a int by default
		
		int myInt = 0b101;
		System.out.println(myInt);
		
		
		/*
		 boolean = 1 bit
		 byte = 8 bits
		 short = 16 bits
		 char = 16 bits
		 int = 32 bits
		 float = 32 bits
		 long = 64 bits
		 double = 64 bits
		 */
		
		byte b = 4;
		short s = 5;
		
		int x = b;
		
		int x2 = 123456789;
		float f = x2;
		System.out.println(f);
		
		//casting 
		int c2 = 10;
		byte b2 = (byte) c2;
		System.out.println(b2);
		
		//overflow to big for 8 bits
		int i = 200;
		byte b3 = (byte) i;
		System.out.println(b3);
	}

}
