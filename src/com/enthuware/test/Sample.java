package com.enthuware.test;

public class Sample implements IInt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		int j = s.theValue;
		int k = IInt.theValue;
		int l = theValue;
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(theValue);
	}

}
