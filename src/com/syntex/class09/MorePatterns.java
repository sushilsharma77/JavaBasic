package com.syntex.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1; i<5; i++) {
    	 for(int j=1; j<=5;j++) {
    		 System.out.print(j);
    	 }
    	 System.out.println();
    	 
     }
     System.out.println("------------");
     
     
     for(int i=1; i<=5; i++) {
    	 for(int j=1; j<=5;j++) {
    		 System.out.print(i);
    	 }
    	 System.out.println();
     
	}
     System.out.println("--Printing 5 rows of 1-9");
     
     for (int k = 1; k <=5; k++) {
         for (int l = 1; l <=9; l++) {
             System.out.print(l);
         }
         System.out.println();
     }
     System.out.println("--------");
     
     for (int i =1 ; i <=5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
	}
     System.out.println("--------");
     for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
			System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
