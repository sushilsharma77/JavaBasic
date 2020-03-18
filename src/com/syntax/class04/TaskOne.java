package com.syntax.class04;
import java.util.Scanner;
public class TaskOne {

	public static void main(String[] args) {
	Scanner loan=new Scanner(System.in);
	System.out.println("Please tell me the loan amount");
	double amount=loan.nextDouble();
	System.out.println(amount);
	
	if(amount<=200000) {
		System.out.println("You will get the loan");
	}else {
		System.out.println("You will not get the loan");
	}
		
		
		
	}

}
