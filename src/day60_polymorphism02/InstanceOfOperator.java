package day60_polymorphism02;

import day59_polymorphism01.*;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Shape shape = new Square();
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());

		if (shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It's a Triangle!");
		} else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It's a Circle!");
		} else if (shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It's a Square!");
		}

		// same check using instanceof operator
		System.out.println("=================");
		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);

		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Object);
		System.out.println("=================");
		if (shape instanceof Square) {
			System.out.println("It's a Square!");
			shape.draw();

		} else if (shape instanceof Circle) {
			System.out.println("It's a Circle!");
			shape.draw();

		} else if (shape instanceof Triangle) {
			System.out.println("It's a Triangle!");
			shape.draw();
		}
		
		Shape[] shapes = { new Triangle(), new Circle(), new Circle(), new Triangle(), new Square(), new Circle() };
		
		int circles = 0, squares = 0, triangles = 0;
		
		//using for each loop to find our number of each
		
		for (Shape shp : shapes) {
			
			if (shp instanceof Square) {
				squares++;

			} else if (shp instanceof Circle) {
				circles++;

			} else if (shp instanceof Triangle) {
				triangles++;
			}			
		}
		System.out.println("Count of "+squares +"\nCount of "+circles+"\nCount of "+triangles);

	}

}
