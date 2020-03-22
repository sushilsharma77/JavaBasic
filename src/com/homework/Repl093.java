package com.homework;

import java.util.Scanner;

public class Repl093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();

		if (language.equalsIgnoreCase("Java")) {
			System.out.println("Java is a programming languge");
		} else if (language.equalsIgnoreCase("c")) {
			System.out.println("C is a procedural programming language");
		} else if (language.equalsIgnoreCase("C++")) {
			System.out.println("C++ is a middle-level programming language");
		}

		else {
			System.out.println("Doesn't match any programming language");
		}

	}

}
