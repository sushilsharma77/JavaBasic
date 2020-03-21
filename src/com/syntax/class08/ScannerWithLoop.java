package com.syntax.class08;

import java.util.Scanner;

public class ScannerWithLoop {

	// we want to ask user's name 5 times and print Good Afternoon ___ 5 times

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = null;
		int times = 1;
		String thanks;
		while (times <= 5) {
			System.out.println("What is your name?");
			name = scan.nextLine();
			System.out.println("Good afternoon " + name);
			thanks = scan.nextLine();
			System.out.println("Have a good day " + name);
			times++;
		}

	}

}
