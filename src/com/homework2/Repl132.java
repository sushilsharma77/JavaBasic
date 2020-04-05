package com.homework2;

public class Repl132 {
	private void method1() {
		System.out.println("private");
	}
	void method2() {
		System.out.println("default");
	}
	protected void method3() {
		System.out.println("protected");
	}
	public void method4() {
		System.out.println("public");
	}
	
	
}
 class main{
	 
	 public static void main(String[] args) {
	 Repl132 obj=new Repl132();
	    obj.method2();
		obj.method3();
		obj.method4();
	 }
}
