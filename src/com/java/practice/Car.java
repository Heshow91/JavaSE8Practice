package com.java.practice;
//import com.labPractice.MyDate;

public class Car {
	String color;
	String type;
	int serialNumber; // instance variable is being stored with the carCount
	static int carCount; // class variable it is loaded when the class is loaded

	{
		color = "red";
		type = "Celica";
	}
	Car() {
		carCount++;
		serialNumber = carCount;
		System.out.println("There is " + carCount + " cars on the lot");
	}
	
	Car(String color, String type){
		this();
		this.color = color;
		this.type = type;
	}

	// desc = this is a blue convertible Celica
	String getDescription() {
		String desc = "This is a " + color + " " + type;
		return desc;
	}

	// Customize frame : newColor = blue newType = convertible
	void customize(String color, String type) {
		// this will assign to object
		
		this.color = color;
		this.type = type;
		System.out.println(getDescription());
	}

	public static void main(String[] args) {
		Car car1, car2, car3;
		car1 = new Car("red", "Sedan");
		car2 = new Car("blue", "Station Wagon");
		car3 = new Car("white", "Coupe");
		
		//System.out.println(car1.color);
//		car1.getDescription();
//		car2.getDescription();
		System.out.println(car2.getDescription());
		car3.customize("orange", "Batmobile");
		Car myCar = new Car();
		myCar.customize("blue", "convertabile");
		Car hisCar = new Car();
		hisCar.customize("orange", "mustang");
		Car theyreCar = new Car();
		theyreCar.customize("red", "jeep");
		Car herCar = new Car();
		herCar.customize("yellow", "Bettle");
		
	//	MyDate myDate;
		// System.out.println(myCar.getDescription());
	}

}
