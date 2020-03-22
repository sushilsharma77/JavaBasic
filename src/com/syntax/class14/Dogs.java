package com.syntax.class14;

public class Dogs {
 //Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador
 //with specific attributes and behaviors.
	String color;
	String height;
	int age;
	char gender;
	public static void main(String[] args) {
		Dogs Husky= new Dogs();
		Husky.color="black";
		Husky.height="4.5";
		Husky.age=4;
		Husky.gender='M';
		
		Husky.bark();
		Husky.movesTail();
		Husky.run();
		
		Dogs Bulldog= new Dogs();
		Bulldog.color="White";
		Bulldog.height="4.9";
		Bulldog.age=4;
		Bulldog.gender='F';
		
		Bulldog.bark();
		Bulldog.movesTail();
		Bulldog.run();
		
		Dogs Labrador= new Dogs();
		Labrador.color="Red";
		Labrador.height="5";
		Labrador.age=3;
		Labrador.gender='F';
		
		Labrador.bark();
		Labrador.movesTail();
		Labrador.run();
		
		}
	
	void bark() {
		System.out.println("barks alot");
	}
	void movesTail() {
		System.out.println("Moves tail when happy");
	}
	void run() {
		System.out.println("runs to fast");
	}
}
