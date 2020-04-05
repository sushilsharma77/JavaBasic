package com.syntax.class18;

public class ClassTask {
	String name;
	int grade1, grade2, grade3;

	ClassTask(String studentName, int studentGrade1, int studentGrade2, int studentGrade3) {
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
	}

	public int gradeAverage() {
		int total = grade1 + grade2 + grade3;
		int average = total / 3;
		return average;
	}

	public static void main(String[] args) {
		ClassTask obj1 = new ClassTask("Ali", 80, 88, 90);
		System.out.println("Student " + obj1.name + " avarage grade is " + obj1.gradeAverage());
		
		ClassTask obj2 = new ClassTask("Ahmet", 85, 78, 90);
		System.out.println("Student " + obj2.name + " avarage grade is " + obj2.gradeAverage());
		
		ClassTask obj3 = new ClassTask("Abdullah", 90, 82, 95);
		System.out.println("Student " + obj3.name + " avarage grade is " + obj3.gradeAverage());
	}
	
}
