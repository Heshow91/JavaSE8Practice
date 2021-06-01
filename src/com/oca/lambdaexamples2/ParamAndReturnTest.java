package com.oca.lambdaexamples2;

public class ParamAndReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// need parenthesis around a and b because there is two, if just one parameter then no parenthesis
		//functional interfaces can have only one abstract method
		ParameterFunctions lambdaParameter = (a,b) -> System.out.println(a + b);
		
		lambdaParameter.sayHI("Whats up " , 20);

		ReturnFunction lambdaReturn = ()-> {return "LaTERZ";};
		System.out.println(lambdaReturn.sayBye());
		
		// how to access static method from interface
	}

}
