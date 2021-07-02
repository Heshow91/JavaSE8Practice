package com.enthuware.Test3;

public class UsingOperatorsAndDecisionConstructs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		int[] a = { 1 };

		k += (k = 4) * (k + 2);//13
		
		a[0] += (a[0] = 4) * (a[0] + 2);//13
		System.out.println(k + " ," + a[0]);
		
		/*
		The value 1 of k is saved by the compound assignment operator += 
		before its right-hand operand (k = 4) * (k + 2) is evaluated. 
		Evaluation of this right-hand operand then assigns 4 to k, 
		calculates the value 6 for k + 2, and then multiplies 4 by 6 to get 24. 
		This is added to the saved value 1 to get 25, which is then stored into 
		k by the += operator. An identical analysis applies to the case that uses a[0].
				  k += (k = 4) * (k + 2);
				  a[0] += (a[0] = 4) * (a[0] + 2);
				  k = k + (k = 4) * (k + 2);
				  a[0] = a[0] + (a[0] = 4) * (a[0] + 2);
*/
	}

}
