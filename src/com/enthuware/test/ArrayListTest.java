package com.enthuware.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List s1 = new ArrayList();
		s1.add("A");
		s1.add("B");
		s1.add(1,"C");
		List s2 = new ArrayList(s1.subList(1, 1)); 
		// sublist is only nothing because it needs to be 1, 2 to include C in the new list
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
