package com.homework.class4;

import java.util.Set;
import java.util.TreeSet;

public class Repl192 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("India");
		set.add("Australia");
		set.add("South Africa");
		set.add("India");
		set.add("America");
		set.add("America");

		System.out.println(set);

	}

}
