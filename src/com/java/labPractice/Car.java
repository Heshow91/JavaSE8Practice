package com.java.labPractice;
//STatic methods practice and blocks
public class Car {

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

	Car() {

		carCount++;
		serialNumber = carCount;
		// Every single time a car is created the constructor will increase the value of
		// the car cut by 1.
		// And so we know that the car count represents the total number of cars and
		// therefore every number will
		// be unique.
	}

	Car(String c, String t) {
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
		
		Car mycar = new Car();
//
		mycar.printDescription();
//
		Car.carCount = 1 ;

		Car car1, car2, car3;
		car1 = new Car("red", "Sedan");
		car2 = new Car("blue", "Station Wagon");
		car3 = new Car("white", "Coupe");
		System.out.println(Car.carCount);
		//System.out.println(car1.color);
		car1.printDescription();
		car2.printDescription();
		car3.printDescription();
		car1.drive();
		car1.start();
		

	}
}
