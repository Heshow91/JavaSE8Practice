package com.intertech.collectionsarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Swift");
		languages.add("JavaScript");
		languages.add("Python");
		languages.add("Ruby");
		
		Iterator<String> i = languages.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//only available for list 
		ListIterator<String> i2 = languages.listIterator();
		i2.hasPrevious();
		
	}

}
