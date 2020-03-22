package com.syntax.class14;

public class Google {
	
	//define feature and behaviour
	int empId;
	double salary;
	String name, lastName, title;
	
	void working() //method header
	{ //method body
		System.out.println(title+" is working");
		
	}
	void getPaid() {
		System.out.println(name+" is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" attending meeting");
	}
	public static void main(String[] args) {
		Google emp1=new Google();
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.empId=123;
		emp1.empId=123;
		emp1.empId=123;
		emp1.empId=123;
		
		
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		
		
		
		
	}
	

}
