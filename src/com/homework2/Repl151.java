package com.homework2;

public class Repl151 {
	void m1() {
		System.out.println("m1 method in parent class");
	}

}
class Der extends Repl151{
	void m1() {
		System.out.println("m1 method in child class");
	}
	void m2() {
		this.m1();//compiler automatically do this. even you don't include it
		super.m1();
	}
}
