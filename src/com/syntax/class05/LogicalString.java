package com.syntax.class05;

public class LogicalString {
	/*We have total 7 days in a week
	 * if day is 2,3-->SDLC Classes
	 * if day 6,7---> Java Classes
	 * if day 4---->review class
	 * if day 1,5----> off day
	 */

	public static void main(String[] args) {
		
		String day1="Sataurday";
		if(day1.equals("Tuesday")||day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		}else if (day1.equals("Saturday")||day1.equals("Sunday")) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("Invalid day");
		}

		
	}

}
