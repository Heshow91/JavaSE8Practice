package com.udemy.javaTest;

public class ExceptionsTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 200; 
		int j = 0;
		
		int []nums = new int [10];
		try {
			//block of code to monitor for errors
			System.out.println("In try 1");
			nums[11] = 25;
			System.out.println("In try 2");
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("In catch 1 block");
		}
		catch(Exception e) {
			//handler for Exception
			System.out.println("In catch 2 block");
			}
		finally {
			System.out.println("In finally block");
		}
		
		System.out.println("Now this is over");
		}

}
