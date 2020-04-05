package com.homework2;

public class Dog {
	 String dogName;
	  double dogWeight;
	  static String dogBreed="Mutt";
	  
	  Dog(String dogName, double dogWeight){
	    dogName=dogName;
	    dogWeight=dogWeight;
	    }
	  void display() {
		  System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		  
	  }

}
