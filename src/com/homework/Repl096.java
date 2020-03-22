package com.homework;

import java.util.Scanner;

public class Repl096 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		for(int i=s.length()-1;i>-1;i--) {
			char reverse=s.charAt(i);
			System.out.print(reverse+" ");
		}
		System.out.println();
		
		

	}

}
