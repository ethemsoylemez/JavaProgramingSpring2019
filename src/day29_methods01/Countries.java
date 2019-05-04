package day29_methods01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {

		String[][] countriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" }, };
		// String [][] countriesArray = new String[9][2];
		// countriesArray[0][0] = "USA"

		System.out.println("Country: " + countriesArray[0][0] + ", " + "Capital: " + countriesArray[0][1]);
		System.out.println("Country: " + countriesArray[8][0] + ", " + "Capital: " + countriesArray[8][1]);

		System.out.println("====================");
		System.out.println(Arrays.deepToString(countriesArray));
		System.out.println("====================");

		// print all countries with for loop
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");
		}
		System.out.println("\n====================");

		// print all countries with for each loop
		for (String[] count : countriesArray) {
			System.out.print(count[0] + "|");
		}
		System.out.println("\n====================");

		// print all cities with for loop
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][1] + "|");
		}
		System.out.println("\n====================");

		// print all cities with for each loop
		for (String[] count : countriesArray) {
			System.out.print(count[1] + "|");
		}
		System.out.println("\n====================");
		// String[] cities = new String[9] not dynamic
		String[] cities = new String[countriesArray.length];

		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));
		for (int row = 0; row < countriesArray.length; row++) {
			if (countriesArray[row][0].equals("Bolivia")) {
				// System.out.println(countriesArray[row][1]);
				if (countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
			}
		}
	}
}
