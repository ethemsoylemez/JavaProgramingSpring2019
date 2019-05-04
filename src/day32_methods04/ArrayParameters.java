package day32_methods04;

public class ArrayParameters {
	public static void main(String[] args) {
		
		int[] myNums = new int[] { 32, 34, 18, 49, 01 };
		printArray(myNums);
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 33, 45, 49, 34, 18 });
		System.out.println("==================");
		int[] one = { 10, 2, 3 };
		int[] two = { 3, 1, 4, 323, 100 };
		
		print2Arrays(one, two);
		System.out.println("\n==================");
		print2ArraysV2(one, two);
	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void print2Arrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			for (int n1 : nums1) {
				System.out.print(n1 + " ");
			}
			System.out.println();
			for (int n2 : nums2) {
				System.out.print(n2 + " ");
			}
		} else {

			for (int n2 : nums2) {
				System.out.print(n2 + " ");
			}
			System.out.println();
			for (int n1 : nums1) {
				System.out.print(n1 + " ");
			}
		}
	}
// execute print2Arrays with the help of printArray method
	public static void print2ArraysV2(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			printArray(nums1);
			printArray(nums2);

		} else {
			printArray(nums2);
			printArray(nums1);
		}
	}
}
