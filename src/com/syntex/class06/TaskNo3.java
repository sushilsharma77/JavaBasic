package com.syntex.class06;

import java.util.Scanner;

public class TaskNo3 {

	public static void main(String[] args) {
		 int num1;
		 int num2;
		 String sign=null;
		 int result=0;
		 
 Scanner scan=new Scanner(System.in);
 System.out.println("Pleasse enter your first number");
  num1=scan.nextInt();
 System.out.println("Pleasse enter your second number");
 num2=scan.nextInt();
 System.out.println("Pleasse enter your sign operator");
 sign=scan.next();
	switch(sign) {
	case "+":
		result=(num1+num2);
		break;
	case "-":
		result=(num1-num2);
		break;
	case "*":
		result=(num1*num2);
		break;
	case "/":
		result=(num1/num2);
		break;
	default:
		result=0;
	}	 
System.out.println(result);
	}	

}
