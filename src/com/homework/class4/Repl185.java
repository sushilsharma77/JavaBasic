package com.homework.class4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Repl185 {
	public static void main(String[] args) {
		List <Boolean>listA=new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		List <Boolean>listB=new ArrayList<>();
		listB.addAll(listA);
		Iterator<Boolean> it=listB.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
}
