package com.syntax.class08;

public class OddNumbers {
	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2ways)

		for (int oddNumber = 20; oddNumber < 50; oddNumber++) {
			if (!(oddNumber % 2 == 0)) {
				System.out.println(oddNumber);
			}
		}

	}
}
