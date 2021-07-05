package com.udemy.javaTest;

public class UsingParanthesesToOverRideOperatorPrecedence {

	// BODMAS
	// Unary operators ++x; --y; !(bool); these happen first
	// Multiplication happens next
	// Addition happens after multiplication
	// Relational after addition
	// Equality if(x !=y)...
	// Logical AND happens after
	// Logical OR happens after &&
	// Posifix

	public static void main(String[] args) {

		int a = 1;
		long b = 2;
		short c = 3;
			
		System.out.println(++a + b++ * c);
		//                  2    2     3
		//                  2 x 3 = 6
		//                    6 + 2 = 8
		String h = "Hisham";
		String w = "Wayel";
		if(h.equals(w)) {
			System.out.println("Wayel is now the new Hisham");
		}else {
			System.out.println("Hisham will always be Hisham");
		}
		
		int x = 9;
		if(x==3) {
			System.out.println("does equal 3");
		}else {
			System.out.println( x + " does not equal 3");
		}

		
	}
}