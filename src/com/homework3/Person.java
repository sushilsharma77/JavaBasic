package com.homework3;

public class Person {
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;
	
	Person(String firstName,String lastName,int birthMonth,
			int birthDay,int birthYear, String ssn){
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthMonth=birthMonth;
		this.birthDay=birthDay;
		this.birthYear=birthYear;
		this.ssn=ssn;
	}
	public String formatBirthday() {
		String composeBirthday;
		System.out.println(composeBirthday=birthMonth+"/"+birthDay
				+"/"+birthYear);
		return composeBirthday;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSsn() {
		return ssn;
	}
	

}
