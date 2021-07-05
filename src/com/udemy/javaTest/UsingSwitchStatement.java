package com.udemy.javaTest;

public class UsingSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 77;
		switch ((int) marks / 10) {
		case 4:
			System.out.println("3rd");
			break;
		case 5:
			System.out.println("2.2");
			break;
		case 6:
			System.out.println("2.1");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("1st");
			break;
		default:
			System.out.println("Reset");
			break;
		}
//		int a = 20;
//		int y = 33;
//		switch(a) {
//		case y: System.out.println(y+3);
//		default: System.out.println(a + 3);
		
		}
	}


