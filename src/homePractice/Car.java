package homePractice;

public class Car {
	String make, model;
	int numberOfDoors, topSpeed;
	double price;

	public Car(String str, String str1, int a, int b, double dbl) {
		System.out.println(str+" "+str1+" "+a+" "+b+" "+dbl);

	}

	public Car(String str, String str1, int b, double dbl) {
		System.out.println(str);
	}

	public Car(int a, int b, double dbl) {
		make = "unknown";
		model = "unknown";
	}

	public Car(String str, String str1, int a) {
		topSpeed = 90;
		price = 0;
	}

	public void Car() {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}

}
class CarTest{
	public static void main(String[] args) {
		
	Car obj	=new Car("Toyota","Prius",4,120,30000);
	obj.Car();
	}
	
}
