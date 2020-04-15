package com.homework3;

public class AnimalTest {

	public static void main(String[] args) {
		Cat obj=new Cat("Cat");
		Kitten1 obj1=new Kitten1("kitten1");
		Kitten2 obj2=new Kitten2("kitten2");
		Kitten3 obj3=new Kitten3("kitten3");
		
		Animal [] animal= {obj,obj1,obj2,obj3};
		for(Animal a:animal) {
			a.eat();
			a.sleep();
			
		}
		

	}

}
