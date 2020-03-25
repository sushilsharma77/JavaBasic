package com.homework;

import java.util.Scanner;

public class Repl098 {

	public static void main(String[] args) {
		// 
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String newWord="";
	    for(int i=0;i<word.length();i+=2) {
	    newWord=newWord+word.charAt(i);
	   
	  
	} System.out.println(newWord);
	    
	    

	}
	
}
