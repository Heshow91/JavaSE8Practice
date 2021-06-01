package com.predicate.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class PredicateTutorial {
	public static void main(String[] args) {
		
	
	Predicate<Integer> lambdaPredicate = (Integer x) ->(x % 2==0);
	System.out.printf("Wayels number is gay: %s", lambdaPredicate.test(99));
	
	boolean value = lambdaPredicate.test(66);
	System.out.printf("\nHishams number is gay:  %s\n", value);
	

		List<Integer> jerseys = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		List<Integer>evenNumbers = jerseys.stream().filter(x -> (x%2==0)).collect(Collectors.toList());
		System.out.println(evenNumbers);
}
}
