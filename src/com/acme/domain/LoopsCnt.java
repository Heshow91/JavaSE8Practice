package com.acme.domain;

public class LoopsCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int i = 0;
		while (true) {
			System.out.println(i++);
			if (i == 10) {
				break;
			}
		// continue
			 for (int k = 0; k < 100; k++) {
				 if(k % 7 ==0) {
					 continue;
				 }
				 System.out.println(k + " is not divisible by 7");
			 }
*/
		
		outer_label: 
		while (true) {
			int z = 0;
			while (true) {
				if (z >= 10) {
					break outer_label;
				} else {
					System.out.println(z++);
				}
			}
		}
	}
}