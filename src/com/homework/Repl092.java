package com.homework;

import java.util.Scanner;

public class Repl092 {

	public static void main(String[] args) {
		//Using Scanner class input string value. 
		//Print out the following: "The first 3 letters of ___ is ___"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("In:");
		String str=scan.nextLine();
		
		System.out.println("The first 3 letter of "+str+" is "+str.substring(0, 3));

	

	}

}
