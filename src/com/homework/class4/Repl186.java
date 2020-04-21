package com.homework.class4;
import java.util.LinkedList;
public class Repl186 {
public static void main(String[] args) {
		
		LinkedList<Integer>llist=new LinkedList<>();
		
		  for (int i = 2; i <= 100; i++) {
			  if(isPrime(i)) {
				  llist.add(i);
			  }
			 
		  }
			 System.out.println(llist);
		
	   }
	public static boolean isPrime(int number) {
		for(int i=2;i<number;i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true  ;
	}
}
