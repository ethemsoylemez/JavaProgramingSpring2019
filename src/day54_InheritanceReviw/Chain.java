package day54_InheritanceReviw;

public class Chain {

	public Chain() {
		// this(8.5); reason: #7
		System.out.println("A");
	}

	public Chain(int a) {
		this();
		System.out.println("B");
	}

	public Chain(double b) {
		this(9);
		System.out.println("C");
	}
}
