package com.homework;

import java.util.Scanner;

public class Repl036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1;
		String str2;
		int num1;
		int num2;
		System.out.println("Please enter two strings");
		str1 = scan.nextLine();
		str2 = scan.nextLine();
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		String output;

		if (num1 == num2 && str1.equals(str2)) {
			output = "AND";
		} else if (num1 == num2 || str1.equals(str2)) {
			output = "OR";
		}

		else {

			output = "NONE";
		}
		System.out.println(output);
		output = scan.nextLine();

	}

}
