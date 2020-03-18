package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		double mortgageRate = 4.4;
		double mortgagePrice = 180000;

		if (mortgageRate > 4.5) {
			System.out.println("You will not buy a house");
		} else {
			System.out.println("You should buy a house");
			if (mortgagePrice > 190000) {
				System.out.println("You should take a loan");
			} else {
				System.out.println("You will pay cash");
			}
		}

	}

}
