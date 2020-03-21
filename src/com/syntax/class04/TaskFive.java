package com.syntax.class04;

import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years did you work?");
		int workedYear = input.nextInt();
		System.out.println(workedYear);
		System.out.println("How much the annual salary was?");
		double annualSalary = input.nextDouble();
		System.out.println(annualSalary);
		if (workedYear >= 5) {
			System.out.println("You are eligible for the bonus");
			if (annualSalary > 50000) {
				System.out.println("bonus = 5000");
			} else {
				System.out.println("bonus =3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
