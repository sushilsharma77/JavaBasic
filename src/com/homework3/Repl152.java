package com.homework3;

public class Repl152 {
	public void method(int num1, int num2, int num3, int num4) {
		int sub = (num1 - num2 - num3 - num4);
		System.out.println(sub);
	}

	public void method(int num1, int num2, int num3) {
		int sub = (num1 - num2 - num3);
		System.out.println(sub);
	}

	public void method(int num1, int num2) {
		int sub = (num1 - num2);
		System.out.println(sub);
	}

	public static void main(String[] args) {
		Repl152 obj = new Repl152();
		obj.method(200, 100, 40, 20);

		Repl152 obj1 = new Repl152();
		obj1.method(200, 100, 70);

		Repl152 obj2 = new Repl152();
		obj2.method(200, 180);

	}

}
