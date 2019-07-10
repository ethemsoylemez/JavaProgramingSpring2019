package day59_polymorphism01;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape sp1 = new Shape();
		sp1.draw();
		
		Shape tr = new Triangle();
		tr.draw();
		
		Shape cr = new Circle();
		cr.draw();
		
		Shape sr = new Square();
		sr.draw();
	}

}
