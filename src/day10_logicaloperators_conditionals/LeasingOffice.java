package day10_logicaloperators_conditionals;

import java.util.Scanner;

public class LeasingOffice {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Apartments!");
		System.out.println("Number of bedrooms you are interested:");
		int numberOfBedrooms = keyboard.nextInt();
		int startingPrice = 0;
		// WRITE YOUR CODE HERE

		if (numberOfBedrooms == 1) {
			System.out.println("One Bedroom Selected");
			startingPrice = 1100;
		} else if (numberOfBedrooms == 2) {
			System.out.println("Two Bedroom Selected");
			startingPrice = 1850;
		} else if (numberOfBedrooms == 3) {
			System.out.println("Three Bedroom Selected");
			startingPrice = 2550;
		} else {
			System.out.println("No such Bedrooms available");
		}

		System.out.println("Starting Price: " + startingPrice);
		keyboard.close();

	}
}
