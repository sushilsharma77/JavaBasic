package com.homework;

public class Repl110 {
	void sum(int a, int b) {
		System.out.println("Addition "+(a + b));
	}

	void sub(int a, int b) {
		System.out.println("Subtraction "+(a - b));
	}

	void mult(int a, int b) {
		System.out.println("Multiplication "+a * b);
	}

	public static void main(String[] args) {
		Repl110 equation = new Repl110();
		equation.sum(20, 10);
		equation.mult(10, 3);
		equation.sub(30, 10);
	}

}
