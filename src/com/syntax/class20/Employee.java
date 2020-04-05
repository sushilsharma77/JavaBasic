package com.syntax.class20;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee gets pay "+salary);
	}
	static void work() {
		System.out.println("Employee works for "+company);
	}

}
