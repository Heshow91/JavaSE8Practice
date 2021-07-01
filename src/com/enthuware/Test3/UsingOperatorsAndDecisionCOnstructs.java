package com.enthuware.Test3;

public class UsingOperatorsAndDecisionCOnstructs {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int i = 1;
		int j = i++;
		if((i==++j) | (i++==j)) {
			System.out.println(i);
			
			System.out.println(j);
			i+=j;
			
			
		}
		System.out.println(i);
	}
	/*
	1. i == ++j is not same as i == j++;
	In the case of i == ++j, j is first incremented and then compared with i.
	While in the case of i == j++;, j is first compared with i and then incremented.

	2. The | operator, when applied for boolean operands, ensures that both the sides are evaluated. 
	This is opposed to || which does not evaluate the Right Hand Side if the result can be known by 
	just evaluating the Left Hand Side.

	Now, let us see the values of i and j at each step:

	int i = 1;
	int j = i++; // j is assigned 1 and i is incremented to 2
	if( (i==++j) | (i++ == j) )     // increment j (so j becomes 2) and compare with i => return true.
	        //since it is |, evaluate next condition: compare i with 2 and increment i => i becomes 3.{
	    i+=j; //i = 3+2 = 5
	}
	System.out.println(i); //prints 5

*/
}
