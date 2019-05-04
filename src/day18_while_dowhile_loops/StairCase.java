package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {

		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		 */
		// First way: with length()
		String stairs = "*";
		while (stairs.length() <= 20) {
			System.out.println(stairs);
			stairs += "*";
		}
		// Second way: with a counter
		String stairs1 = "*";
		int counter = 1;
		while (counter <= 20) {
			System.out.println(stairs1);
			stairs1 += "*";
			counter++;
		}
	}
}
