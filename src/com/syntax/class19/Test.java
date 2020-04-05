package com.syntax.class19;

public class Test {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		//access variables from own class
		dog.breed="Husky";
		//access variables from parent class
		dog.color="Gray";
		dog.fur="To much";
		dog.size="Big";
		
		//access variables from own class
		dog.bark();
		//access variables from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		//can access only features define within it
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		
		
	}

}
