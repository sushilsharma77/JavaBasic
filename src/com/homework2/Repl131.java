package com.homework2;

public class Repl131 {
	private String name;
    String city;
	public String schoolName;
	protected int batchNumber;
	//My name is ___ and I live in ___. I study at ___ in batch ___
	void details() {
		name="John";
		city="Maimi";
		schoolName="Syntax";
		batchNumber=6;
		System.out.println("My name is "+name+" and I live in "+city+". I study at "+
				schoolName+" in batch "+batchNumber);
	}

	public static void main(String[] args) {
		Repl131 obj=new Repl131();
		obj.details();
	}

}
