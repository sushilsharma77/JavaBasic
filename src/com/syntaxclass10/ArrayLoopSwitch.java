package com.syntaxclass10;

public class ArrayLoopSwitch {

	public static void main(String[] args) {
		String[] countries = { "Nepal", "India", "China" };
		String capital = null;
		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Nepal":
				System.out.println("The capital is Kathmandu");
				break;
			case "India":
				System.out.println("The capital is New Delhi");
				break;
			case "China":
				System.out.println("The capital is Bejing");
			}
			System.out.println();
		}

		System.out.println("__________________________");
	}

}
