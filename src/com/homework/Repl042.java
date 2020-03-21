package com.homework;

import java.util.Scanner;

public class Repl042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String studentName;
		int rollNumber;
		System.out.println("enter the roll number of the Child");
		rollNumber = scan.nextInt();

		switch (rollNumber) {
		case 101:
			studentName = "Ramesh";
			break;
		case 102:
			studentName = "Mahesh";
			break;
		case 103:
			studentName = "Mukesh";
			break;
		default:
			studentName = "Not found Student name:in Class";

		}

		System.out.println(studentName);

	}

}
