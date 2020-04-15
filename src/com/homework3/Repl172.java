package com.homework3;

public class Repl172 {
private String empName;
private int empAge;

public void getEmpName(String empName) {
	this.empName=empName;
}
public String setEmpName() {
	empName="John";
	System.out.println("Employee Name: "+empName);
	return empName;
	}
public void getEmpAge(int empAge) {
	this.empAge=empAge;
}
public int setEmpAge() {
	empAge=30;
	System.out.println("Employee Age: "+empAge);
	return empAge;
	
}
public static void main(String[] args) {
	Repl172 obj=new Repl172();
	obj.setEmpName();
	obj.setEmpAge();
}

}
