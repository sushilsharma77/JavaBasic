package com.homework3;

public class PersonTest {

	public static void main(String[] args) {
		Person per=new Person("John", "Doe", 10,25, 1900, "1234-56-789");
		System.out.println(per.getFirstName());
		System.out.println(per.getLastName());
		per.formatBirthday();
		System.out.println(per.getSsn());

	}

}
