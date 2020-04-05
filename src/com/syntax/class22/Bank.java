package com.syntax.class22;

public class Bank {
	double balance;
	double interest;
	public Bank(double balance){
		this.balance=balance;
	}
	
  double value() {
		if(balance<1000) {
			interest=balance*0.1;
		}else {
			interest=0;
		}
		return interest;
	}

}

 class Visa extends Bank{
	 public Visa(double balance) {
		 super(balance);
	 }
	 double value() {
		 if(balance<1000) {
				interest=balance*0.2;
			}else {
				interest=0;
			}
			return interest;	 
	 }
 }
 
 class AE extends Bank{
	 AE(double balance){
		 super(balance);
	 }
	 
	 
 }
