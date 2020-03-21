package com.homepractice;

public class BreakandContinuei {

	public static void main(String[] args) {
//break;
		for (int i = 1; i < 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}

		// continue;

		for (int num = 50; num <= 60; num++) {
			if (num == 55) {
				continue;
			}
			System.out.println(num);
		}

	}

}
