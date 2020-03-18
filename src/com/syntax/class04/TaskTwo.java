package com.syntax.class04;
import java.util.Scanner;
public class TaskTwo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(age);
		if(age>=18) {
			System.out.println("I will issue your driver lisence");
		}else {
			System.out.println("You should get a learner's permit");
		}
		
		
		
		
	}

}
