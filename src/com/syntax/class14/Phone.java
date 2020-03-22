package com.syntax.class14;

public class Phone {
//Create a Class “Phone”. Create 3 Objects of it:
//iPhone, Android, Nokia with specific  attributes and behaviors.
	String model;
	String color;
	String capacity;

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.model = "iphone XI";
		iPhone.color = "silver";
		iPhone.capacity = "64gb";

		iPhone.ring();
		iPhone.text();
		iPhone.internet();

		Phone nokia = new Phone();
		nokia.model = "nokia2015";
		nokia.color = "black";
		nokia.capacity = "28gb";

		nokia.ring();
		nokia.text();
		nokia.internet();

		Phone android = new Phone();
		android.model = "Samsung S10";
		android.color = "Gray";
		android.capacity = "56gb";

		android.ring();
		android.text();
		android.internet();

	}

	void ring() {
		System.out.println(model + " rings");
	}

	void text() {
		System.out.println(model + " send the text");
	}

	void internet() {
		System.out.println(model + " has access of internet");
	}

}
