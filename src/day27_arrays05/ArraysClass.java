package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int [] nums = {43, 12, 4, 1, 3, 5};
		
		//toString method
		String str = Arrays.toString(nums);
		System.out.println(str);
		//System.out.println(Arrays.toString(nums));
		
		//sort method sort array in ascending order
		//When sorting string value order: NUMBERS --> UPPERCASE --> LOWERCASE
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		String[] languages = {"Zulu", "Spanish", "Italian", "1English", "Polish", "arabic","Uzbek"};
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		System.out.println("=====================");
		
		int [] nums2 = {345, 665, 3333, 11, 3, 66};
		System.out.println("Unsorted number: "+Arrays.toString(nums2));
		Arrays.sort(nums2);
		
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		System.out.println("Sorted number: "+Arrays.toString(nums2));
		System.out.println("Lowest number: "+lowest);
		System.out.println("Largest number: "+largest);
	}
}
