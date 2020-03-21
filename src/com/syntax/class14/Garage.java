package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
		
	
	//build individual objects
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="Pink";
		
		Car car3=new Car();
		car3.make="123";
		car2.speed=200;
		
		//print bmw
		System.out.println(car2.make);
		//Accesing behaviour/method of Car with car1
		
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		//Accesing behaviour/method of Car with car2
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		
		
		
		//I drive pink BMW
		System.out.println("I drive "+car2.color+" "+car2.make);


	


	

	
	}
}
