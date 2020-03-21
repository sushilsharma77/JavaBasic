package com.syntax.class13;

public class TwoDArraySum {

	public static void main(String[] args) {
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		int rows = num.length;
		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < num[row].length; col++) {
				int element = num[row][col];
				System.out.print(element + " ");
			}
			System.out.println();
		}
		// sum of all elements in a 2D array
		int sum = 0;
		for (int row = 0; row < num.length; row++) {
			// iterating elements of a row
			for (int col = 0; col < num[row].length; col++) {
				int element = num[row][col];
				sum += element;
			}

		}
		System.out.println(sum);

	}

}
