package day27_arrays05;

import java.util.Arrays;

public class ArraysEquals {
	
	public static void main(String[] args) {
		int [] nums1 = {4, 5, 6, 10, 100, 200};
		int [] nums2 = {4, 5, 6, 10, 100};
		
		System.out.println(Arrays.equals(nums1,nums2));
		
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("Arrays are exactly same");
		}else {
			System.out.println("Mismatched values present");
		}
		
		String [] strArray1 = {"one", "two", "three"};
		String [] strArray2 = {"one", "Two", "three"};
		System.out.println(Arrays.equals(strArray1,strArray2));
		boolean match = Arrays.equals(strArray1, strArray2);
		System.out.println(match);
	}
}
