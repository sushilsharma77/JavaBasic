package com.homework2;


public class Repl116 {
	int year;
	String schoolName;
	int batchNumber;
	void studentDetails() {
		year=2020;
		schoolName="Syntax";
		batchNumber=6;
		System.out.println("I am a student of batch "+batchNumber+" studying at "+schoolName
				+" in the year of "+year);
	}

	public static void main(String[] args) {
		Repl116 obj=new Repl116();
		obj.studentDetails();

	}

}
