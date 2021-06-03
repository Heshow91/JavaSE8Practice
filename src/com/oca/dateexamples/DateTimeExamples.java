package com.oca.dateexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeExamples {

	public static void main(String[] args) {
		//Immutable objects
		
		System.out.println("**********This is the LocalDate**********");
		LocalDate now = LocalDate.now();
		System.out.println("1: " + now);

		LocalDate hireDate = LocalDate.of(1991, 10, 1);
		System.out.println("2: " +hireDate);

		LocalDate hireDate1 = LocalDate.of(2020, Month.JULY, 14);
		System.out.println("3: " +hireDate1);

		LocalDate aWeekFromNow = now.plusWeeks(1);
		System.out.println("4: " +aWeekFromNow);
		//here we changed the reference to what its referring too 
		//now.minusWeeks(1); System.out.println(now);
		now = now.minusWeeks(1);
		System.out.println("5: " +now);

		System.out.println("6: " +hireDate.isAfter(now));
		
		System.out.println("**********This is LocalTime**********");
		LocalTime rightNow = LocalTime.now();
		System.out.println("7: " +rightNow);
		
		LocalTime timeHired = LocalTime.of(10, 0);
		System.out.println("8: " +timeHired);
		
		LocalTime anHourFromNow = rightNow.plusHours(1);
		System.out.println("9: " +anHourFromNow);
		
		LocalTime anHourEarlier = rightNow.minusHours(1);
		System.out.println("10: " +anHourEarlier);
		
		System.out.println("11: " +timeHired.isAfter(rightNow));
		
		System.out.println("**********LocalDateTime**********");
		LocalDateTime noww = LocalDateTime.now();
		System.out.println("12: " +noww);
		
		LocalDateTime theTimeIwasHired = LocalDateTime.of(2020, Month.JULY, 14, 9, 0);
		System.out.println("13: " +theTimeIwasHired);
		
		System.out.println("14: " +noww.isBefore(theTimeIwasHired));
		System.out.println("15: " + noww.isAfter(theTimeIwasHired));
		
		//immutable like everything else in this class
		//3 years , 5 months and 12 days subtracted from the noww
		System.out.println("**********Period*********");
		Period period = Period.of(3, 5, 12);
		
		noww = noww.minus(period);
		System.out.println("16: " +noww);
		
		noww = noww.plus(period);
		System.out.println("17: " + noww);
		//inBetween two dates this is from my birthday until now
		Period periodFromHire = Period.between(hireDate, now);
		System.out.println("18: " + periodFromHire);

		}

}
