package com.syntax.class11;

public class StringDEmo {

	public static void main(String[] args) {
		String school = " Syntax ";

		String str = new String("HELLO");

		String str1 = "This is a String 7676,&&,@";

		// How many characters string has
		System.out.println("___Length()function------");
		System.out.println(school.length());
		int size = str.length();
		System.out.println("String length is " + size);

		// convert String to lowercase or uppercase
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str.toLowerCase();
		System.out.println(str);

		// concatinate 2 String
		String newString = str + school;
		System.out.println(newString);

		String day = "Saturday";
		String date = "14";

		String newDate = day.concat(date);
		System.out.println(newDate);

		char grade = 'A';
		String str2 = "Student";
		// below code will give CE,
		// since concat()method is used to attach 1 String to another String
		// Str2.cocate(grade);
		System.out.println("____isEmpty Function_________");
		// tells true if there is no characters inside the String
		// tells falls if there are characters inside the String
		String str3 = "";
		boolean empty = str3.isEmpty();
		System.out.println(empty);

		System.out.println("--------trim( Function)-----------------------");
		// removes empty/white space at the beigining and end of the String
		String str4 = ("Welcome to Syntax!    ");
		str4 = str4.trim();
		System.out.println(str4);

	}

}
