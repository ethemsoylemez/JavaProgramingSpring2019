package day55_abstraction;


//1,Create a Shape abstract class
//2,create instance fields name, area;
//3,create 2 abstract method as below : calculateArea() return double, no arg draw() void
//4,create one constructor that set name-value

public abstract class Shape {
	
	String name;
	double are;
	
	//Constructor 
	public Shape(String name) {
		this.name = name;
	}
	
	
	//abstract methods
	public abstract double calculateArea();
	
	public abstract void draw();
}
