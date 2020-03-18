package com.syntex.class06;

import java.util.Scanner;

public class Taskno1 {
	
	//Ask user to enter their country and capture it.
	//Once values are captured print which language user speaks.

public static void main(String[] args) {
	String country;
	String lang;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch(country.toLowerCase()) {
	case "nepal":
		lang="Nepali";
		break;
	case "india":
		lang="Indian";
		break;
	case "usa":
		lang="English";
		break;
	default:
		lang="Unknown";
	}
		System.out.println("The user speaking language is "+lang);
			
		
	
	
}
  }