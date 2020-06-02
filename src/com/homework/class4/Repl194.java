package com.homework.class4;

import java.util.LinkedHashSet;
import java.util.Set;

class Student{
	int studentID;
	String name;
	String lastName;
	public Student(int studentID, String name, String lastName){
		this.studentID=studentID;
		this.name=name;
		this.lastName=lastName;
	}
	public void studentDetails() {
		System.out.println("Student details: "+name+" "+
	lastName+" with id: "+studentID);
	}
}

public class Repl194 {

	public static void main(String[] args) {
		Set<Student>set=new LinkedHashSet<>();
		set.add(new Student(101,"Jawaid","Samir"));
		set.add(new Student(102,"Asel","Umurzakova"));
		set.add(new Student(103,"Diego","Juarez"));
		set.add(new Student(104,"Sohil","Aryan"));
		set.add(new Student(105,"Alizon","Nazarov"));
		for(Student st:set) {
			st.studentDetails();
		}
 
	}

}
