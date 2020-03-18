package com.homework;

import java.util.Scanner;

public class Repl063 {

	public static void main(String[] args) {
		// Write a for loop that will print out a series of numbers
		// starting at 0 and ending at the x(value must be taken from a user),
		// exclusive.
		Scanner scan=new Scanner(System.in);
		
		int num1;
		System.out.println("Please enter the number");
		num1=scan.nextInt();
		for(int num=0;num<=num1;num++) {
			System.out.println(num);
			
		}

	}

}
