package com.homework;

public class Repl103 {
	String breed;
	String name;
	String color;

	void run() {
		System.out.println(color + " dog can run");
	}

	void play() {
		System.out.println(color + " dog can play");
	}

	void bark() {
		System.out.println(color + " dog can bark");
	}

	public static void main(String[] args) {
		Repl103 dog1 = new Repl103();
		dog1.breed = "Husky";
		dog1.name = "Doggy";
		dog1.color = "Black";

		dog1.run();
		dog1.play();
		dog1.bark();

		Repl103 dog2 = new Repl103();
		dog2.breed = "Bulldog";
		dog2.name = "Hemesh";
		dog2.color = "White";

		dog2.run();
		dog2.play();
		dog2.bark();

		Repl103 dog3 = new Repl103();
		dog3.breed = "Germanshephered";
		dog3.name = "Ramesh";
		dog3.color = "Dark";

		dog3.run();
		dog3.play();
		dog3.bark();

	}
}
