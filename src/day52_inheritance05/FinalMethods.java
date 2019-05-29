package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
	}
	
	public final static void staticMethod() {
		System.out.println("Static final method");
	}

}

class Sub extends FinalMethods{
	//can not override since it is a final method.
//	public final void method1() {
//		System.out.println("Overrided method 1");
//	}
	
	//overloading works since they are different method
	public final void method1(String str) {
		System.out.println("Overloading method 1 "+str);
	}
	//same rule for static method, can not override
//	public final static void staticMethod() {
//		System.out.println("Static final method");
//	}
}
