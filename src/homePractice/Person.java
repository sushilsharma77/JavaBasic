package homePractice;

public class Person {
	String name;
	String lastName;
	int age;
}
 class Employee extends Person{
	 int salary;
	 void em(){
		 System.out.println("Joe"+" "+"Smith"+" "+35+" "+35000);
	 }
 }
 class Student extends Person{
	 int grade;
	 void em1(){
		 System.out.println("Adam"+" "+"Smith"+" "+15+" "+10);
	 }
 }
 class Retire extends Person {
	 String seniorActivity;
	 void em2(){
		 System.out.println("Frank "+" Smith "+15+" tour");
	 }
 }
