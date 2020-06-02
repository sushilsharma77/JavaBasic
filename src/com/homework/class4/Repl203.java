package com.homework.class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl203 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		Set<Entry<String, String>> entry = map.entrySet();
		System.out.println("HashMap Before Replace :");
		Iterator<Entry<String, String>> it = entry.iterator();
		while (it.hasNext()) {
			Entry<String, String> keyValue = it.next();
			System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
		}
		System.out.println("-----------------");
		System.out.println("HashMap After Replace :");
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		Iterator<Entry<String, String>> it1 = entry.iterator();
		while (it1.hasNext()) {
			Entry<String, String> keyValue1 = it1.next();
			System.out.println(keyValue1.getKey() + " : " + keyValue1.getValue());
		}

	}

}
