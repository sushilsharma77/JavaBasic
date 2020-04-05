package com.homework2;
  //declare 3 instance variables to hold an integer, double and char values.
  //Create 2 instances of the class and assign values to variables and the print them

public class Repl117 {
	int num;
	double dbl;
	char chr;
	void result() {
		num=10;
		dbl=10.00;
		chr='A';
		System.out.println(num);
		System.out.println(dbl);
		System.out.println(chr);
	}void result1() {
		num=50;
		dbl=10.50;
		chr='Z';
		System.out.println(num);
		System.out.println(dbl);
		System.out.println(chr);
	}
	

	public static void main(String[] args) {
		Repl117 obj=new Repl117();
		obj.result();
		Repl117 obj1=new Repl117();
		obj.result1();

	}

}
