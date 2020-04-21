package com.homework.class4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl187 {

	public static void main(String[] args) {
		List<Integer>lis=new LinkedList<>();
		lis.add(111);
		lis.add(222);
		lis.add(333);
		lis.add(444);
		lis.add(555);
		lis.add(666);
		
		Iterator<Integer> it=lis.iterator();
		int sum=0;
		while(it.hasNext()) {
			int num=it.next();
			sum+=num;
		}
		System.out.println(sum);

	}

}
