package com.homework;

public class Repl115 {
	void censorLetter(String a, String aa ) {
		char b='*';
		System.out.println(a.replace('c', b));
		System.out.println(aa.replace('t', b));
	}
	public static void main (String[]args) {
	Repl115 obj=new Repl115();
	obj.censorLetter("computer science", "trick or treat" );
	}

}

