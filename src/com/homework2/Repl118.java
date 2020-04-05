package com.homework2;
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
public class Repl118 {
	String country;
	String capital;
	long population;
	
	void countryDetails() {
		country="USA";
		capital="Washington DC";
		population=330000000;
		System.out.println("The capital of "+country+" is "+capital+" and population is "+population);
	}
	void countryDetails1() {
		country="Kazakhstan ";
		capital="Astana";
		population=18500000;
		System.out.println("The capital of "+country+" is "+capital+" and population is "+population);
	}

	public static void main(String[] args) {
		Repl118 obj=new Repl118();
		obj.countryDetails();
		
		Repl118 obj1=new Repl118();
		obj1.countryDetails1();
		
	}

}
