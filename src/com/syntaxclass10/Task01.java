package com.syntaxclass10;

public class Task01 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it.
		//Using 2 different loops print all elements from the array.
		
		String[]animals=new String[6];
		animals[0]="Tiger";
		animals[1]="Deer";
		animals[2]="Bear";
		animals[3]="fox";
		animals[4]="Rhino";
		animals[5]="Monkey";
		
		for(int i=0;i<animals.length;i++){
		System.out.println(animals[i]);
		}
		System.out.println("-------------------------------------");
		
		for(String wild:animals) {
			System.out.println(wild);
		}

	
		
	}

}
