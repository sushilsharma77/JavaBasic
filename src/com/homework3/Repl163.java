package com.homework3;
 
public class Repl163 {
	String reverse;
	final void getReverse(String reverse) {
		this.reverse=reverse;
		char[]rev=reverse.toCharArray();
		for(int i=rev.length-1;i>=0;i--) 
		System.out.print(rev[i]);
	}
	public static void main(String[] args) {
		Repl163 obj=new Repl163();
		obj.getReverse("hello");
	}

}
