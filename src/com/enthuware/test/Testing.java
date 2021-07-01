package com.enthuware.test;

class StringWrapper {

	private String theVal;

	public StringWrapper(String str) {
		this.setTheVal(str);
	}

	public String toString() {
		return theVal;
	}

	public String getTheVal() {
		return theVal;
	}

	public void setTheVal(String theVal) {
		this.theVal = theVal;
	}

	public Object myMethod() {
		return myMethod();

	}
}

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWrapper sw = new StringWrapper("How are you");
		StringBuilder sb = new StringBuilder("How are you");
		System.out.println("Hello, " + sw);
		System.out.println("Hello, " + sw.getTheVal());
		System.out.println("Hello, " + sw); // with modified toString
		System.out.println("Hello, " + sb);
	}

}
