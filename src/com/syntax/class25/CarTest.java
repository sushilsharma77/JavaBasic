package com.syntax.class25;

public class CarTest {

	public static void main(String[] args) {
		Car car=new Seden(21,20000);
		System.out.println(car.calculateSalePrice());
		
		Car truck=new Truck(2100,40000);
		System.out.println(truck.calculateSalePrice());

	}

}
