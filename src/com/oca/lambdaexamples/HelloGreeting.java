package com.oca.lambdaexamples;

public class HelloGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello All!!");
	}
	public static void doStuff() {
		System.out.println("This static does stuff");
	}

//	@Override
//	public int add(int a, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
