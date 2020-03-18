package com.syntax.class04;
import java.util.Scanner;
public class TaskFour {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("You have a credit card?");
		boolean creditCard=input.nextBoolean();
		System.out.println(creditCard);
		System.out.println("how much the balance in credit card");
		double balance=input.nextDouble();
		System.out.println(balance);
		if(balance>1000) {
			System.out.println("You have to pay off immideitly");
		}else {
			System.out.println("You can spend more");
		}
		
		
		
		

	}

}
