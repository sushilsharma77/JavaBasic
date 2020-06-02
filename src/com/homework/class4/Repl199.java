package com.homework.class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Repl199 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		map.put("mango", 40);    
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("Key = "+key+" and value ="+map.get(key));
		}

	}

}
