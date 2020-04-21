package com.syntax.class29;

import java.util.*;

public class Task2 {
	// Create a Set of cities in which you want to make sure that insertion order is
	// maintained.
	// Using Iterator remove any city that starts with “A”;
	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		cities.add("NewYork");
		cities.add("WashingtonDC");
		cities.add("Baltimor");
		cities.add("Maimi");
		cities.add("Austin");
		System.out.println(cities);

		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A"))
				it.remove();
			
		}
		System.out.println(cities);
	}

}
