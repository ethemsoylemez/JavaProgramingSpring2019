package day39_arraylist04;

import java.util.ArrayList;

public class CitiesTask {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");

		// For-each loop: print each city
		for (String city : cities) {
			System.out.print(city + " | ");
		}
		System.out.println("\n==================");

		// For loop: print each city
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}
		System.out.println("\n==================");

		// toString: print each city all uppercase
		System.out.println(cities.toString().toUpperCase());

		System.out.println("==================");

		// Make each city all uppercase
		for (int i = 0; i < cities.size(); i++) {
			// cities.set(i, cities.get(i).toUpperCase());
			String city = cities.get(i).toUpperCase();
			cities.set(i, city);

		}
		System.out.println(cities);

		// find the longest and shortest city
		String longestCity = "";
		String shortestCity = "";
		int longest = Integer.MIN_VALUE;
		int shortest = Integer.MAX_VALUE;
		int idxl = 0;
		int idxs = 0;

		// For Loop
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).length() > longest) {
				longest = cities.get(i).length();
				idxl = i;
			}
		}
		longestCity = cities.get(idxl);
		System.out.println("LongestCity: " + longestCity);
		
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).length() < shortest) {
				shortest = cities.get(i).length();
				idxs = i;
			}
		}
		shortestCity = cities.get(idxs);
		System.out.println("ShortestCity: " + shortestCity);

		// for-each loop
		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}
		}
		shortestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;
			}
		}

		System.out.println("longestCity: " + longestCity);
		System.out.println("shortestCity: " + shortestCity);

		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		for (String city : cities) {
			if (city.length() > 6) {
				citiesMoreThan6.add(city);
			}
		}
		System.out.println("CitiesMoreThan6: " + citiesMoreThan6);

	}

}
