package day65_collections02;

import java.util.*;

public class LoopWithIterator {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(5740);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(90);
		nums.add(50);
		nums.add(5330);
		nums.add(50666);

		// 1) Create Iterator object
		Iterator<Integer> it = nums.iterator();

		// 2) Call hasNext, next methods
		// hasNext() returns true, if there is still next value
		// returns false when it reaches the end of empty
		System.out.println("it.hasNext() -> " + it.hasNext());
		System.out.println("it.hasNext() -> " + it.next());
		System.out.println("it.hasNext() -> " + it.next());

		// 3) use a while loop
		while (it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();

		// System.out.println(it.next()); NoSuchElementException

		Iterator<Integer> it2 = nums.iterator();

		/*
		 * When using Iterator to loop through a collection, we can remove objects while
		 * looping.
		 */

		while (it2.hasNext()) {
			if (it2.next() > 1000) {
				it2.remove();
			}
		}
		System.out.print(nums.toString());
		System.out.println();

		List<String> cities = new ArrayList<>();

		cities.add("Mus");
		cities.add("Cankiri");
		cities.add("Istanbul");
		cities.add("Gebze");
		cities.add("Berkeley");
		cities.add("McLean");

		Iterator<String> city = cities.iterator();
		while (city.hasNext()) {
			System.out.print(city.next() + " | ");
		}

		// ConcurrentModificationException when removing value using for each loop
		for (String cit : cities) {
			if (cit.equals("Gebze")) {
				cities.remove(cit);
			}
		}
	}
}
