package com.enthuware.Test3;

public class UsingLoopConstructs {
	public static void main(String[] args) {
		int i = 0, j = 5;
		lab1: for (;; i++) {
			for (;; --j)
				if (i > j)
					break lab1;
		}
		System.out.println(" i = " + i + ", j = " + j);
	}
}
