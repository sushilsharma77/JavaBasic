package com.homework2;

public class CarObjects {
	String model;
	double price;
	int quantity;

	public CarObjects(String model, double price, int quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}
	public void CarStockValue() {
		double stuckValue=(price*quantity);
		System.out.println(model+" Stuck Value "+stuckValue);
	}
}
