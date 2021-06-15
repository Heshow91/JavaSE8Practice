package com.intertech.collectionssortsearch;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAndSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Hisham");
		list.add("Wayel");
		list.add("Korakot");
		list.add("Garret");
		
		System.out.println("No sorting " +list);
		Collections.sort(list);
		System.out.println("With sorting " +list);
		
		Collections.binarySearch(list, "Wayel");
		
		Collections.reverse(list);
		System.out.println("In reverse " + list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled randomed " + list);
		
	}

}
