package com.udemy.javaTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		
		System.out.println("date 1 = " + date1);
		System.out.println("date 2 = " + date2);
		System.out.println("date 3 = " + date3);
		
	}

}
