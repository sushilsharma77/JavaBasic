package com.homework2;

public class Car {
String make,model;
int numberOfDoors,topSpeed;
double price;

public Car(String str,String str1, int a, int b,double dbl) {
	
}
public Car(String str,String str1,int b,double dbl) {
	
}
public Car( int a, int b,double dbl) {
	
}
public Car(String str,String str1, int a) {
	
}
public void display() {
	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
}

}
class Test11{
	public static void main(String[] args) {
		Car obj=new Car("Toyota","Prius",4,120,30000);
		obj.make="Toyota";
		obj.model="prius";
		obj.numberOfDoors=4;
		obj.topSpeed=120;
		obj.price=30000;
		obj.display();
		
		Car obj1=new Car("Toyota","Prius",120,30000);
		obj1.make="Toyota";
		obj1.model="prius";
		obj1.numberOfDoors=4;
		obj1.topSpeed=120;
		obj1.price=30000;
		obj1.display();
		
		Car obj2=new Car(4,120,30000);
		obj2.make="unknown";
		obj2.model="unknown";
		obj2.numberOfDoors=4;
		obj2.topSpeed=120;
		obj2.price=30000;
		obj2.display();
		
		Car obj3=new Car("Toyota","Prius",4);
		obj3.make="Toyota";
		obj3.model="Prius";
		obj3.numberOfDoors=4;
		obj3.topSpeed=90;
		obj.price=0;
		obj3.display();
		
		
		
	}
}
