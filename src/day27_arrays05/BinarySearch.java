package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		// Binarysearch: array must be sorted firstly

		int[] nums = { 4, 6, 7, 10, 55 };
		int idx = Arrays.binarySearch(nums, 5);
		System.out.println(idx);
		
		int [] nums2 = {40, 6, 17, 10, 55};
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		System.out.println("Index of 17: "+Arrays.binarySearch(nums2, 17));
	}
}
