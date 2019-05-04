package day38_arraylist03;

import java.util.*;

public class CollectionSorting {
	
	public static void main(String[] args) {
		
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);
		
		System.out.println("Sorting... please wait...");
		Collections.sort(numsList);
		System.out.println(numsList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		strList.add("Anastasia");
		strList.add("Yorslov");
		
		System.out.println(strList);
		
		System.out.println("Sorting... please wait...");
		Collections.sort(strList);
		System.out.println(strList);
		
		//MAX, MIN
		
		int max = Collections.max(numsList);
		int min = Collections.min(numsList);
		
		System.out.println("maxNum: "+max);
		System.out.println("minNum: "+min);
		
		String max1 = Collections.max(strList);
		String min1 = Collections.min(strList);
		
		System.out.println("maxNum: "+max1);
		System.out.println("minNum: "+min1);
		
		Collections.shuffle(strList);
		System.out.println(strList);
		
		
		
	}

}
