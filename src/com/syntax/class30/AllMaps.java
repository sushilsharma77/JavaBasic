package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		//lets create a grocery map (item, quantity)in which we do not care about the order
		Map<String,Integer>grocery=new HashMap<>();
		grocery.put("banana", 10);
		grocery.put("apple", 12);
		grocery.put("bread", 2);
		grocery.put("cheese", 3);
		grocery.put("milk", 2);
		System.out.println(grocery);
		
		//create a map of items to buy (item, quantity) in which we want save the order
		Map<String,Integer>items=new LinkedHashMap<>();
		items.put("lysol", 4);
		items.put("sanitizer",10);
		items.put("paper towel", 24);
		items.put("toilet paper", 24);
		items.put("face mask", 8);
	
		//create a map in which we store all previous items in ascending order
		Map<String,Integer>groceries=new TreeMap<>();
		groceries.putAll(grocery);
		groceries.putAll(items);
		System.out.println(groceries);
		
		//get all keys using loop
		
		for(String str:groceries.keySet()) {
			System.out.println(str);
		}
		 //get all keys using iterator
		Iterator<String>it=groceries.keySet().iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		//get all values using loop
		 for(int value:groceries.values()) {
		 System.out.println(value);
		 }
		
		//get all values using iterator
		 Iterator<Integer>its=groceries.values().iterator();
		 while(its.hasNext()) {
			int i= its.next();
			System.out.println(i);
		 }
		
		
	}
}