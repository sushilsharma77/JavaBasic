package com.syntax.class25;

public interface Shape {
	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */
	 void calculateArea(double x);

	 void calculatePerimeter(double x);
}

class Circle implements Shape {
	public void calculateArea(double x) {
		System.out.println("The area of the given circle is "+(3.14 * x * x));

	}

	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of given circle is "+(2 * 3.14 * x));

	}
}

class Square implements Shape {

	public void calculateArea(double x) {
		System.out.println("The area of the given square is "+(x*x));

	}

	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given square is "+(4*x));

	}

}
