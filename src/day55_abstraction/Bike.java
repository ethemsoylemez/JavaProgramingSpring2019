package day55_abstraction;

public class Bike extends Vehicle {

	public Bike(int wheels, double price) {
		super(wheels, price, "Bcycle", "human power");

	}

	
	// abstract method implementation 
	@Override
	public void move() {
		System.out.println("Cycling");
	}
}
