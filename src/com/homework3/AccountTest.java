package com.homework3;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setAcc_no(7560504000l);
		acc.setName("Sumair");
		acc.setEmail("sumair@syntax.com");
		acc.setAmount(50000.0);
		
		System.out.print(acc.getAcc_no()+" "+acc.getName()+" "+
		acc.getEmail()+" "+acc.getAmount());
		
	}

}
