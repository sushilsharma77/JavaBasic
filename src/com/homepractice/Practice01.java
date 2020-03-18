package com.homepractice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*  Ask a user to pay for a candy As long as the entered price is not 2
		 *  we need  keep ask for paying 
		 *  One amount is correct --> "Enjoy your candy" 
		 *  */
		

		Scanner scan= new Scanner(System.in);
		double price;
		
		do {
			System.out.println("Please enter your price");
			price=scan.nextDouble();
		}while(price!=2);{
			System.out.println("Enjoy your candy");
		}
		

	}

}
