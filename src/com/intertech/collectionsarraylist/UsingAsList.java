package com.intertech.collectionsarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.intertech.collectionsmaps.MyDate;

public class UsingAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		The Arrays class has a helper method to turn a VarArgs collection into a List:  Arrays.asList(T... elements);
//		So, an easy way to create a list of MyDate objects would be:
		List<MyDate> dates = Arrays.asList(new MyDate(2,1,2020), new MyDate(3,10,1980));
		System.out.println(dates);
		
//		Since a method that declares a VarArg parameter may also accept an array argument, the following is also legal:
		MyDate[] datesArray = { new MyDate(2,1,2020), new MyDate(3,10,1980) };
		List<MyDate> dates1 = Arrays.asList(datesArray);
		System.out.println(dates1);
		
//		As we learned in the Arrays chapter, it's illegal to use the InLine array initialization syntax if it's not 
//		part of the same statement as the variable declaration.  So the following would be illegal:
//		List<MyDate> dates2 = Arrays.asList( 
//			    { new MyDate(2,1,2020), new MyDate(3,10,1980) } ); // ILLEGAL
		
//		However, there is a similar syntax, known as an anonymous array, 
//		which does work... (note the new MyDate[] in front of the initialization syntax)		\
		
//		Also as a note for the exam, remember that asList is a method in the Arrays class.  
//		It's not found in the Collections class, nor is it found as a method in the list itself... 
//		so the following methods are illegal:
//		List<MyDate> dates = Collections.asList(
//			    new MyDate(2,1,2020), new MyDate(3,10,1980)); // ILLEGAL
//			List<MyDate> dates2 = new ArrayList<>(); // LEGAL
//			dates2 = dates2.asList(
//			    new MyDate(2,1,2020), new MyDate(3,10,1980)); // ILLEGAL
		
	}

}
