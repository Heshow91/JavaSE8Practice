package com.acme.domain;

public class Switch {

	public static void main(String[] args) {

		int j = 0;
		String str = null;

		switch (j) {
		case 1:
			str = "one";
			break;
		case 2:
			str = "two";
			break;
		case 3:
			str = "three";
			break;
		case 4:
			str = "four";
			break;
		default:
			str = "unknown";

		}

		System.out.println(str);

		System.out.println("******************");

		char c = 'A';
		switch (c) {
		case 'A':
			System.out.println("is A");
			break;
		default:
			System.out.println("char=" + c);
			break;
		}
		System.out.println("****************");

		String timeOfDay = "a.m";
		
		switch (timeOfDay) {
		case "a.m":
			System.out.println("good morning");
			break;
		case "p.m":
			System.out.println("good evening");
			break;
		default:
			System.out.println("good day");
		}
		System.out.println("******************");
		
		int i =3;
		String stri;
		switch(i) {
		case 1:
		case 3:
			stri ="odd";
			break;
		case 2:
		case 4:
			stri ="even";
			break;
		default:
			stri = "out of range";
			break;
		}
		System.out.println(stri);
		System.out.println("******************");

	}
	
	static public boolean isSleeping() {
		System.out.println("isSleeping() ");
		return false;
	}
	static public boolean isHome() {
		System.out.println("isHome() ");
		return true;
	}
	public static void boolA() {
		if (isSleeping() || isHome()) {
			System.out.println("BoolA: Shhh... Wayels Sleeping");
		
		}
	
	}
	
	}

