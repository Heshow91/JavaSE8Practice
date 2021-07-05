package com.udemy.javaTest;

public class ArraysExample {
	void readCard(int cardNo) throws Exception{
		
	}
	void checkCard(int cardNo) throws RuntimeException{
		
	}
	public static void main(String[] args) throws Exception {
		int w = 100;
		int e = w++;
		int r = ++w;
		int t = w++;
	
		ArraysExample ax = new ArraysExample();
		int cardNo = 12345;
		ax.checkCard(cardNo);
		ax.readCard(cardNo);
		
		// TODO Auto-generated method stub
		int num = 5;
		// will always do the do portion first then check condition
		do{
			System.out.println(num-- + " ");
		}while(num ==0);

		//check condition
				String ta = "A ";
				ta = ta.concat("B ");
				String tb = "C ";
				ta = ta.concat(tb);
				ta = ta.replace('C', 'D');
				ta = ta.concat(tb);
				System.out.println(ta);
				
				int x = 5;
				while(isAvailable(x)) {
					System.out.println(--x);
					
				}
				
	}
	public static boolean isAvailable(int x) {
		return x-- >0 ? true : false;
	}

}
