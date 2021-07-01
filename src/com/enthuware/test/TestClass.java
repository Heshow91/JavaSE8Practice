package com.enthuware.test;

class Base{
	String name = "wally";
	int age = 30;
	public Object getValue() {
		return new Object();
	}
}
class Base2 extends Base{
	String name = "hisham";
	int age = 32;
	public String getValue() {
		return "hello";
	}
}
public class TestClass {
	public static void main(String []args) {
		Base b = new Base2();
		System.out.println(b.getValue());//overriden methods do
		System.out.println(b.age);//primitives dont get Covariant returns
		System.out.println(b.name);//Strings dont get covariant returns aswell
	}
}