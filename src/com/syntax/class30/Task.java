package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Task {
/*Create a map of countries with its capital that will store countries in alphabetical order.
 *Print all keys and values from a country map using for each loop and iterator.
 *Print all values from a country map using for each loop and iterator.
 */
	public static void main(String[] args) {
		Map<String,String> countries=new TreeMap<>();
		countries.put("Nepal","Kathmandu");
		countries.put("USA","Washington DC");
		countries.put("France","Paris");
		countries.put("China","Bejing");

		System.out.println(countries);
		Set<String>set=countries.keySet();
		for(String s:set) {
			System.out.println("Keys are:"+s);
		}
		System.out.println();
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			System.out.println("Keys are:"+it.next());
		}
		System.out.println();
		Collection<String>cl=countries.values();
		for(String c:cl) {
			System.out.println("Values are "+c);
		}
		System.out.println();
		Iterator<String>it1=cl.iterator();
		while(it1.hasNext()) {
			System.out.println("Values are "+it1.next());
		}
		System.out.println();
		//looping the entries
		Set<Entry<String,String>>coun=countries.entrySet();
		
		for(Entry<String,String>e:coun) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println();
		Iterator<Entry<String,String>>h=coun.iterator();
		while(h.hasNext()) {
			Entry<String,String>s=h.next();
			String k=s.getKey();
			String v=s.getValue();
			System.out.println(k+":"+v);
			
		}
		
		
	}

}
