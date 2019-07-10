package day62_exceptions01;

public class TryCatchFinally {

	public static void main(String[] args) {

		String str = "Selenium";

		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));

		} catch (Exception e) {
			System.out.println("Enter correct index");
			// System.exit(0);
			// return;//get out from main method
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("AFTER TRY CATCH FINALLY");
	}
}
