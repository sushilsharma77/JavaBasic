package com.homework2;

public class Repl123 {
	String str;
	static String str1;
	
	void display() {
		str="Programming is amazing";
		System.out.println(str); 
	}
	
	static void display1() {
		str1="Java is awesome";
		System.out.println(str1);
	}

	public static void main(String[] args) {
		
		Repl123 obj=new Repl123();
		obj.display();
		display1();

	}

}
