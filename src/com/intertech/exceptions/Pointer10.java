package com.intertech.exceptions;

public class Pointer10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int [] numList = {1,2,3,4,5};
		//numList[5] = 6;
		try {
			ml();
			System.out.println("A");
		}finally {
			System.out.println("b");
		}
		System.out.println("c");
	}
	public static void ml() throws Exception{
		
		throw new Exception();
	}

}
