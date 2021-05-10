package com.acme.domain;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean inMinneapolis = false;
		boolean inSaintPaul = true;

		if (inMinneapolis) {

			System.out.println("Hello from Mpls!");

		} else if (inSaintPaul) {

			System.out.println("Hello from Saint Paul");
		} else {
			System.out.println("Hello from somewhere!");
			System.out.println("..can we visit you in St Paul");
		}
		System.out.println("Can we visit you");
	}
	

}
