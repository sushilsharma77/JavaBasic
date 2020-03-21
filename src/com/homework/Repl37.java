package com.homework;

import java.util.Scanner;

public class Repl37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean thirsty;
		boolean sleepy;
		String drink;
		System.out.println("Are you thirsty?");
		thirsty = input.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = input.nextBoolean();

		if (thirsty && !sleepy) {
			drink = "Water";
		} else if (thirsty && sleepy) {
			drink = "Coffee";
		} else if (!thirsty && sleepy) {
			drink = "Tea";
		} else {
			drink = "Nothing";
		}
		System.out.println("Looks like you need " + drink);

	}

}
