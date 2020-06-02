package com.homework.class4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repl193 {

	public static void main(String[] args) {
		Set<String>set=new LinkedHashSet<>();
		set.add(null);
		set.add("Sohil");
		set.add("Diego");
		set.add("Alijon");
		set.add("Asel");
		set.add("Sumair");
		for(String s:set) {
			System.out.println(s);
		}
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			String el=it.next();
			System.out.println(el);
		}
		

	}

}
