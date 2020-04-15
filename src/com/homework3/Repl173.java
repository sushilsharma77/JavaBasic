package com.homework3;

public class Repl173 {
private String empName="John";
private int empAge=30;
public void getEmpNameAge(String empName,int empAge) {
	 this.empName=empName;
	 this.empAge=empAge;
}
 public static void main(String[] args) {
	Repl173 obj=new Repl173();
	System.out.println("Employee Name:"+obj.empName);
	System.out.println("Employee Age:"+obj.empAge);
}
}
