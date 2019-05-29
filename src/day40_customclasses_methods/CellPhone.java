package day40_customclasses_methods;

// this is a custom class with its attributes and custom methods
public class CellPhone {
	
	//attributes/data/instance variables
	//variables are created within the class are called instance variables/object 
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println("Calling...");
	}
	public void message() {
		System.out.println("Sending txt message...");
	}
	public void takeAPhoto() {
		System.out.println("Taking a photo...");
	}

}
