package com.homework.class4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Repl198 {

	public static void main(String[] args) {
		Map<String,String>map=new TreeMap<>();
		map.put("1 item", "apple");
		map.put("2 item", "banana");
		map.put("3 item", "pear");
		map.put("4 item", "tomato");
		map.put("5 item", "mango");
		map.put("6 item", "kiwi");
		
		Set<String>set=map.keySet();
		for(String key:set) {
			System.out.println("Key is "+key+" and values is "+map.get(key));
		}
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str+":"+map.get(str));
		}

	}

}
