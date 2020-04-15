package com.homework3;

public abstract class Repl166 {
	public abstract void m1();
	public void m2() {
		System.out.println("Parent class providing implimentation");
	}

}
class Mainn extends Repl166{
	public void m1() {
		System.out.println("Child class providing implimentation");
	}
}
