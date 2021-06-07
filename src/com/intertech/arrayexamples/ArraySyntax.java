package com.intertech.arrayexamples;

import com.java.polymorphismarray.MyDate;

public class ArraySyntax {
	public static void main(String[] args) {

		int[] intArrayOne;
		int intArrayTwo[];

		char[] charArrayOne, charArraytwo; // this is making two array char types
		char charrrayThree[], charOne; // charArrayThree is an array while charOne is just a variable
		
		// how to instantiate the array, it takes any java object
		MyDate[] dates = new MyDate[3];
		dates[0] = new MyDate(10, 26, 1999);
		dates[1] = new MyDate(8, 25, 1969);
		dates[2] = new MyDate(4, 21, 1968);
		MyDate[] moreDates = {new MyDate(3, 10, 2016),
								new MyDate(4, 11, 2005)};
		System.out.println(moreDates.length);
		
		System.out.println(dates.length);
		
		//String Arrays
		String[] names = {"Hisham", "Wayel", "Korakot", "Braxton", "Garrett"};
			for( int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
		System.out.println(names[0]);
		
		// how to instantiate the array
		int[] intArray = new int[10];
		//declare and instantiate all in the same step
		int[] intArrays = {1,2,3,4,5,6,7,8,9,10};
			//intArray = {1,2,3,4,5} illegal and will not compile

		// each array index is default and set to 0 so we need to change that
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;
		intArray[9] = 10;
		//intArray[10] = 11; // this is going to fail because it will be array index out of bounds

		System.out.println(intArrays.length);
		System.out.println(intArray.length);
		//cannot resize an array 
		int[] anArray = new int[10];
		for(int j = 0; j < anArray.length; j++) {
			anArray[j] = j * 2;
			System.out.println(anArray[j]);
		}
	}

}
