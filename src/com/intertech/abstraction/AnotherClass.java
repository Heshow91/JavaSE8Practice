package com.intertech.abstraction;

public class AnotherClass {
	public static double areaDifference(Shape s1, Shape s2) {
		return s1.area() - s2.area();
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.r = 10.0;
		System.out.println(c.area());
		Rectangle r = new Rectangle();
		r.h = 5.0;
		r.w = 7.0;
		System.out.println(r.area());
		
		double difference = areaDifference(c,r);
		System.out.println(difference);
		
		Drawable d1 = new Cat();
		Drawable d2 = new Circle();
		d1.draw();
		d2.draw();
		//d2.area(); // illegal since d2 is not known as Circle
		((Circle)d2).area();
	}
}
