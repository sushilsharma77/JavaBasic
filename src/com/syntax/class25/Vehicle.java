package com.syntax.class25;

public abstract class Vehicle {
	static int totalVehicles;
	String color;

	Vehicle(String color) {
		this.color = color;
		totalVehicles++;
	}

	public static void total() {
		System.out.println("we build" + totalVehicles);
	}

	public void drive() {
		System.out.println("Vehicle drives");
	}

	protected void stop() {
		System.out.println("Vehicle stops");
	}

	abstract void start();
	
	//abstract void start(String help);

	protected abstract void brake();
}

class Bus extends Vehicle{
	
	Bus(String color) {
		super(color);
	}
	
	@Override
	public void brake() {
		System.out.println("bus should barke at red light camera");
	}
	
	@Override
	void start() {
		System.out.println("Bus can drive fast");
	}
}

abstract class cars extends Vehicle {
	

	String carsType;

	cars(String color, String carsType) {
		super(color);
		this.carsType = carsType;
	}

	public void brake() {
		System.out.println(carsType + " have brakes");
	}
}

class Tesla extends cars {

	String make;

	Tesla(String color, String carsType, String make) {
		super(color, carsType);
		this.make = make;
	}

	public void drive() {
		System.out.println(make + " drives on autopilot");
	}

	@Override
	public void start() {
		System.out.println(make + " starts remotely");
	}

	public void display() {
		System.out.println("We have " + color + " " + make + " " + carsType);
	}
}

class Toyota extends cars {

	String make;

	Toyota(String color, String carsType, String make) {
		super(color, carsType);
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println(make + "starts keyless");
	}
}
