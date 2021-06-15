package com.intertech.collectionsarraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndAutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//old way
		List<Integer> numbers = new ArrayList<>();
		numbers.add(Integer.valueOf(0));
		numbers.add(Integer.valueOf(1));
		numbers.add(Integer.valueOf(2));
		numbers.add(Integer.valueOf(3));
			// everything is homogeneous
		//to get one value at index
		int x = ((Integer) numbers.get(0)).intValue();
		System.out.println(x);
		
		System.out.println("************************");
		//new way with parameter type no need for casting
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(Integer.valueOf(1));
		primes.add(Integer.valueOf(2));
		primes.add(Integer.valueOf(3));
		primes.add(Integer.valueOf(5));
		primes.add(Integer.valueOf(7));
		
		int w = primes.get(0).intValue();
		System.out.println(w);
		System.out.println("*************************");
		
		//no need for wrapping
		//AutoBoxing
		Integer y = 5;
		System.out.println(y);
		
		//UnBoxing
		int z = y; 
		System.out.println(z);
		 
		System.out.println("****************************");
		//AutoBoxing and Generic's saving time
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(1);
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);
		int h = prime.get(2);
		System.out.println(h);
		System.out.println(prime);
	}

}
