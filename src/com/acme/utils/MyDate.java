package com.acme.utils;

public class MyDate {

	private byte day;
	private byte month;
	private int year;
	
	

	public byte getDay() {
		return day;
	}

	public void setDay(int day) {
		if (valid(day, this.getMonth(), this.year)) {
			this.day = (byte)day; //cast used
		}
		
	}

	public byte getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (valid(this.getDay(),month, this.year)) {
			this.month = (byte)month; //cast used
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate() {

	}

	public MyDate(int m, int d, int y) {
		setDate(m, d, y);
	}

	public void setDate(int m, int d, int y) {
		// TODO Auto-generated method stub
		setDay((byte) d);
		year = y;
		setMonth((byte) m);
	}

	public String toString() {
		return getMonth() + "/" + getDay() + "/" + year;
	}

	public static void leapYears() {
		for (int i = 1752; i <= 2020; i = i + 4) {
			if ((i % 100 != 0) || (i % 400 == 0))
				System.out.println("The year " + i + " is a leap year");
		}
	}
	private boolean valid(int day, int month, int year) {
		boolean isValid = true;
		if (day > 31 || day < 1 || month > 12 || month <1) {
			isValid = false;
		}else {
			switch (month) {
			case 4: case 6: case 9: case 11:
				isValid = (day <= 30);
				break;
			case 2:
				isValid = (day <= 28 || (day ==29 && year % 4 == 0));
				
			}
		}
	
	return isValid;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public void setMonth(byte month) {
		this.month = month;
	}
}
