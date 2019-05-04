package day34_methods06_varargs;

import java.util.Arrays;
import java.util.Random;

public class CountArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 5, 5, 5, 5, 3, 4, 5, 0, 0, 6, 6, 10 - 4 };
		// 1
		int five = findOccurences(nums, 5);
		System.out.println("5 counts: " + five);
		int six = findOccurences(nums, 6);
		System.out.println("6 counts: " + six);
		// 2
		System.out.println("5 Count: " + findOccurences(nums, 5));
		System.out.println("6 Count: " + findOccurences(nums, 6));

		// 3
		if (five > 0) {
			System.out.println("We have " + findOccurences(nums, 5) + " 5s");
		} else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums, 2) > 0) {
			System.out.println("We have " + findOccurences(nums, 2) + " 2s");
		} else {
			System.out.println("No 2s");
		}

		// create array and pass to method
		int twenty = findOccurences(new int[] { 10, 20, 20, 30, 55, 22 }, 20);
		System.out.println("twenty: " + twenty);

		System.out.println(Arrays.toString(getArray()));
	}

	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for (int num : array) {
			if (num == value) {
				counter++;
			}
		}
		return counter;
	}

	public static int[] getArray() {
		int[] retArray = { 1, 2, 3, 4, 55, 55, 6, 7 };

		return retArray;
	}

	public static int[] getRandomArray(int size) {

		int[] nums = new int[size]; //declare array with size number of elements
		Random ran = new Random();  //create Random Class object
		for (int i = 0; i < size; i++) {

			nums[i] = ran.nextInt(101); //get random number between 0-100 and assign to array
		}
		return nums;
	}
}
