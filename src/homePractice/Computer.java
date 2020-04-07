package homePractice;

public class Computer {
	String brand;

	public Computer(String brand) {
		this.brand = brand;
	}

	void run() {
		System.out.println(brand + " computer can run the sysytem");
	}

	void save() {
		System.out.println(brand + " computer save input");
	}

	void transfer() {
		System.out.println(brand + " computer transfer data");
	}

	void store() {
		System.out.println(brand + " computer store data");
	}
}

class Apple extends Computer {
	public Apple(String brand) {
		super(brand);
	}

	void run() {
		System.out.println(brand + " computer can run the sysytem faster");
	}

	void save() {
		System.out.println(brand + " computer save input in different way");
	}

	void transfer() {
		super.transfer();
	}

	void safe() {
		System.out.println(brand + " computer is safe");
	}

}

class Lenovo extends Computer {
	public Lenovo(String brand) {
		super(brand);
	}

	void run() {
		super.run();
	}

	void transfer() {
		super.transfer();
	}
}

class HP extends Computer {
	public HP(String brand) {
		super(brand);
	}
}
