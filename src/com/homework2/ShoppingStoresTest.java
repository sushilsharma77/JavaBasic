package com.homework2;

public class ShoppingStoresTest {

	public static void main(String[] args) {
		ShoppingStore obj=new ShoppingStore("Blanket",99.98,1);
		obj.itemTotalPrice();
		
		ShoppingStore obj1=new ShoppingStore("Mattress",439.18,1);
		obj1.itemTotalPrice();
		
		System.out.println("You purchased 539.16 Today");

	}

}
