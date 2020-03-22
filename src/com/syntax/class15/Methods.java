package com.syntax.class15;

public class Methods {
	//create a method that will say welcome 10 times
	void sayWelcome() {
		for(int i=0;i<10;i++) {
			System.out.println("Welcome");
		}
	}
	//creat method that will say any word #number of times
	
	void sayAnything(String word,int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(word);
		}
			
	}
	//create a method isItRaning 
	//thatn wiil accept boolean value as a parameter
	//and based on the value it wiil print messege accordingly
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("stay home and learn java");
		}else {
			System.out.println("go for a walk");
		}
		
	}
	
	

}
