package com.homework.class4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl197 {

	public static void main(String[] args) {
		Map<String,String>entry=new LinkedHashMap<>();
		entry.put("Street", "Patrick ST");
		entry.put("Suite", "265");
		entry.put("City", "Vienna");
		entry.put("Zip", "22180");
		entry.put("Country", "United State");
		Collection<String>value=entry.values();
		for(String v:value) {
			System.out.println(v);
		}
		System.out.println();
		Iterator<String>it=value.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
