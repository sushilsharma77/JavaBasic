package com.homework.class4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Repl188 {
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(countries);
	}

}
