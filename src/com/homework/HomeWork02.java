package com.homework;

public class HomeWork02 {

	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names
		// and second row will contain grades.
		// Then your program should print name of the students that has A and B grade

		String[][] names = { { "Jone", "Hasim", "Alex", "James" }, { "A", "B", "C", "D" }

		};
		System.out.println("Students who have grade A and B are " + names[0][0] + " and " + " " + names[0][1]);

	}

}
