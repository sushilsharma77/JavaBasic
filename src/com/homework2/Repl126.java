package com.homework2;

public class Repl126 {
	static String thirdLetter(String s) {
		String letter="";
		for (int i = 0; i < s.length(); i += 3) {
			System.out.print(s.charAt(i));
		}
		return letter;
	}

	public static void main(String[] args) {

		System.out.println(thirdLetter("hello there"));
		System.out.println(thirdLetter("technology"));
	}

}
