package com.homework.class4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl183 {
	//Create a Linked List that will store Integer Objects from 50-100.
	//Once Linked List is created remove all numbers that are not divisible by 3.
    //Print Linked List

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		for (int i= 50; i <=100; i++) {
			numbers.add(i);
			}
		System.out.println(numbers);
		
		Iterator<Integer>it=numbers.iterator();
		while(it.hasNext()) {
			if(!(it.next()%3==0)) {
				it.remove();
				
			}
		}
		System.out.println(numbers);

	}

}