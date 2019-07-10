package day55_abstraction;

public class ShapeGenerate {

	public static void main(String[] args) {

		Circle crl = new Circle(10);

		Triangle trl = new Triangle(12, 15, 25);
		
		//Shape shp = new Shape("Triangle"); can not create object of abstract class

		crl.draw();
		System.out.println("Circle area: " + crl.calculateArea());

		trl.draw();
		System.out.println("Triangle area: " + trl.calculateArea());

	}
}
