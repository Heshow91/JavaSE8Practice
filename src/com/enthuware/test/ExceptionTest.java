package com.enthuware.test;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionTest et = new ExceptionTest();
		et.myMethod();

	}

	public void myMethod() throws Exception {
		// TODO Auto-generated method stub
		yourMethod();
	}

	public void yourMethod() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}


}
