package com.enthuware.test;

public class FInallyTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			m1();
			System.out.println("A");
		}
//		catch (Exception e) {
//			System.out.println("Q");
//		}
		
		finally {
			System.out.println("B");
		}
		
		System.out.println("C");
	}

	public static void m1() throws Exception{
		// TODO Auto-generated method stub
		throw new Exception();
		
	}

}
