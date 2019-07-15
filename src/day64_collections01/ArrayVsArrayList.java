package day64_collections01;

import java.util.*;

public class ArrayVsArrayList {
	public static void main(String[] args) {

		// Arrays are fixed size
		// Allows duplicates
		// Keeps ordering
		// Allows primitives and objects

		int[] numsArray = { 30, 50, 5011, 30, 5, 5 };
		String [] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		//ArrayList
		List<Integer> numsList = new ArrayList<>(); // polimorfic way
		//ArrayList<Integer> numsList = new ArrayList<>(); 
		
		numsList.add(44);
		numsList.add(44);
		numsList.add(101);
		
		System.out.println(numsArray[0]);
		System.out.println(numsList.get(0));
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(numsList);
		
	}

}
