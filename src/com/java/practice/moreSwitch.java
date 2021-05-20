package com.java.practice;



public class moreSwitch {
	
	public static void main(String[] args) {
		moreSwitch.doSomething();
	}
	public static void doSomething() {
		int someVariable = 1;
		switch (someVariable) {

		case 0: {
			return;
		}
		case 1: {
			System.out.println("this one");
			break;
		}
		case 2: {
			System.out.println("this two");
			break;
		}
		}
		System.out.println(someVariable);
		System.out.println("this will print");
	}

}
