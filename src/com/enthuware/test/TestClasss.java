package com.enthuware.test;

import java.util.ArrayList;
import java.util.List;

public class TestClasss {
	
public static void main(String[] args) {
	 
	String s = "MINIMUM";
	System.out.println(s.substring(4,7));
	List s1 = new ArrayList<>();
	s1.add("a");
	s1.add("b");
	s1.add(1, "c");
	
	List s2 = new ArrayList(s1.subList(1, 2));
	s1.add(s2);
	System.out.println(s1);
	
	Object t = new Integer(107);
	int k = ((Integer) t).intValue()/9;
	System.out.println(k);//java truncates int division
	int i = 0;
	boolean bool1 = true;
	boolean bool2 = false;
	boolean bool = false;
	Boolean bool3 = false;
	char ch = 10;
	
	bool = (bool2 &  method1(i++));
	bool = (bool2 && method1(i++));
	bool = (bool1 |  method1(i++));
	bool = (bool1 || method1(i++));
	System.out.println(i);
}


private static boolean method1(int i) {
	return i>0 ? true:false;
}
}
