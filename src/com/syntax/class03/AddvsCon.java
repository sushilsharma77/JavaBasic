package com.syntax.class03;

public class AddvsCon {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		String x = "Hello";
		String y = "Bye";

		System.out.println(a + b + x + y);
		System.out.println(a + x + b + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + "" + b + x + y);

		int c = 40;
		int d = 50;

		System.out.println(c + d);
		System.out.println(c + "" + d);
		System.out.println(d + "" + c);
	}

}
