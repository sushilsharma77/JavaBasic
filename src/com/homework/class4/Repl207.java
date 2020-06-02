package com.homework.class4;
public class Repl207 {
public static void main(String[] args) {
	try {	
	int[]array= {1,2,3};
		System.out.println(array[3]);
	}catch(Exception e) {
		System.out.println("java.lang.ArrayIndexOutOfBoundsException: 4");
		System.out.println("at Main.main(Main.java:5)");
	}

	}

}
