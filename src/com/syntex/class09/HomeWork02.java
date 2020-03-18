package com.syntex.class09;

public class HomeWork02 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		System.out.println("------first way------------");
		
		String [] names=new String[6];
		names[0]="Sushil";
		names[1]="Dharmendra";
		names[2]="Lok";
		names[3]="Bishnu";
		names[4]="Brandan";
		names[5]="Toyam";
		
		System.out.println(names[0]);
		
		System.out.println("----------------2nd way--------------------------");
		
		String [] name= {"Sushil","Dharmendra","Lok","Bishnu","Brandan","Toyam"};
		
		System.out.println(name[0]);
		
	}

}
