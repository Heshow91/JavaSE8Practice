package com.intertech.arrayexamples;

public class TwoDimentionalArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// two dimensional string array 5x2 first dimension has 5 elements and the
		// second has 2 elements
		String[][] twoDArray = new String[6][2];

		twoDArray[0][0] = "Hisham";
		twoDArray[0][1] = "917-675-1559";
		twoDArray[1][0] = "Wayel";
		twoDArray[1][1] = "917-284-0945";
		twoDArray[2][0] = "Mustafa";
		twoDArray[2][1] = "646-575-6787";
		twoDArray[3][0] = "Korakot";
		twoDArray[3][1] = "415-939-8522";
		twoDArray[4][0] = "Garett";
		twoDArray[4][1] = "401-323-2952";
		twoDArray[5][0] = "Braxton";
		twoDArray[5][1] = "646-225-1089";
		
		
		
		for(int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
//				string = string.concat(twoDArray[j][i]);
				System.out.print("\t" + twoDArray[i][j]+ "\t|" );
			}
			System.out.println();
		}
				System.out.println("**********");
		
		
		//literal array initialization for 3x2 dimensional array
		String []threeXtwoArray[] = {{"1", "a"}, {"2", "b"}, {"3", "c"}};
		System.out.println("array length=" + threeXtwoArray.length);
		System.out.println("array[0] length= " + threeXtwoArray[0].length);
		for(int i = 0; i < threeXtwoArray.length; i++) {
			for(int j = 0; j <threeXtwoArray[i].length; j++) {
				
			System.out.print("\t" + threeXtwoArray[i][j] + "\t|");
		}
			System.out.println();
	}
}
}