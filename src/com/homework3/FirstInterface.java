package com.homework3;

public interface FirstInterface {
	void firstMethod();
}
interface SecondInterface extends FirstInterface{
	void secondMethod();
}
class Execute implements SecondInterface{

	@Override
	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
		
	}
	
	}

