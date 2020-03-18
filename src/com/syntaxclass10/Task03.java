package com.syntaxclass10;

public class Task03 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String countries[] = { "Nepal", "India", "China" };
		String capital = null;
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Nepal")) {
				capital = "Kathmandu";
			} else if (countries[i].equals("India")) {
				capital = "New Delhi";
			} else if (countries[i].equals("China")) {
				capital = "Beijing";
			}
			System.out.println(countries[i]+" "+capital);
		}
		System.out.println("------------next way------------");
		
		String[] country= {"Nepal", "India", "China"};
		for(String st:country) {
			if(st.equals("Nepal")) {
				capital="Kathmandu";
			}else if(st.equals("India")) {
				capital="New Delhi";
			}else if(st.equals("China")) {
				capital="Beijing";
			}
			System.out.println(st+ " " +capital);
			
		}
		
		System.out.println("_--------switch---------------------");
		
		
		
		
		
	}

}
