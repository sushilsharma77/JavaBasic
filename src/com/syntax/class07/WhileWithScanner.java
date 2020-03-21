package com.syntax.class07;

import java.util.Scanner;

public class WhileWithScanner {

	public static void main(String[] args) {
		// we want to ask user's name 5 times and print Good Afternoon ___ 5 times

		Scanner scan = new Scanner(System.in);
		String name = null;
		int num = 1;
		while (num <= 5) {
			System.out.println("What is your name?");
			name = scan.nextLine();
			System.out.println("Good afternoon " + name);
			num++;
		}

	}

}
