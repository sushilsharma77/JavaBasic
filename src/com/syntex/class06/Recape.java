package com.syntex.class06;

import java.util.Scanner;

public class Recape {

	public static void main(String[] args) {
		/* if hour between1-11---morning
		 * if hour between12-15---afternoon
		 * if hour between 16-20---evening
		 * if hour is between 21-24---night
		
		 */
		Scanner scan;
		int time;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your time");
		time=scan.nextInt();
		
		if(time>=1&&time<=11) {
			System.out.println("This is morning");
		}else if(time>=12&&time<=15) {
			System.out.println("This is afternoon");
		}else if(time>=16&&time<=20) {
			System.out.println("This is evening");
		}else if(time>=21&&time<=24) {
			System.out.println("This is night");
		}else {
			System.out.println("This is unknown");
		}
		
		
					
		
		
		
		

	}

}
