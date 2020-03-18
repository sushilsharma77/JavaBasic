package com.syntex.class06;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan;
		char gender;
		String genderType;
		scan=new Scanner(System.in);
		System.out.println("Please enter gender:M or F");
		gender=scan.next().charAt(0);
		
		switch(gender) {
		case 'M':
			genderType="male";
			break;
		case 'F':
			genderType="Female";
			break;
		default:
			genderType="unknown";
			
		}
		
System.out.println("Your gender is "+genderType);
	}

}
