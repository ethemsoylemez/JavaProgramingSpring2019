package day39_arraylist04;

import java.util.*;

public class UniqValues {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);

		System.out.println(nums);

		// 1) find NON Duplicate- unique values. if there 2 A A. --> A
		List<Integer> uniqe1 = new ArrayList<>();
		for (Integer num : nums) {
			if (!uniqe1.contains(num)) {
				uniqe1.add(num);
			}
		}
		System.out.println("Non-duplicate numbers: "+uniqe1);

		// 2) find if appears once
		List<Integer> uniqe2 = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			for (int k = 0; k < nums.size(); k++) {
				if (nums.get(i) == nums.get(k) && i != k) {
					count++;
					break;
				}
			}
			if (count == 0) {
				uniqe2.add(nums.get(i));
			}
		}
		System.out.println("Just once appears numbers: "+uniqe2);

//		Scanner scan = new Scanner(System.in);
//		nums.add(scan.nextInt());
	}

}
