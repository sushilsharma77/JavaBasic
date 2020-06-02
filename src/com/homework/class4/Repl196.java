package com.homework.class4;

import java.util.HashMap;
import java.util.Map;

public class Repl196 {

	public static void main(String[] args) {
		Map<String,String>entry=new HashMap<>();
		entry.put("Street", "Patrick ST");
		entry.put("Suite", "265");
		entry.put("City", "Vienna");
		entry.put("Zip", "22180");
		entry.put("Country", "United State");
		
		int i=entry.size();
		System.out.println(i);
		entry.clear();
		System.out.println(entry.size());
		

	}

}
