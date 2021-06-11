package com.intertech.collectionsarraylist;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		List list3 = new ArrayList();
		Collection list4 = new ArrayList();
		
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println(list);
		list.remove(0);
		list.set(0, 100);// this can only replace things, since i removed index 0 it replaced index 1 which was 3
		System.out.println(list.isEmpty());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		
		}
		System.out.println("**************List**************");
		//ArrayList myList = {"Hello", "World"}; cant use array initialization with a collection
		List<String> myList = Arrays.asList(new String[]{"Hello", "World"});
		System.out.println(myList);
		

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Hisham Raihan");
		list1.add("Wayel Raihan");
		list1.add("Korakot San");
		list1.add("Garett T");
		list1.add("Braxton Payton");

		System.out.println(list1);
		System.out.println("*******Checking if Contains******");
		if(list1.contains("Hisham Raihan")) {
			System.out.println("Hisham Is Here");
		}else {
			System.out.println("Your Gay");
		}

		System.out.println("******Regular ForLoop******");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("**********Enhanced ForLoop***********");
		for (String names : list1) {
			System.out.println(names);
		}
		System.out.println("**************ForEach Loop***********");
		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println("***********Iterator************");
		Iterator<String> list2 = list1.listIterator();
		while (list2.hasNext()) {
			System.out.println(list2.next());
		}
		System.out.println("***********ForEach Loop with Lambda*********");
		list1.forEach(name ->  System.out.println(name));
		
		System.out.println("************While Loop**************");
		int i = 0;
		while(i < list1.size()) {
			System.out.println(list1.get(i));
			i++;
		}
		System.out.println("**************Stream ForEach***********");
		list1.stream().forEach(names-> System.out.println(names));
		}
	
		

}
