package com.syntax.class13;

public class Review {

	public static void main(String[] args) {
		// 1st way
		int[][] numbers = new int[3][4];
		// print third element in 2nd row
		System.out.println(numbers[1][2]);
		// initializing value second row=row index 0
		numbers[1][0] = 9;
		numbers[1][1] = 6;
		numbers[1][2] = 2;
		numbers[1][3] = 3;
		// print
		System.out.println(numbers[1][2]);
		// 2nd way
		int[][] numbers2 = { { 9, 6, 2, 8 }, { 7, 1, 6, 12 }, { 3, 0, 8, 5 } };
		System.out.println(numbers2[0][3]);
		int row = numbers2.length;
		System.out.println(row);

		int length0 = numbers2[0].length;
		int length1 = numbers2[1].length;
		int length2 = numbers2[2].length;

		System.out.println(length0 + length1 + length2);

	}

}
