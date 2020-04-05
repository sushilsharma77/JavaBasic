package com.homework2;



public class Repl125 {

	static String mixString(String s1, String s2) {
		 StringBuilder result = new StringBuilder(); 
		  
		for (int i = 0; i < s1.length() || i < s2.length(); i++) {

			if (i < s1.length())
				result.append(s1.charAt(i));

			if (i < s2.length())
				result.append(s2.charAt(i));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String firstValue = mixString("12345", "abcde");
		System.out.println(firstValue);
		String secondValue = mixString("howdy", "hello");
		System.out.println(secondValue);
	}
}
