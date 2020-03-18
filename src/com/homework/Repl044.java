package com.homework;

import java.util.Scanner;

public class Repl044 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String carMake;
	String carOrigin;
	System.out.println("Please enter your favorite car make");
	carMake=scan.next();
	
		
	switch(carMake){
 case "BMW" :
		carOrigin="german car";
		break;
 case "Toyota":
	 carOrigin="japanese car";
		break;
 case "Maserati":
	 carOrigin="italian car";
		break;
 default:
	 carOrigin="Unknown";
		
		}
		
	System.out.println("Your favorite car is "+carOrigin);	
		

	}

}
