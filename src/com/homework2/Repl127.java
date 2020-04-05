package com.homework2;

public class Repl127 {
	public static int countA(String s) {
		char s1 = 'a';
		char s2 = 'A';
		int  count = 0;
		for (int i = 0; i < s.length(); i++) {
			char testCharacter=s.charAt(i);
			if(testCharacter==s1||testCharacter==s2) {
				count=count+1;
			}
			
		}
		return count;
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(countA("aaA")); // 3
		System.out.println(countA("aaBBdf8k3AAadnklA")); // 6
	}

}
