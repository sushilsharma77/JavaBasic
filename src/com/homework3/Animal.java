package com.homework3;

public class Animal {
	String type;
	public Animal(String type){
		this.type=type;
	}
	public void eat() {
		System.out.println("Animals eats");
	}
	public void sleep() {
		System.out.println("Animals sleep");
	}

}
class Cat extends Animal{

	public Cat(String type) {
		super(type);
		}
	public void eat() {
		System.out.println(type+" eat");
	}
	public void sleep() {
		System.out.println(type+" sleeps a lot");
	}
	
}
class Kitten1 extends Cat{

	public Kitten1(String type) {
		super(type);
		
	}
	public void eat() {
		System.out.println(type+" eats milk");
	}
}
class Kitten2 extends Cat{

	public Kitten2(String type) {
		super(type);
		
	}
	public void eat() {
		System.out.println(type+" eats snacks");
	}
}
class Kitten3 extends Cat{

	public Kitten3(String type) {
		super(type);
		
	}
	public void eat() {
		System.out.println(type+" eats everything");
	}
}

