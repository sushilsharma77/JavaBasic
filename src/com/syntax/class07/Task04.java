package com.syntax.class07;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * We are playing a lottery and a lucky number is 17 we want to keep asking user
		 * any number from 1-20 until he guess the lucky number-->congrats
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int number;
		int luckyNumber = 17;
		do {
			System.out.println("Please enter any number from 1-20");
			number = scan.nextInt();
		} while (number != luckyNumber);

		System.out.println("Congratulation You got it");

	}

}
