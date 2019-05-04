package day06_operatos2;

import java.util.Scanner;

public class EnterNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // create scan object
		System.out.println("Enter a number:");

		int number = scan.nextInt();
		System.out.println("You entered " + number);
		scan.close();
	}

}
