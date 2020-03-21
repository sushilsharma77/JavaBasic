package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		double num1 = 10.50;
		double num2 = 5.50;
		double addition = num1 + num2;
		double multiply = num1 * num2;
		double division = num1 / num2;
		float num3 = 3.9f;
		float square = num3 * num3;
		int width = 5;
		int height = 8;
		int perimeter = width * height;

		int ram = 50;
		int sita = 11;
		int remainer = ram % sita;
		System.out.println("The remainer between ram sita is " + remainer);

		System.out.println("The addition of 2 numbers num1 and num2 is equal to " + addition);
		System.out.println("The multiply of 2 numbers num1 and num2 is equal to " + multiply);
		System.out.println("The division of 2 numbers num1 and num2 is equal to " + division);
		System.out.println("The square of the 3.9 is " + square);
		System.out.println(perimeter);

	}

}
