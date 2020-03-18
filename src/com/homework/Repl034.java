package com.homework;

import java.util.Scanner;

public class Repl034 {

	public static void main(String[] args) {
		Scanner scan;
		int num1;
		int num2;
		int num3;
		int largest;
		scan=new Scanner(System.in);
		System.out.println("Please enter three distinct numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		if (num1>num2) {
		
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}
			
			
			
		}else {
			if (num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		}
		System.out.println("The largest number is "+largest);
		
	}

}
