package com.syntex.class06;

import java.util.Scanner;

public class TAskNo2 {

	public static void main(String[] args) {
		char grade;
		String explanation;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'c':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Unknown";

		}
		System.out.println("Your score is " + explanation);

	}

}
