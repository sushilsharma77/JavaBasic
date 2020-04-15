package com.homework.class4;

import java.util.ArrayList;
import java.util.Scanner;

public class Repl182 {

	public static void main(String[] args) {
		ArrayList <Integer>numbers=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		

	}

}
