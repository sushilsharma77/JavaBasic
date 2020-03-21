package com.syntex.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * ask a user where are they from based on the country we will define favorite
		 * food your favorite food is-
		 */
		Scanner scan;
		String country;
		String favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {
		case "Morocco":
			favoriteFood = "Couscous";
			break;
		case "Belarus":
			favoriteFood = "Potato";
			break;
		case "Trukey":
			favoriteFood = "B+aklava";
			break;
		default:
			favoriteFood = "Unknown";

		}
		System.out.println("Your favorite food is " + favoriteFood);
	}

}
