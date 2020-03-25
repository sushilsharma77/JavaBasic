package com.homework;

import java.util.Scanner;

public class Repl097 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		String Reverse="";
	   	givenString=givenString.replace("","");
	   	for(int i=givenString.length()-1;i>=0;i--){
	   	  Reverse=Reverse+(givenString.charAt(i));
	   	}
	   	  boolean palindrome;
			if (givenString.equalsIgnoreCase(Reverse)) {
				palindrome = true;
			} else {
				palindrome = false;
			}

			System.out.println(palindrome);
		}

	
}
