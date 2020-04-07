package com.homework2;

public class Repl148 {
	Repl148(){
		System.out.println("Parent Constructor without argument");
	}
	Repl148(int number){
		System.out.println(number);
		}
}
class Sub extends Repl148{
	
	Sub(){
		System.out.println("Child Constructor without argument");
	}
	Sub(int number){
		super(number);
		
	}
	
}

	
	
	


