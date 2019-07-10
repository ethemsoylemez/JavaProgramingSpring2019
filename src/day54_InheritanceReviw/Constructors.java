package day54_InheritanceReviw;

class example1 {

	public example1() {
		// TODO Auto-generated constructor stub
	}

	public example1(int a) {

		System.out.println("Constructor 1");
	}

	public example1(boolean a) {
		 //example1(9); //reason: #6
		System.out.println("hello");
		// this(300); // reason: #9

	}

	public example1(float a) {

		 //this('y'); //reason: #7

	}

	public example1(char a) {
		this(20f);
		// this();
		methods();
	}

	public void methodE() {
		 //this(300); //reason: 5
	}

	public void methods() {
		methods();
	}

}

class example2 {

	private example2() {

	}
}

public class Constructors {

	/*
	 * Constructor: special method. belongs to the object.
	 * 
	 * 1. Every class MUST have constructor. (if there isn't any, compiler will give
	 * no-arg constructor by default)
	 * 
	 * 2. Constructor method cannot have return-type or specifiers.
	 * 		return-types: primitives, wrapper class, objects,... 
	 * 		specifiers: final, static, abstract
	 * 
	 * 3. Constructor' name MUST be same with the ClassName
	 * 
	 * 4. constructor' execution depends on the creation of the object
	 * 
	 * 5. constructor can only be called in other constructor. ( methods or blocks
	 * cannot call constructor)
	 * 
	 * 6. constructor cannot be called by constructor-name, MUST be called with this
	 * or super keyword 
	 * this(): calls the class' constructor 
	 * super(): calls the super class' constructor
	 * 
	 * 7. constructor cannot call or contain itself
	 * 
	 * 8. A constructor cannot call more than one constructor
	 * 
	 * 9. constructor' body constructor call needs to be at first step
	 * 
	 * 10. class' object MUST be created with existing and visible constructor(s)
	 * 
	 * 
	 * 11. super class' no-arg constructor is called in sub class' constructorS by
	 * default
	 * 
	 * 12. super class' constructor ( if there isn't default constructor) MUST be
	 * called in sub class (if there is more than one constructor in super class,
	 * only one of them needs to be called)
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("Hello");

		@SuppressWarnings("unused")
		example1 obj = new example1(9);

		// example2 obj2 = new example2(); reason: #10

	}
}
