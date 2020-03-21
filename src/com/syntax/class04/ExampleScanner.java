package com.syntax.class04;

import java.util.Scanner;

public class ExampleScanner {
	public static void main(String[] args) {
		// capture 2 number from a user
		// compare those numbers

		Scanner all = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int first = all.nextInt();
		System.out.println(first);
		System.out.println("Please enter the second number");
		double second = all.nextDouble();
		System.out.println(second);
		System.out.println(first + second + " This is a number of total");
		if (first > second) {
			System.out.println("that is greater number");
		} else {
			System.out.println("that is smaller number");
		}

	}

}
