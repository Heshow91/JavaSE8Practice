package com.intertech.abstraction;

public class Circle extends Shape {
	public double r; // radius

	public double area() {
		return Math.PI * r * r;
	}

//	@Override must provide the draw method because
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("A Circle");{/*...*/}
	}

}
