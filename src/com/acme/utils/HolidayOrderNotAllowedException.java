package com.acme.utils;

public class HolidayOrderNotAllowedException extends Exception {

	public HolidayOrderNotAllowedException(MyDate date) {
		super ("Orders are not allowed to be created on: " + date);
	}
}
