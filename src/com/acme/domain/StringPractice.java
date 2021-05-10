package com.acme.domain;

import java.util.Calendar;
import java.util.Locale;

public class StringPractice {
	public static void main(String[] args) {
		String s = new String("Hello World    ");
		String sub = s.substring(4, 10);
		String trimmed = s.trim();
		String upper = s.toUpperCase();

		String greet = "Hey,";
		String name = "Hisham";
		String str1 = greet + " " + name;

		System.out.println(str1);

		String str = "My cat";
		str += " " + "is amazing";
		System.out.println(str);

		System.out.println(s);
		System.out.println(sub);
		System.out.println(trimmed);
		System.out.println(upper);

		System.out.println("***********");

		String a = "It is ";
		String b = "a cat ";
		String c = "day afternoon";

		a = a + b + c;
		c = "wow";
		
		System.out.println(a);
		System.out.println(c);
		System.out.println("************");
		
		// example using immutable Strings and concatenation
		String message = "Hello," + " ";
		message += name + ".";
		message += " " + "Today is" + " ";
		message += Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		message += ".";
		
		System.out.println(message);
		System.out.println("***********");
		
		//example using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello," + " ");
		sb.append(name + ".");
		sb.append(" " + "Today is" + " ");
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
		sb.append(".");
		
			System.out.println(sb);
			System.out.println("***********");
		
		int employeeId = 2812;
		int deptId = 98;
		
		System.out.println(employeeId + deptId);
		System.out.println(employeeId + ";" + deptId);
		System.out.println(employeeId + deptId + ":" + employeeId + deptId);
	}
}
