package com.enthuware.test;

public class TrueOrFalse {

	// TODO Auto-generated method stub
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {

		int index = 1;

		try {
			getArray()[index = 45]++;
		} catch (Exception e) {
			System.out.println("Index = " + index);

			boolean b1 = false;
			boolean b2 = false;
//				if(b2 != b1 = b2) {
//					System.out.println("true");
//				}else {
//					System.out.println("false");
//				}
//			}
		}
	}
}
