package day54_InheritanceReviw;

public class Practices {

	public Practices(int a, double d, boolean b) {
		System.out.println("Number is: " + a);
		System.out.println("GPA is: " + d);
		System.out.println("Passed: " + b);

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Practices obj = new Practices(200, 4.0, true);

		child obj2 = new child("", false, '7');
	}
}

class child extends Practices {

	public child(String a, Boolean c, char d) {
		super(100, 3.5, false);
	}
}
