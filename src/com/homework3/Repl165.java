package com.homework3;

public abstract class Repl165 {
	public abstract void m1();
	public abstract void m1(String str);

}
class Test extends Repl165{

	@Override
	public void m1() {
		System.out.println("m1 without parameter");
		
	}

	@Override
	public void m1(String str) {
		System.out.println("m1 method with parameter");
		
	}
	
	
}
