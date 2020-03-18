package com.homepractice;

public class Array {

	public static void main(String[] args) {
		int[] number;
		number = new int[5];

		number[0] = 10;
		number[1] = 11;
		number[2] = 12;
		number[3] = 13;
		number[4] = 14;
		System.out.println(number[4]);
		System.out.println("-----------------");
		
		
		String[]name=new String[2];
		
		name[0]="Sushil";
		name[1]="Puspa";
		
		System.out.println(name[1]+" is wife of "+name[0]);
		System.out.println("----------------------------------");
		
		int[]value= {10,12,14,16,18};
		System.out.println(value[4]);
		
		System.out.println("-----------------------------------");
				
		double[]value1=new double[2];
		
		value[0]=1;
		value[1]=2;
		System.out.println(value[0]);
		System.out.println("-----------------------------------------");
		int[]value2= {2,3,4};
		System.out.println(value2[0]);

	}

}
