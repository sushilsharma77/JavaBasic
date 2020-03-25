package com.syntax.class14;

public class Practice {
	void sum(int a,int b) {
		System.out.println(a+b);
	}void sub(int a,int b){
		System.out.println(a-b);
	}void mult(int a,int b){
		System.out.println(a*b);
	}void div(int a,int b){
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Practice num=new Practice();
		num.sum(10, 20);
		
		Practice num1=new Practice();
		num1.sub(100, 20);
		
		Practice num3=new Practice();
		num3.mult(20, 40);
		
		Practice num4=new Practice();
		num4.div(40, 20);
		
		
		

	}

}
