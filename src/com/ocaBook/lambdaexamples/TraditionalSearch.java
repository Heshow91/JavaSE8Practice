package com.ocaBook.lambdaexamples;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		//print(animals, new CheckIfHopper()); // pass class that does the check
		System.out.println("Animals that can hop");
		print(animals, a -> a.canHop());
		System.out.println("Animals that can swim");
		print(animals, a -> a.canSwim());
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			if (checker.test(animal)) { // general check
				System.out.println(animal + " ");
			}
		}
	}

}

    