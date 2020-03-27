package com.syntax.class15;

public class Task4 {
	void sayHello(String countryName) {
		switch (countryName.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privot");
			break;
		case "mexico":
			System.out.println("Hola");
			break;
		default:
			System.out.println("invalid word");
			
				}
		}

	public static void main(String[] args) {
		Task4 obj=new Task4();
		obj.sayHello("USA");

	}

}
