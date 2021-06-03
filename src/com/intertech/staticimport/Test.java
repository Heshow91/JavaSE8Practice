package com.intertech.staticimport;
import static com.intertech.staticimport.SafeDriver.*;
public class Test {
	
	public static void main(String[] args) {
		System.out.println(MAXIMUM_SPEED);
		printMaxSpeed();
		
		double distance = SafeDriver.SAFE_FOLLOWING_DISTANCE;
		System.out.println(distance);
	}
}
