package com.homework.class4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repl189 {

	public static void main(String[] args) {
		Set <Integer> sett=new HashSet<>();
		sett.add(111);
		sett.add(111);
		sett.add(111);
		sett.add(999);
		sett.add(999);
		sett.add(999);
		
		for(int i:sett) {
			
			System.out.println(i);
		}
		System.out.println("-----------next way-------------------------");
		Iterator<Integer>it=sett.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
