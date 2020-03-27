package com.syntax.class15;

public class Task1 {
	void largeNumber(int a,int b) {
		
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}

	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.largeNumber(100, 250);

	}

}
