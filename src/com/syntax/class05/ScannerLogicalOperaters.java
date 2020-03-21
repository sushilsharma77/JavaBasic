package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperaters {

	public static void main(String[] args) {
		/*
		 * Take age input from a user and then based on the age print output if age
		 * from0-3--->you are a baby if age from 4-5---> you are a kid if age for
		 * 6-12---> you are a child if age for 13-19---> you are a teenager if age for
		 * 20-64---> you are an adult if age is more or equal to 65---> you are a senior
		 */

		int age;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
		// perform verification
		if (age >= 0 && age < 3) {
			System.out.println("You are a baby");
		} else if (age >= 3 && age <= 5) {
			System.out.println("You are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a kid");
		}

	}

}
