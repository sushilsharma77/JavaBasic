package com.homework;

public class Repl075 {

	public static void main(String[] args) {
		// Using the following array.
		// {45, 78, 12, 67, 55, 89, 23, 77, 88}
		// Create a for loop to extract values
		// from that array so your output looks as below:
		int[] array = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[1] + " " + array[4] + " " + array[7]);
			break;
		}

	}

}
