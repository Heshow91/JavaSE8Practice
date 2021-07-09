package com.udemy.javaTest;

public class StaticWhile {

	static int count = 0;
	int i = 0;

	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticWhile check1 = new StaticWhile();
		StaticWhile check2 = new StaticWhile();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count);
	}

}
