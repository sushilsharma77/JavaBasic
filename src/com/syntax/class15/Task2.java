package com.syntax.class15;

public class Task2 {
	void num(int a) {
		if(a%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.num(12);
	}

}
