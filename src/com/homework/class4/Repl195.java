package com.homework.class4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	private String fullName;
	private int ssn;
	private double salary; 
	public Employee(String fullName,int ssn,double salary) {
		this.fullName=fullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	public String getFullName() {
		return fullName;
	}
	public int getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
}

public class Repl195{
	public static void main(String[] args) {
		Set<Employee>set=new HashSet<>();
		set.add(new Employee("John Doe",123456789,80000.0));
		set.add(new Employee("Jane Smith",987654321,90000.0));
		set.add(new Employee("Jackie Chan",0,1000000.0));
		
		for(Employee em:set) {
			System.out.println(em.getFullName());
			System.out.println(em.getSsn());
			System.out.println(em.getSalary());
		}
		Iterator<Employee>it=set.iterator();
		while(it.hasNext()) {
		Employee emp=	it.next();
		
		System.out.println();
		
		System.out.println(emp.getFullName());
		System.out.println(emp.getSsn());
		System.out.println(emp.getSalary());
		}
		

	}
}


