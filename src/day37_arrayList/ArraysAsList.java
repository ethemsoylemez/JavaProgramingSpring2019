package day37_arrayList;

import java.util.*;

public class ArraysAsList {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<>();
		cars.add("Honda");

		// declare and add values in one line,
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		// if you assign value like above than you can't change this list, set() is fine
		nums.set(0, 7);
		// nums.remove(7);
		// nums.add(100);

		System.out.println(nums.toString());

		List<Double> prices = Arrays.asList(5.4, 8.2, 9.8, 15.28, 20.34, 500.0, 143.23, 124.54, 465.56, 131.5);
		System.out.println(prices);

		// calculate sum

		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum: " + sum);

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum: " + sum2);

		// create new list call expensive
		// add prices that more than 100
		ArrayList<Double> expensive = new ArrayList<>();
		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);
			}
		}
		System.out.println("Expensive: "+expensive);
		//remove all expensive prices from prices list
		//prices.removeAll(expensive); it will not work because of assign value at the beginning
		System.out.println(prices);
	}

}
