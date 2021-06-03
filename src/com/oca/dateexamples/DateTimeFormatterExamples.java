package com.oca.dateexamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
			System.out.println(now);
			
			
			DateTimeFormatter dTf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
			System.out.println(now.format(dTf));
			// this will result in a runtime exception not compile error
			// because localized time cannot work with LocalDate
			DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
			//System.out.println(now.format(dtf));
			//no constructors
			DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("yyyy/dd/MM");
			DateTimeFormatter ptf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
			DateTimeFormatter ptfSingle = DateTimeFormatter.ofPattern("dd 'in the month of' MMM");
			System.out.println(now.format(patternFormatter));
			System.out.println(now.format(ptf));
			System.out.println(now.format(ptfSingle));
	}

}
