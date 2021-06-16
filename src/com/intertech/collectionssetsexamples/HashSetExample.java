package com.intertech.collectionssetsexamples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> salesArea = new HashSet<String>();
		salesArea.add("New York City");
		salesArea.add("Turkey");
		salesArea.add("Yemen");
		salesArea.add("California");
		//if this was a list than NYC will print again
		salesArea.add("New York City");
		
		//will not print duplicates
		System.out.println(salesArea);
		
	}

}
