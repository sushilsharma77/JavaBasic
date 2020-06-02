package com.homework.class4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl202 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		Set<Entry<String, String>> pair = map.entrySet();
		System.out.println("HashMap Before Remove :");
		for (Entry<String, String> keyValue : pair) {

			System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
		}
		System.out.println("----------------------");
		map.remove("ONE");
		map.remove("FOUR");
		System.out.println("HashMap After Remove :");
		for (Entry<String, String> keyValue : pair) {

			System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
		}

	}

}
