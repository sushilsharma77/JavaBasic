package com.homework2;

public class Repl134 {
	public static String maxLength(String[]array) {
		int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }
	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"
	}
	
	}


