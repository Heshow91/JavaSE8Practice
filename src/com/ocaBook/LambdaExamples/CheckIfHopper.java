package com.ocaBook.LambdaExamples;

public class CheckIfHopper implements CheckTrait{
	
	//has to add all methods in CheckTrait
	//The first thing we want to check is whether the Animal can hop. We provide
	//a class that can check this
	@Override
	public boolean test(Animal a) {
		// TODO Auto-generated method stub
		return a.canHop();
	}

}
