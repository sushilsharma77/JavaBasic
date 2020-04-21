package com.homework.class4;

import java.util.*;

public class Repl184 {

	public static void main(String[] args) {
		List<Integer>l=new LinkedList<>();
LinkedList<Integer>llist=new LinkedList<>();
		
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < 10; i++) {
			llist.add(a);
			c = a + b;
			a = b;
			b = c;
		}
		Iterator<Integer>ll=llist.iterator();
		while(ll.hasNext()){
			int l1=ll.next();
			System.out.print(l1+" ");
				
			}

	}

}
