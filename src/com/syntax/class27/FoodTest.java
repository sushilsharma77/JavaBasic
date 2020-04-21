package com.syntax.class27;

import java.util.ArrayList;

public class FoodTest {

	public static void main(String[] args) {
		Food obj=new Appitizer("Appitizer");
		obj.foodType();
		obj.isExpensive();
		obj.isHealthy();
		
		ArrayList <Food>foods=new ArrayList<>();
		
		for(Food f:foods) {
			f.foodType();
		}
		

	}

}
 