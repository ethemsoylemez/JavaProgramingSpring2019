package day55_abstraction;

import static java.lang.Math.*;

//5,Create Circle Concrete class of Shape
//5.1,create no arg constructor and call super class's one arg constructor. for Circle add 1 arg to set radius,
//6,In Circle class add radius field. and use this field to calculate your area in your calculate are method
//7,in Triangle class add leng1,leng2,leng3 and calculate your area according to the each side of triangle.

public class Circle extends Shape {
	double radius;

	public Circle() {
		super("Circle");
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	//abstract method implementation
	@Override
	public double calculateArea() {
		return PI*pow(radius, 2);
	}

	//abstract method implementation
	@Override
	public void draw() {
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	}
}
