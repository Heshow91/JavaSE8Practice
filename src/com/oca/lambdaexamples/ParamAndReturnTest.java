package com.oca.lambdaexamples;

public class ParamAndReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterFunctions lambdaParameter = (a) -> System.out.println(a);
		lambdaParameter.sayHI("Whats up");

		ReturnFunction lambdaReturn = ()-> {return "LaTERZ";};
		System.out.println(lambdaReturn.sayBye());
	}

}
