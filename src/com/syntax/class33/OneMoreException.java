package com.syntax.class33;

public class OneMoreException {

	public static void main(String[] args) {
		int i=20;
		int m=50;
		int k=0;
		try {
		int function=(i+m)/k;
		System.out.println(function);
		
		}catch (ArithmeticException e){
			System.out.println("Exception occured");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("end of this program");
		}
		

	}

}
