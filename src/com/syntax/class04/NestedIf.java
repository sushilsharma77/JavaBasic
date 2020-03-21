package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean diploma = true;
		double gpa = 4.00;
		if (diploma) {
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should study hard");
			}
			System.out.println("Congratulation");
		} else {

			System.out.println("get a degree");
		}

	}

}
