package com.homework;

import java.util.Scanner;

public class Repl041 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		String babyActivity;
		System.out.println("enter the age of the child");
		age = scan.nextInt();

		switch (age) {
		case 1:
			babyActivity = "You can Crawl";
			break;
		case 2:
			babyActivity = "You can Talk";
			break;
		case 3:
			babyActivity = "You can Dance";
			break;
		case 4:
			babyActivity = "You can get Trouble";
			break;
		default:
			babyActivity = "I don't know how old you are";
		}

		System.out.println(babyActivity);

	}

}
