package com.syntex.class09;

public class PyramidNestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int c = 1; c <= i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("----------");

		for (int i = 1; i <= 5; i++) {
			for (int c = 1; c <= i; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
