package com.homework;

import java.util.Scanner;

public class Repl097 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		for(int i=givenString.length()-1;i>-1;i--) {
		char reverse=givenString.charAt(i);
		System.out.println(reverse);
		}
		
	}
	

}
