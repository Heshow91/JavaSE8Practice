package com.oca.lambdaexamples;

public class Greeter {

//	public void greet(Greeting greeting) {
//		greeting.perform();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Greeting helloGreeting = new HelloGreeting();
		//greeter.greet(helloGreeting);

//		MyLambda myLambdaFunction = () -> System.out.println("Butt Face~!!");

//		MyAdd addFunction = (int a, int b) -> a + b;
		
		Greeting lambdaGreeting = ()  -> System.out.println("Butt Face!!");
		Something sayingHello = () -> System.out.println("okay will do");
		// will not compile because/if the interface has two methods
		// when using interface for lambdas the class super class must only have one method
		
		//Calling static method from HelloGreeting
		HelloGreeting.doStuff();
		sayingHello.doSomething();
		helloGreeting.perform(); 
		lambdaGreeting.perform(); // behaving  like the implemented interface
	}

}

//interface MyLambda {
//	void foo();
//}
//
//interface MyAdd {
//	int adding(int a, int b);
//}
