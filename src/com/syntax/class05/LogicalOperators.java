package com.syntax.class05;

public class LogicalOperators {
public static void main(String[] args) {
	int day=4;
	if(day<=5&&day>=1) {
		System.out.println("The day is weekday");
	}else if (day==6||day==7){
		System.out.println("The day is weekend");
	}else {
		System.out.println("Invalid day");
	}
	
}
	}