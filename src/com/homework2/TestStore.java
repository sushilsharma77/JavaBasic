package com.homework2;

public class TestStore {
	//Eggs 3.0 Produce true 10
	//Paper Towels 2.0 misc false 24
	//Paper Towels 2.0 null false 0

	public static void main(String[] args) {
		StoreProduct obj=new StoreProduct("Egg", 3,"Produce",true,10);
		obj.label="Egg";
		obj.price=3;
		obj.category="Produce";
		obj.hasExpiration=true;
		obj.stock=10;
		obj.display();
		
		StoreProduct obj1=new StoreProduct("Paper Towel",2,24);
		obj1.label="Paper Towel";
		obj1.price=2;
		obj1.stock=24;
		obj1.display();
		
		StoreProduct obj2=new StoreProduct("Paper Towel",2);
		obj2.label="Paper Towel";
		obj2.price=2;
		
		obj2.display();
	}

}
