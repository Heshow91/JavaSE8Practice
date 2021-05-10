package com.acme.domain;

public class Enumerations {

	public static void main(String[] args) {

		Days today = Days.FRIDAY;
		Days theUsersDay = Days.valueOf("TUESDAY");
		String response = "";

		switch (today) {
		case MONDAY:
			response = "Get To Work!";
			break;
		case FRIDAY:
			response = "Time to chill!";
			break;
		default:
			response = "Practice Java!";
		}
		System.out.println(response);
		System.out.println(theUsersDay);
	}

}
