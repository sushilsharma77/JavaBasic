package com.syntax.class12;

public class StringManupulationMore {

	public static void main(String[] args) {
		//to get substring from a given string
		//substring=string inside your string
		System.out.println("____subString()______________");
		String str="Today is a rainy day";
		String partialString=str.substring(6);//start from 6 until end of the string
		System.out.println(partialString);
		//rainy day
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);//start from 0 ends at index 5
		System.out.println(partialString);
		
		//rainy
		
		partialString=str.substring(11, 16);
		System.out.println(partialString);
		

	}

}
