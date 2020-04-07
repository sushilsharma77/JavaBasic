package com.homework3;

public class AParent {
	public void method1() {
		System.out.println("I am parent public method");
	}
	protected void method2() {
		System.out.println("I am parent Protected method");
	}
	 void method3() {
		System.out.println("I am parent default method");
	}
	private void method4() {
		System.out.println("I am parent private method");
	}

}
class AChild extends AParent{
	public void method1() {
		
		System.out.println("I am a child public method");
	}
	protected void method2() {
		
		System.out.println("I am a child Protected method");
	}
	 void method3() {
		 
		System.out.println("I am a child default method");
	}
	private void method4() {
		System.out.println("I am a child private method");
	}
} 
