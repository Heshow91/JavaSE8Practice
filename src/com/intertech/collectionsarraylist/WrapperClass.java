package com.intertech.collectionsarraylist;

import java.util.ArrayList;
import java.util.List;

import com.java.polymorphismarray.Employee;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		
		Integer ii = new Integer(i); 	// Boxing
		Integer jj = i; 				// AutoBoxing
		
		int j = jj.intValue(); 			//UnBoxing
		int k = jj; 					//AutoUnBoxing
		
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(7);
	
		List<Integer> list = new ArrayList<>();
		int h = 7;
		list.add(Integer.valueOf(h));
			System.out.println(list);
			
			
		Integer wrapInt = Integer.valueOf(7);
		int h1 = wrapInt.intValue();
		Character wrapChar = Character.valueOf('a');
		char ch = wrapChar.charValue();
		System.out.println(wrapChar);
		System.out.println(wrapInt);
		System.out.println(wrapChar + wrapInt);
		
		System.out.println("**********************");
		
		List<String> staff = new ArrayList<>();
		Employee e = new Employee();
		e.name = "Hisham";
		staff.add("Hisham");
		
	}

}
