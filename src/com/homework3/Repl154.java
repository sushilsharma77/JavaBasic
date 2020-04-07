package com.homework3;

public class Repl154 {
private void m1() {
	System.out.println("private m1 method");
}
private void m1(int number) {
	System.out.println("private m1 method with int parameter");
}
	public static void main(String[] args) {
		Repl154 obj=new Repl154();
		obj.m1();
		obj.m1(10);

	}

}
