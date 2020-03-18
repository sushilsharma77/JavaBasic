package com.syntax.class05;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
		int height=70;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your height");
   height=scan.nextInt();
   if(height<60||height<1) {
	   System.out.println("You are short");
   }else if(height>60&&height<72) {
	   System.out.println("medium");
   }else {
	   System.out.println("tall  ");
   }
   
	
		
		

	}

}
