package com.java.practice;

public class Scope {
	
	//Begin Car Scope
	String color; // Instance variable in Car scope
	String type; // Instance variable in Car scope
	int serialNumber; // Instance variable in Car scope
	static int carCount; // Static variable in Car class scope available to all code
	
	  Scope(String c, String t){
		// Begin constructor scope
		this.color = c; // 'c' is a local variable
		this.type = t; // 't' is local variable
		carCount++;
		serialNumber = carCount;
			// End constructor scope
	}
	
	public String getDescription() {
		// Begin getDescription() scope
		String desc; // Local variable
		desc = "This is a " + color + " " + type;
		return desc;
	}		// End getDescription() scope
			// End Car scope
	
	
	
}
