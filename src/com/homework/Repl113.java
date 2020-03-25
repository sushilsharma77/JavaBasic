package com.homework;

public class Repl113 {
	void sumEvenToX(int x) {
		int sumeven = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sumeven = sumeven + i;
			}

		}
		System.out.println(sumeven);
	}

	public static void main(String[] args) {
		Repl113 obj = new Repl113();
		obj.sumEvenToX(10);
		obj.sumEvenToX(20);
	}
}
