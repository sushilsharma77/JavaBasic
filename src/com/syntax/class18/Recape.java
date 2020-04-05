package com.syntax.class18;
//Create a method that will accept an array as parameters
//and will return a sum of all elements from that array.
//Method should be visibly only within same package and 
//accessible by the creating an instance of the class.
public class Recape {
	protected int getSumOfArray(int[]array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	//Create a method that will take a String as a parameter and returns reverse String.
	//Method should be available to all classes within your projects and
	//accessible by class name.
	public static String getReverse(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i-- ) {
			reverse+=str.charAt(i);
		}
		
		return reverse;
	}
	//Create a method that will accept a String as a parameter
	//and return a new String that consist only of vowels.
	//Method should be available inside the class where
	//it was declared and executed by calling it is name.
	private static String getVowels(String str){
		String vowels="";
		vowels=str.replaceAll("[^aeiouAEIOU]", "");
		return vowels;
	}
	
	

	public static void main(String[] args) {
		Recape obj=new Recape();
		int[]array= {15,20,50,60};
		System.out.println(obj.getSumOfArray(array));
		
		System.out.println(getReverse("hello"));
		
		String vowels=getVowels("Good Morning!");
		System.out.println(vowels);
	}

}
