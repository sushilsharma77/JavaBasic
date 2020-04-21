package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {
		List<Insurance>arr=new ArrayList<>();
		arr.add(new Car("BMW","Statefarm"));
		arr.add(new Pet("Dog","Farmer"));
		arr.add(new Health("Obama Care"));
		
		for(Insurance in:arr) {
			in.cancelInsurance();
			in.getQuote();
		}
		System.out.println("________________");
		for(int i=0; i<arr.size();i++) {
			Insurance a=arr.get(i);
			a.getQuote();
			a.cancelInsurance();
		}
		System.out.println("________________");
		Iterator<Insurance>it=arr.iterator();
		while(it.hasNext()){
			Insurance h=it.next();
			h.getQuote();
			h.cancelInsurance();
		}
		
	}
	
}
