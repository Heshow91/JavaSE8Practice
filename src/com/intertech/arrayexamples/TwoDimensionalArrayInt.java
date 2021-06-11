package com.intertech.arrayexamples;

public class TwoDimensionalArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int twoDArrays [][]= {{1,2,3,4,5,6,7,8,9,10},
							 {11,12,13,14,15,16,17,18,19,20},
							 {21,22,23,24,25,26,27,28,29,30}};
		
		for (int row = 0; row < twoDArrays.length; row++) {
			for (int column = 0; column < twoDArrays[row].length; column++) {
				System.out.print( twoDArrays[row][column] + "\t|");
			}
			System.out.println();
		}
	}

}
