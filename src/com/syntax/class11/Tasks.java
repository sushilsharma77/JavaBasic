package com.syntax.class11;

public class Tasks {

	public static void main(String[] args) {
		// create an array of cars : american, german, korean, italian. Then retrieve all
		// values from that array using 2 different loops
		String[][]cars= {
				{"ford","Mustang","Cheverolette"},
				{"Audi","BMW","Volkswagen"},
				{"Kia","Hundai","GM"},
				{"Ferrari","Fiat"},
			};
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("______2ndWay_________________");
		for(String[]countries:cars) {
			for(String brands:countries) {
				System.out.println(brands+" ");
			}
			System.out.println();
		}

	}

}
