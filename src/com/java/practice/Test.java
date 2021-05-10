package com.java.practice;

public class Test {
	
	static int personCount;
	{
		personCount = 1000;
	}
	
	{
		 personCount = 20;
	}
	
	{
		personCount = 100;
	}
	static {
		personCount = 450;
	}
	//static int personCount = 1000;
	
	public static void main(String[] args) {
		System.out.println(Test.personCount);

	}

}
