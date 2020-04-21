package com.syntax.class27;
//create food class that will have 3 undefined methods and it will have 4 subclasses;
//create a collection of food and using 3 ways execute methods
 
public abstract class Food {
	String foodName;
	public abstract void foodType();
	public abstract void isHealthy();
	public abstract void isExpensive();
	
	public Food(String foodName) {
		this.foodName=foodName;
	}

}
class Appitizer extends Food{

	public Appitizer(String foodName) {
		super(foodName);
		
	}

	@Override
	public void foodType() {
		System.out.println("we can have light dish as "+foodName);
		
	}

	@Override
	public void isHealthy() {
		System.out.println(foodName+" Should be healthy");
		
	}

	@Override
	public void isExpensive() {
		System.out.println(foodName+" Shouldn't be much expensive");
		
	}
	
}
class Drink extends Food{

	public Drink(String foodName) {
		super(foodName);
		
	}

	@Override
	public void foodType() {
		System.out.println(foodName+" can be alchoholic or non-alchoholic");
		
	}

	@Override
	public void isHealthy() {
		System.out.println("soda are not good for health");
		
	}

	@Override
	public void isExpensive() {
		System.out.println("Depends on kind of "+foodName);
		
	}
	
}
class Dinner extends Food{

	public Dinner(String foodName) {
		super(foodName);
		
	}

	@Override
	public void foodType() {
		System.out.println("You can have veg or non-veg food as "+foodName);
		
	}

	@Override
	public void isHealthy() {
		System.out.println(foodName+ " must be healthy");
		
	}

	@Override
	public void isExpensive() {
		System.out.println("Must people do not spend that much for their "+foodName);
		
	}
	
}
class Desert extends Food{

	public Desert(String foodName) {
		super(foodName);
		
	}

	@Override
	public void foodType() {
		System.out.println("Sweets are " +foodName);
		
	}

	@Override
	public void isHealthy() {
		System.out.println("Having little "+foodName+ " sweet is good for health");
		
	}

	@Override
	public void isExpensive() {
		System.out.println(foodName+" are not expensive");
	}
	
}
