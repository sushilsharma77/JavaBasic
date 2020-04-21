package com.syntax.class29;

import java.util.*;

class Student {
	String studentName;
	int studentID;

	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

}

public class Task3 {
	// Create a Set collection that will hold Objects of Student Type.
	// In this set we do not care about the insertion order.
	// Each student object should have name and studentID. Display name of each
	// student.

	public static void main(String[] args) {
		Set<Student> name = new HashSet<>();
		name.add(new Student("Bishnu", 1111));
		name.add(new Student("Lok", 2222));
		name.add(new Student("Dharma", 3333));
		name.add(new Student("Sushil", 4444));

		for (Student sn : name) {
			System.out.println(sn.studentName + " " + sn.studentID);

		}
		System.out.println("__________________________");
		Iterator<Student>it=name.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.studentName);
		}

	}

}
