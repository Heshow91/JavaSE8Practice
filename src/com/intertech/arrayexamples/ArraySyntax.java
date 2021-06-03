package com.intertech.arrayexamples;

public class ArraySyntax {
	public static void main(String[] args) {

		int[] intArrayOne;
		int intArrayTwo[];

		char[] charArrayOne, charArraytwo; // this is making two array char types
		char charrrayThree[], charOne; // charArrayThree is an array while charOne is just a variable
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
		
		int[] anArray = new int[10];
		for(int j = 0; j < anArray.length; j++) {
			anArray[j] = j * j;
			System.out.println(anArray[j]);
		}
	}

}
