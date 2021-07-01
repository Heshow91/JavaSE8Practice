package com.intertech.abstraction;

public class Cat implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("*..*");
	}
	private class Dog extends Cat{
		
	}
}
