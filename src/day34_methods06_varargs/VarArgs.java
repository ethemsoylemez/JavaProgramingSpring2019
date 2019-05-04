package day34_methods06_varargs;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		mainWords("red", "blue", "yellow");
		mainWords(); // empty so array will be empty
		String [] myWords = {"cat", "horse", "sheep", "dog"}; 
		mainWords(myWords);
		int[] nums = { 10, 30, 40 }; // we can declare an array and assign arguments than use it inside 										var-args method
		System.out.println(sum(nums));

		System.out.println(sum(10, 30, 40));// directly send arguments

		// We can store data from var-args method
		int sums = (sum(nums));
		System.out.println(sums);

		int budget = 200;
		if (sum(10, 45, 30, 110) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}

		String food = "Burrito Bowl";
		cook(food, "Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa", "Hot sauce");

		// first item will be food name others will be ings

		cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa", "Hot sauce");
		cook("Avocado Toast" , "Avocado", "Sunny Side eggs", "Wheat bread");
		shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");

	}

	public static void mainWords(String... words) {
		for (String word : words) {
			System.out.print(word+" ");
		}
		System.out.println();
	}

	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static void cook(String name, String... ings) {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}

	public static void shoppingList(int totalPrice, String... items) {
		System.out.println("Items: " + Arrays.toString(items));
		System.out.println("Total price: " + totalPrice);
	}
}
