package com.homework3;

public class Repl161 {
	final void mt1(boolean bl){
		  System.out.println("Final method with boolean parameter");
	}
	final void mt1(String str){
	      System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		Repl161 obj=new Repl161();
		obj.mt1(false);
		obj.mt1(null);
	}

}
