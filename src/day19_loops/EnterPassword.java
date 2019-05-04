package day19_loops;

import java.util.Scanner;

public class EnterPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;

		do {
			System.out.println("Enter password");
			input = scan.next();
		} while (!input.equals(password));
		
		scan.close();

	}
}
