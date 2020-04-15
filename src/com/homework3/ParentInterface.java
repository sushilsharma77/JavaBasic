package com.homework3;

public interface ParentInterface {
	void parentMethod();

}
interface ChildInterface extends ParentInterface{
	void childMethod();
}
class InterfaceTest implements ChildInterface{

	@Override
	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");
		
	}

	@Override
	public void childMethod() {
		System.out.println("Child Method-hello Syntax");
		
	}
	
}
