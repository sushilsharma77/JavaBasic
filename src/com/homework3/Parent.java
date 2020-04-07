package com.homework3;

public class Parent {
	public void method() {
		System.out.println("Parent method");
	}

}

class Child extends Parent {
	public void method() {
		super.method();
		System.out.println("Child method");
	}
}
