package day60_polymorphism02;

import java.util.*;

//import day59_polymorphism01.Shape;
//import day59_polymorphism01.Triangle;
import day59_polymorphism01.*;

public class ShapesArray {

	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.draw(); // overridden version of draw is called

		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };

		Shape[] shapes2 = new Shape[3];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();

		shapes2[0].draw();
		shapes2[2].draw();

		System.out.println("#### FOR EACH LOOP ####");

		for (Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}

		// create a list of Shapes and add 5 different child objects

		List<Shape> shapesList = new ArrayList<>();
		//ArrayList<Shape> shapeArrayList = new ArrayList<>();
		shapesList.add(new Triangle());
		Shape newShape = new Square();
		shapesList.add(newShape);
		shapesList.add(new Circle());
		shapesList.add(new Triangle());
		shapesList.add(new Circle());

		// draw first shape
		shapesList.get(0).draw();
		Shape someShape = shapesList.get(1);
		someShape.draw();

		System.out.println("#### FOR EACH WITH LIST OF SHAPES ####");
		for (Shape shapeItem : shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
		}

		for (int i = 0; i < shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
			shapesList.get(i).draw();

		}

		}
}
