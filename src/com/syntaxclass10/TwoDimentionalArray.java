package com.syntaxclass10;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int[][] number = new int[3][4];
		number[0][0] = 10;
		number[0][1] = 20;
		number[0][2] = 30;
		number[0][3] = 40;

		number[1][0] = 5;
		number[1][1] = 10;
		number[1][2] = 15;
		number[1][3] = 20;

		number[2][0] = 1;
		number[2][1] = 2;
		number[2][2] = 3;
		number[2][3] = 4;

		System.out.println(number[2][2]);
		System.out.println("___________next way_____________________");
		int[][] num = { { 10, 20, 30, 40 }, { 5, 10, 15, 20 }, { 1, 2, 3, 4 } };
		System.out.println(num[1][1]);
		

	}

}
