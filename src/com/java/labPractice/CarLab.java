package com.java.labPractice;
//STatic methods practice and blocks
public class CarLab {

	String color;
	String type;
	int serialNumber;
	// instance variables = every car gets its own color and type
	static int carCount;

	// static initialization block just once
//	static {
//		setCarCount(3);
//
//	}
	//regular initializing block does it every time a object is created
	
	{
		color = "Green";
		type = "Mini Van";
	}
	public static void setCarCount(int c) { // static methods cannot access instance variables
		carCount = c;
	}

	void drive() {
		System.out.println("put er in gear and drive it like you stole it");
	}
	//to call the static method i need the name of the class
	static void resetCarCount() {
		carCount = 0;

	}

	CarLab() {

		carCount++;
		serialNumber = carCount;
		// Every single time a car is created the constructor will increase the value of
		// the car cut by 1.
		// And so we know that the car count represents the total number of cars and
		// therefore every number will
		// be unique.
	}

	CarLab(String c, String t) {
		color = c;
		type = t;
		carCount++;
		serialNumber = carCount;
	}

	// initialization block
//	{
//		color = "Red";
//	}

	 void start() {
		System.out.println("Get started");
	}

	void printDescription() {
		System.out.println("This is a " + color + " " + type + " serial # " + serialNumber);
	}

	public static void main(String[] args) {
		//Car.carCount= 1;
		
		CarLab mycar = new CarLab();
//
		mycar.printDescription();
//
		CarLab.carCount = 1 ;

		CarLab car1, car2, car3;
		car1 = new CarLab("red", "Sedan");
		car2 = new CarLab("blue", "Station Wagon");
		car3 = new CarLab("white", "Coupe");
car1.drive();
		System.out.println(CarLab.carCount);
		//System.out.println(car1.color);
		car1.printDescription();
		car2.printDescription();
		car3.printDescription();
		car1.drive();
		car1.start();
		

	}
}
