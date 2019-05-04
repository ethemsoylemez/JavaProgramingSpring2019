package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int carType;
		boolean isRushHour;
		double price = 0.0;
		System.out.println("Enter Vehicle type (1 or 2):");
		carType = keyboard.nextInt();

		System.out.println("Is it rush hour: yes | no:");
		String answer = keyboard.next();
		if (answer.equalsIgnoreCase("yes")) {
			isRushHour = true;
		} else {
			isRushHour = false;
		}

		// System.out.println(isRushHour);

		if (carType == 1) {
			if (isRushHour) {
				price = 30.0;
			} else {
				price = 5.0;
			}
		} else if (carType == 2) {
			if (isRushHour) {
				price = 55.30;
			} else {
				price = 15.99;
			}
		}

		System.out.println("Total cost: " + price);
		keyboard.close();
	}

}
