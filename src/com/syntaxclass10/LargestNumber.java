package com.syntaxclass10;

public class LargestNumber {

	public static void main(String[] args) {
		int[]numbers= {10,50,500,2000,5000,100000,};
		int largest=0;
		for(int i:numbers) {
			if(i>largest) {
				largest=i;
			}
			
		}
		System.out.println(largest);
		System.out.println("____________next_____________________");
		
		double[]marks= {99.99,60.05,70.00,99.56,45.02};
		double largest1=0.00;
		for(double mark:marks) {
			if(mark>largest1) {
				largest1=mark;
			}
		}
		System.out.println(largest1);
		
	}

}
