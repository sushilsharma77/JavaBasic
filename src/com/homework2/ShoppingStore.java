package com.homework2;

public class ShoppingStore {
	String item;
	double price;
	int quantity;

	ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price; // Blanket Total Value 99.98
		this.quantity = quantity; // Mattress Total Value 439.18
	} // You purchased 539.16 Today

	public void itemTotalPrice() {
		System.out.println(item+" Total Value "+price);
		

	}
}
