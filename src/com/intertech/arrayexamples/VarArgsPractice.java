package com.intertech.arrayexamples;


public class VarArgsPractice {

	public static void average(int... numbers){
		int total = 0;
		for(int a : numbers) {
			total += a;
				
		}
		//return total/numbers.length;
		System.out.println(total/numbers.length);
			
	}
	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		//  the varArgs specifies an argument type followed by an ellipsis (...)
		//  this indicates the method can take zero or more arguments of that type
//			System.out.println(average(4,8,12,16));
		average(4,8,12,16);
	}

}
