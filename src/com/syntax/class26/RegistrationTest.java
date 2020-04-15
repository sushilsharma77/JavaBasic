package com.syntax.class26;

public class RegistrationTest {
public static void main(String[] args) {
	Registration reg=new Registration();
	reg.setEmail("hjas@yahoo.com");
	System.out.println(reg.getEmail()); 
	
	reg.setUserName("zdds");
	System.out.println(reg.getUserName());
	
	reg.setPassword("");
	System.out.println(reg.getPassword());
	
}
	
	
}
