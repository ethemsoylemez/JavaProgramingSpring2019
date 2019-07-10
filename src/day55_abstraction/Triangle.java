package day55_abstraction;

//5,Create Triangle Concrete class of Shape
//5.1,create no arg constructor and call super class's one arg constructor
//Trial 3 args set length

public class Triangle extends Shape{
	double length1;
	double length2;
	double length3;

	public Triangle() {
		super("Triangle");
	}
	
	public Triangle(double length1, double length2, double length3) {
		super("Triangle");
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;	
	}

	//abstract method implementation
	@Override
	public double calculateArea() {
		double p = (length1 + length2 + length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
	}

	//abstract method implementation
	@Override
	public void draw() {
		
		System.out.println(	"     *\n" + 
							"    ***\n" + 
							"   *****\n" + 
							"  *******\n" + 
							" *********");
	}
}
