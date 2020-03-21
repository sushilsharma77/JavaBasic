package com.syntex.class09;

public class Homework01 {

	public static void main(String[] args) {
		// Create an array of chars and store grades in to it: A,B,C,D,E,F.
		// Then print a grade B (use 2different ways of creating an array)
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'c';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[1]);
		System.out.println("---------2nd way-------------------------");

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grade[1]);

	}

}
