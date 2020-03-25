package com.homework;

public class Repl112 {
	void trueFalse(int a,int b) {
		boolean even;
		if(a%2==0&&b%2==0) {
			even=true;
		}else {
			even=false;
		}
		System.out.println(even);
	}

	public static void main(String[] args) {
		Repl112 obj=new Repl112();
		obj.trueFalse(5, 9);

	}

}
