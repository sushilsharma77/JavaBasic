package com.homework;

import java.util.Scanner;

public class Repl039 {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int mark;
String grade;
System.out.println("Please enter your mark");
mark=input.nextInt();

if(mark>=1&&mark<25) {
	grade="F";
	System.out.println("Your grade is "+grade);
}else if(mark>=25&&mark<45) {
	grade="E";
	System.out.println("Your grade is "+grade);
}else if(mark>=45&&mark<50) {
	grade="D";
	System.out.println("Your grade is "+grade);
}else if(mark>=50&&mark<60)	{
	grade="C";
	System.out.println("Your grade is "+grade);
}else if(mark>=60&&mark<80) {
	grade="B";
	System.out.println("Your grade is "+grade);
}else if(mark>=80&&mark<=100){
	grade="A";
	System.out.println("Your grade is "+grade);
}

else {
	grade="valid mark";
	System.out.println("Please enter "+grade);
}
	

	
	
}
	
		}
	


