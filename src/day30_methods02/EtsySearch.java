package day30_methods02;

public class EtsySearch {
	public static void main(String[] args) {
		navigateToEtsy();
		ForWoodenSpoon();
		printResult();
	}

	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}

	public static void ForWoodenSpoon() {
		System.out.println("Type 'Wooden spoon' into search field");
		System.out.println("Click on the 'search' button");
	}

	public static void printResult() {
		System.out.println("\"Wooden spoon\" 12,400 result");

	}

}
