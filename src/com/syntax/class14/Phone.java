package com.syntax.class14;

public class Phone {
//Create a Class “Phone”. Create 3 Objects of it:
//iPhone, Android, Nokia with specific  attributes and behaviors.
	String model;
	String color;
	double price;
	
	void text() {
		System.out.println(model+" send text");
	}void call(){
		System.out.println(model+" access for call");
	}
	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.model="iphone10";
		iPhone.color="Silver";
		iPhone.price=1000;
		
		iPhone.text();
		iPhone.call();
		
		Phone Android=new Phone();
		Android.model="Samsung11";
		Android.color="Black";
		Android.price=850;
		
		Android.text();
		Android.call();
		
		Phone Nokia=new Phone();
		Nokia.model="Nokia_ss";
		Nokia.color="Red";
		Nokia.price=570;
		
		Nokia.text();
		Nokia.call();
		
		
		
		
	}
}