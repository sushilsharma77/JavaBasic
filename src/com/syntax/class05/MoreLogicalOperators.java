package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*We have total 7 days in a week
		 * if day is 2,3-->SDLC Classes
		 * if day 6,7---> Java Classes
		 * if day 4---->review class
		 * if day 1,5----> off day
		 */
		int day=6;
		if(day==2 && day==3) {
			System.out.println("Today is SDLC Class");
		}else if(day==6&&day==7) {
			System.out.println("Today is JAVA Class");
		}else if(day==1 && day ==4) {
			System.out.println("Today is no Class");
		}else if(day==4) {
			System.out.println("Today is a review Class");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
	}

}
