package com.homework2;

public class StoreProduct {
	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;

	public StoreProduct(String str, double dbl, String category, boolean bln, int a) {

	}

	public StoreProduct(String str, double dbl, int a) {
		category = "Misc";
		hasExpiration = false;
	}

	public StoreProduct(String str, double dbl) {
		stock = 0;
	}
	public void display() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
}
