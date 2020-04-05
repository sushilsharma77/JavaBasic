package com.homework2;

public class Repl130 {
	private void method1() {
		System.out.println("This is private method");
	}
	 void method2() {
		System.out.println("This is default method");
	}
	 protected void method3() {
		 System.out.println("This is protected method");
	 }
	 public void method4() {
		 System.out.println("This is public method");
	 }

	public static void main(String[] args) {
		Repl130 obj=new Repl130();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();

	}

}
