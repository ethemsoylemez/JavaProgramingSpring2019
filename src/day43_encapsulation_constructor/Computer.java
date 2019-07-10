package day43_encapsulation_constructor;

public class Computer {

	private String brand;
	private String os;
	private double price;

	//constructor with no-params
	public Computer() {
		System.out.println("Computor constructor ...");
		brand = "unknown";
		os = "unknown";
	}
	
	// add a constructor. by using constructor we don't even need setter method
	public Computer(String brand, String os, double price) {
		this();
		//System.out.println("Computor constructor ...");
		this.brand = brand;
		this.os = os;
		this.price = price;
	}

	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}

	// we can automatically create getter and setter right click ==> source ==>
	// generate getter and setter

//	public String getBrand() {
//		return brand;
//	}
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//
//	public String getOs() {
//		return os;
//	}
//
//
//	public void setOs(String os) {
//		this.os = os;
//	}
//
//
//	public double getPrice() {
//		return price;
//	}
//
//
//	public void setPrice(double price) {
//		this.price = price;
//	}

//
	
	//setter WRITE getter READ
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getOs() {
		return os;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

}
