package com.syntax.class03;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x == y);
		System.out.println(x != y);

		double d1 = 99.99;
		double d2 = 100.99;

		boolean result1 = d1 > d2;
		boolean result2 = d1 < d2;
		boolean result3 = d1 != d2;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
