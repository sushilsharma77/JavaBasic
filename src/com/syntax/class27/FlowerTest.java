package com.syntax.class27;
import java.util.*;


public class FlowerTest {

	public static void main(String[] args) {
		
		// store flowers into array
		Flower [] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};

		//store flowers into arraylist
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("Rose");cannot add String Object into ArrayList of Flower Objects
		//1. hw to call available methods using: for loop, advanced for loop, iterator
		
	
	}
}

