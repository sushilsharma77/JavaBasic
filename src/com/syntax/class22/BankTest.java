package com.syntax.class22;

public class BankTest {
	public static void main(String[] args) {
		
	Bank obj=new Bank(700);
	double interest=obj.value();
	System.out.println(interest);
	
	Visa obj1=new Visa(700);
	 interest=obj1.value();
	System.out.println(interest);
	
	AE obj2=new AE(700);
	 interest=obj.value();
	System.out.println(interest);
}

}
