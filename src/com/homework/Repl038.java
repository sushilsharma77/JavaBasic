package com.homework;

import java.util.Scanner;

public class Repl038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean weekend;
		String subject;
		System.out.println("Is it weekend");
		weekend = scan.nextBoolean();

		if (!weekend) {
			subject = "Manual testing";
		} else {
			subject = "Java";
		}
		System.out.println("Today you will be learning " + subject);

	}

}
