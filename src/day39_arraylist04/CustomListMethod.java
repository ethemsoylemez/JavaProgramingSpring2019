package day39_arraylist04;

import java.util.*;

public class CustomListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		// 1)
		printList(numsList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.80);

		// 2)
		System.out.println("Double sum: " + sumList(doubleList));

		// 3)
		System.out.println("ArrayList: " + getList(10));

		// 4)
		ArrayList<Integer> rList = getRandomList(10);
		Collections.sort(rList);
		System.out.println("Random numbers between 0 and 100: " + rList);

		// call one method inside another
		printList((ArrayList<Integer>) getRandomList(7));

		// 5)
		List<String> strL = new ArrayList<>();
		strL.add("123");
		strL.add("33");
		strL.add("128");
		strL.add("3");
		System.out.println("From String to integer: " + convertToIntList(strL));
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.println("\n===============");
	}

	public static double sumList(List<Double> nums) {
		double sum = 0;
		for (double num : nums) {
			sum += num;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> neWList = new ArrayList<>();
		for (int i = 0; i <= size; i++) {
			neWList.add(i);
		}
		return neWList;
	}

	public static ArrayList<Integer> getRandomList(int size) {
		Random num = new Random();
		ArrayList<Integer> randomNums = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			randomNums.add(num.nextInt(101));
		}
		return randomNums;

//		5) convertToIntList
//		   Return type: List<Integer>
//		   Param: List<String>
//		   It will take each string and convert to Integer and return as Integer list
//		   List<String> strL = new ArrayList<>();
//		   strL.add("56");
//		   strL.add("99");
//		   convertToIntList(strL); => [56, 99] 
	}

	public static ArrayList<Integer> convertToIntList(List<String> strList) {
		ArrayList<Integer> newList = new ArrayList<>();

		// for loop
		for (int i = 0; i < strList.size(); i++) {
			newList.add(Integer.parseInt(strList.get(i)));
		}
		// for each loop
		for (String s : strList) {
			newList.add(Integer.parseInt(s));
		}
		return newList;
	}
}
