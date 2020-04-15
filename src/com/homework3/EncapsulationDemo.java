package com.homework3;

public class EncapsulationDemo {
	private String empName;
	private int empAge;
	
	public void setEmpName(String empName) {
		this.empName=empName;
		
	}
	public String getEmpName() {
		empName="Mario";
		System.out.println("Employee name: "+empName);
		return empName;
		}
	
	public void setEmpAge(int empAge) {
		this.empAge=empAge;
		
	}
	public int getEmpAge() {
		empAge=32;
		System.out.println("Employee age: "+empAge);
		return empAge;
		}
	public static void main(String[] args) {
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.getEmpName();
		demo.getEmpAge();
		
		
	}
 }
  
 
