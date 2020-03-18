package com.syntax.class04;
import java.util.Scanner;
public class ExampleofScanner {
public static void main(String[] args) {
	String address="7671 Staunton cir Manassas VA";
	Scanner scan=new Scanner(System.in);
	System.out.println("Where is your address");
	String add=scan.nextLine();
	System.out.println(address);
		
	}

}
