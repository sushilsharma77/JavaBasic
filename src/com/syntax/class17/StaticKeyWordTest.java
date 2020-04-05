package com.syntax.class17;

public class StaticKeyWordTest {
	public static void main(String[] args) {
		//access static members of another class
		StaticKeyWord.brand="Android";
		StaticKeyWord.touchScreen=true;
		StaticKeyWord.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyWord sk=new StaticKeyWord();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		StaticKeyWord sk1=new StaticKeyWord();
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyWord sk2=new StaticKeyWord();
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="Nokia";// brand will change for all instances
		
		//not the right way access static method
		sk2.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk.displayGeneralInfo();
		
		
		
	}

}
