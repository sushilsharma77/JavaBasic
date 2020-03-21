package com.syntaxclass10;

public class RetrivingValueFrom2DArray {

	public static void main(String[] args) {
		String[][] month = { { "January", "February", "March" }, { "April", "May", "June" },
				{ "July", "August", "September" }, { "October", "November", "December" } };
		for (int i = 0; i < month.length; i++) {
			for (int j = 0; j < month[i].length; j++) {
				System.out.println(month[i][j]);

			}
		}
	}

}
