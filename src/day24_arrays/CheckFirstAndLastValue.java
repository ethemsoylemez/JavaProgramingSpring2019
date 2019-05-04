package day24_arrays;

import java.util.Arrays;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {

		int[] numbers1 = { 12, 41, 213, 21, 42, 12, 49 };
		boolean equals = numbers1[0] == numbers1[numbers1.length - 2];
		System.out.println(equals);
		int [] numbers2 = new int[7];
		//numbers2 = {12, 12, 21, 41, 42, 49, 213};//this does not work, we have to initialize values one by one
		numbers2[0] = 12;
		numbers2[1] = 12;
		numbers2[2] = 21;
		numbers2[3] = 41;
		numbers2[4] = 42;
		numbers2[5] = 49;
		numbers2[6] = 213;
	    Arrays.sort(numbers1);//we don't have to assign value to a new variable
        boolean equals1 = Arrays.equals(numbers1, numbers2);
        System.out.println(equals1);
        int num = numbers2[0];
        System.out.println(num);
		
	}
}
