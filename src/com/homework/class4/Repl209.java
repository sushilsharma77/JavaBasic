package com.homework.class4;


class Repl209 {
	public static void main(String[] args) {
		try{
			tempCheck(25);
		}catch(RuntimeException re) {
			System.out.println(re);
		}
		
	
	}
	public static void tempCheck(int temp) {
		if (temp < 32) {
		throw new RuntimeException("It is freezing");
		} else {
			System.out.println("Its not freezing");
		}
	}
}