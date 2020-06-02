package com.homework.class4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Repl201 {

	public static void main(String[] args) {
		Map<String, String>entry=new HashMap<>();
		entry.put("Street", "Patrick ST");
		entry.put("Suite", "265");
		entry.put("City", "Vienna");
		entry.put("Zip", "22180");
		entry.put("Country", "United States");
		Set<Entry<String,String>>en=entry.entrySet();
		for(Entry<String,String> get:en) {
			System.out.println(get.getValue().toUpperCase());
		}

	}

}
