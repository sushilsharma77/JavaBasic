package com.syntax.class04;
import java.util.Scanner;
public class TaskThree {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your city");
	String city=input.next();
	System.out.println(city);
	System.out.println("Please enter the tempeture");
	int temp=input.nextInt();
	System.out.println(temp);
	double tem=98;
	double tem1 =(1.8*tem)+32;
	System.out.println("The tempeture of "+city+" is "+tem1+" fehrenheight");
	

	}

}
