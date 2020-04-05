package com.homework2;

public class Parent {
	Parent(String city){
		System.out.println(city);
	}
	Parent(){
		System.out.println("Parent constructor");
	}

}
class Child extends Parent{
	Child(String city){
		super(city);
		
	}
}
