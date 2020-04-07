package com.homework3;

public class Repl153 {
	public void display(int number) {
		System.out.println(number);
	}
	public void display(String str) {
		System.out.println(str);
	}
	public void display(double num) {
		System.out.println(num);
	}
	

	public static void main(String[] args) {
		Repl153 obj=new Repl153();
		obj.display(100);
		
		Repl153 obj1=new Repl153();
		obj1.display("Syntax Technologies");
		
		Repl153 obj2=new Repl153();
		obj2.display(100.09);
	}

}
