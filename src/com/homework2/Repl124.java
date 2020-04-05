package com.homework2;

public class Repl124 {
	static String countryName;
	static String continent;
	
	static void display() {
		
		System.out.println(countryName+" located on "+continent+" continent");
		
	}

	public static void main(String[] args) {
		countryName="Nepal";
		continent="Asia";
		display();

	}

}
