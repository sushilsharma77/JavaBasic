package com.homepractice;

public class ArrayLength {
	public static void main(String[] args) {
		String[] countries = { "Nepal", "China", "USA" };
		System.out.println(countries.length);
		System.out.println(countries[2] + " " + countries[0] + " " + countries[1]);
		System.out.println("My birth place is " + countries[0] + " recently, I am living in " + countries[2]);
		System.out.println("<---------Printing all array in one time----------------->");

		int[] price = new int[4];
		price[0] = 10;
		price[1] = 12;
		price[2] = 8;
		price[3] = 15;

		// System.out.println(price[0]);
		// System.out.println(price[1]);
		// System.out.println(price[2]);
		// System.out.println(price[3]);

		for (int i = 0; i < price.length; i++) {
			System.out.print(price[i] + " ");
		}

		System.out.println("<---for same purpose we can use advanced loop--->");

		String[] names = { "Bishnu", "Dharma", "Lok", "Sushil" };
		for (String name : names) {
			System.out.println(name);
		}

	}

}
