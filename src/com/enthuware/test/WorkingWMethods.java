package com.enthuware.test;

import java.util.Stack;

public class WorkingWMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		Stack s2 = new Stack();

		processStacks(s1, s2);
		System.out.println(s1 + "  " + s2);

	}

	private static void processStacks(Stack x1, Stack x2) {
		// TODO Auto-generated method stub
		x1.push(new Integer("100"));

	}

}
