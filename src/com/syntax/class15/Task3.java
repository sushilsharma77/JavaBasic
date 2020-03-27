package com.syntax.class15;

public class Task3 {
	void isPalindrom(String word) {
		String reverse="";
		char[]array=word.toCharArray();
		for(int i =array.length-1;i>=0;i--) {
			reverse +=array[i];
		}
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("This is palindrom");
		}else {
			System.out.println("This is not palindrom");
		}
	}

	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.isPalindrom("kayak");
	}
}
