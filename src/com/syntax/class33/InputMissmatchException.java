package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchException {
	//How would handle InputMismatchException? 
	//Input Mismatch Exception when user enters mismatch value then programmer expected.


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your phone number");
		try {
		int phn=scan.nextInt();
		System.out.println(phn);
		}catch(InputMismatchException e) {
			System.out.println("Exception found");
			System.out.println(e);
		System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
