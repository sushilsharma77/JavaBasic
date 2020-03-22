package com.homework;

public class Repl095 {

	public static void main(String[] args) {
		//Create a String given="Hello Syntax friends". 
		//Using String methods from given String create new String "Welcome Syntax family"
		 String given="Hello Syntax friends";
		 String str=given.replaceAll(given, "Welcome Syntax family");
		 System.out.println(str);
		

	}

}
