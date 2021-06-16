package com.intertech.collectionssetsexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(88);
		tree.add(53);
		tree.add(66);
		tree.add(12);
		tree.add(1);
		tree.add(15297);
		
		System.out.println(tree);
		//TreeSet prints in order comparesTo 
		//TreeSets are ordered but there is no index cannot remove items based on index
		Iterator<Integer> numbers = tree.iterator();
		while(numbers.hasNext()) {
			System.out.println(numbers.next());
		}		
		System.out.println();
		
		TreeSet<String> people = new TreeSet<String>();
		people.add("Hisham");
		people.add("Cecilia");
		people.add("Mom");
		people.add("Hana");
		people.add("Dad");
		people.add("Shajan");
		people.add("Wayel");
		
		System.out.println(people);
		Iterator<String> names = people.iterator();
		while(names.hasNext()) {
			System.out.println(names.next());
		}
	}

}
