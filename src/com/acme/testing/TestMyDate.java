package com.acme.testing;

import com.acme.utils.MyDate;

public class TestMyDate {

	public static void main(String[] args) {

		MyDate party = new MyDate(4, 15, 2000);
		MyDate taxDue = new MyDate(4, 15, 2000);

		System.out.println(party.toString());
		System.out.println(taxDue.toString());
		System.out.println(taxDue.equals(taxDue));

		MyDate javaRelease = new MyDate(3, 18, 2014);
		String s = "Java SE 8 was released on " + javaRelease + ".";
		System.out.println(s);
		
		if (party == taxDue) {
			System.out.println("These references point to the same object.");
		}
		if(party.equals(taxDue)) {
			System.out.println("The dates have the same day, month and year");
		}else {
			System.out.println("The dates are different and they are not the same object");
		}
		System.out.println("********************");

		MyDate date1 = new MyDate(11, 11, 1918);

		MyDate date2 = new MyDate();

		date2.setDay(11);
		date2.setMonth(11);
		date2.setYear(1918);

		MyDate date3 = new MyDate();
		date3.setDate(13, 40, -1);

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		MyDate.leapYears();
	}
}