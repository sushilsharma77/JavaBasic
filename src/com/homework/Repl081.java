package com.homework;

public class Repl081 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };
		int largest = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				if (a[i][j] > largest) {
					largest = a[i][j];

				}

		}

		System.out.println(largest);

	}

}
