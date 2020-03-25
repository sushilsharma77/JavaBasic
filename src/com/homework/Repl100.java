package com.homework;

import java.util.Scanner;

public class Repl100 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    for(int i=0;i<s.length();i++) {
	    	char ss=s.charAt(i);
	    	System.out.print(ss+" ");
	    }
	}

}
