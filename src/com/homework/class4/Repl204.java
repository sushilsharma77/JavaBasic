package com.homework.class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl204 {
	
 public static void main(String[] args) {
		Map <String,Integer>map=new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		
		Set<Entry<String,Integer>>set=map.entrySet();
		for(Entry<String,Integer>en:set) {
			System.out.println(en.getKey()+":"+en.getValue());
		}
		map.clear();
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}
		
		


	}


}
