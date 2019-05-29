package day40_customclasses_methods;

import java.util.*;

public class WarmUpList {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		myList.add("Sun");
		
		String targetWord = "Sun";
		int count = countOccurance(myList, targetWord);
		if(count == 3) {
			System.out.println("Unit test PASS: count is 3.");
		}else {
			System.out.println("Unit test FAIL: count is "+count+".");
			System.out.println("Expected: 3");
			System.out.println("Actual: "+count);
		}
	}

	public static int countOccurance(List<String> list, String word) {
		int count = 0;
		for (String str : list) {
			if (str.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
