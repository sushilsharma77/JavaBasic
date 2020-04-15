package com.homework3;

public interface Outputs {
	static void display(double result) {

	}
}

interface Functions extends Outputs {
	double adding(double firstNumber, double secondNumber);

	double subtracting(double firstNumber, double secondNumber); 
	double multiplying(double firstNumber, double secondNumber);

	double dividing(double firstNumber, double secondNumber);

}
    class Imp implements Functions {

		@Override
		public double adding(double firstNumber, double secondNumber) {
			double add=firstNumber+secondNumber;
			System.out.println("Result is ::: "+add);
			return add;
		}

		@Override
		public double subtracting(double firstNumber, double secondNumber) {
			double subtract=firstNumber-secondNumber;
			System.out.println("Result is ::: "+subtract);
			return subtract;
		}

		@Override
		public double multiplying(double firstNumber, double secondNumber) {
			double multiply=firstNumber*secondNumber;
			System.out.println("Result is ::: "+multiply);
			return multiply;
		}

		@Override
		public double dividing(double firstNumber, double secondNumber) {
			double division=firstNumber/secondNumber;
			System.out.println("Result is ::: "+division);
			return division;
		}
    	
    }
