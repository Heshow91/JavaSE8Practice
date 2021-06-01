package com.oca.lambdaexamples;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StringLengthLambda myLambda = (String s) -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda This is Fun"));
		
		// different ways of lambda this is the shortest we can do lambda expression
		StringLegnthLambda2 myLambda2 = s -> s.length();
		System.out.println(myLambda2.getLength2("Hello Lambda This is really Fun"));
		
		//printing the static method with a lambda function
		printLambda(s -> s.length());
	}
	public static void printLambda(StringLegnthLambda2 sl) {
		System.out.println(sl.getLength2("Hello Lambda This is really fun"));
	}
	// inLine interface 
	interface StringLegnthLambda2 {
		int getLength2(String s);
	}

}
