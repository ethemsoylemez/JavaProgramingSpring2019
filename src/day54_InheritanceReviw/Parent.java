package day54_InheritanceReviw;

public class Parent {

	static int num1; // class variable, ,belongs to the class, inheritable
	int num2; // instance variable, inheritable

	public void method1() { // instance method, inheritable

	}

	public static void method2() { // static method, inheritable
		System.out.println("Method2");
	}

	Parent() { // constructor , cannot be inherited
		System.out.println("Constructor");
	}

	static { // belongs to the class, inheritable
		System.out.println("Static block");
	}

	{ // belongs to the object, inheritable
		System.out.println("Intance block");
	}

	@SuppressWarnings("unused")
	private void methodB() { // private is not inheritable, cannot be visible outside the class.

	}

	/*
	 * features that cannot be inherited: 
	 * 1. constructor 
	 * 2. features that are not visible: 
	 *      1. private AM. 
	 *      2. Default AM (when sub class and super class are not in same package).
	 * 
	 * 3. abstract method (if sub class is not abstract)
	 * 
	 */
	@SuppressWarnings("unused")
	private int students = 1000;

	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println("==================");
		System.out.println(new InheritanceReview().num2);
		System.out.println("==================");
		System.out.println(new Parent().num2);
		System.out.println("==================");
		method2();
		System.out.println("==================");
		new InheritanceReview();
		
	}
}

class class3 extends Parent {
	@SuppressWarnings("unused")
	private int students = 1000;
}

class InheritanceReview extends Parent {
	// sub super

	// sub class can only have one super class. super class can have multiple sub
	// classes
	// final class cannot be extended
	public void methodA() {
		num2 = 300;
	}
}
