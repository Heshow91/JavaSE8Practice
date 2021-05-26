package com.intertech.jss.polymorphism;

public class InventoryManager {

	private Automobile featuredAuto = new Car();

	//FRAME
	//AUTOMOBILE = auto = new Car();
	public void addFeaturedAuto(Automobile auto) {
		
		featuredAuto = auto;
	}

	public void addAutomobile(Automobile c) {
		System.out.println("Adding Automobile # " + c.getVIN());
		
	}
//	public void addAutomobile(Car c) {
//		System.out.println("Adding Car # " + c.getVIN());
//	}
//	
//	public void addAutomobile(Truck t) {
//		System.out.println("Adding Truck # " + t.getVIN());
//	}
//	
//	public void addAutomobile(Motorcycle m) {
//		System.out.println("Adding Motorcycle # " + m.getVIN());
//	}

}
