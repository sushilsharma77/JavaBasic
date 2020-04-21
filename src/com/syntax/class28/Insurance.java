package com.syntax.class28;

public abstract class Insurance {
	String insuranceName;

	public abstract void getQuote();

	public abstract void cancelInsurance();

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

}

class Car extends Insurance {
	String carModel;

	public Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel = carModel;
	}

	public void getQuote() {
		System.out.println(carModel + " has $1000 for six month in " + insuranceName);
	}

	public void cancelInsurance() {
		System.out.println("You can cancel your " + insuranceName + " anytime");
	}
}

class Pet extends Insurance {
	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println(petType + " has $100 for six month in " + insuranceName);

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your " + petType + " " + insuranceName + " anytime");

	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " has a good health insurance plan");

	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " charge you 10% cancelation feeCar");

	}

}