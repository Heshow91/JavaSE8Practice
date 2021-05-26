package com.intertech.abstraction;

public class Rectangle extends Shape {
	public double h, w; // height and width

	public double area() {
		return h * w;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public void testBehavior() {
		Drawable.drawing();
	}
}
