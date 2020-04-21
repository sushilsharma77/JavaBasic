package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//Create a Set collection in which you need to add names of the countries.
//In this set we want all objects to be sorted in alphabetical order. 
//Using 2 different ways retrieve all elements from set.
public class Task1 {

	public static void main(String[] args) {
		TreeSet <String> set=new TreeSet<>();
		set.add("Nepal");
		set.add("USA");
		set.add("Canada");
		set.add("India");
		
		System.out.println(set);
		
		for(String countries:set) {
			System.out.println(countries);
		}
		Iterator<String>str= set.iterator();
		while(str.hasNext()) {
			String set1=str.next();
			 System.out.println(set1);
		}

		
	}

}
