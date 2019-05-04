package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//declare arraylist called languages 
		ArrayList <String> languages = new ArrayList<>();
		//add values
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("Pyhton");
		languages.add("Ruby");
		languages.add("");
		languages.add("Kurdish");
		languages.add("English");
		languages.add("Turkish");
		
		System.out.println("Number of languages: "+languages.size());
		System.out.println(languages.get(6));
		languages.add("Arabic");
		System.out.println("Number of languages: "+languages.size());
		System.out.println(languages.toString());
		//remove java
		languages.remove(6);
		System.out.println("Number of languages: "+languages.size());
		System.out.println(languages.toString());
		
		int [] nums = {1,2,3,4,5};
		int [] nums1 = new int[5];
		for(int i = 0; i<5;i++) {
			nums1 = Arrays.copyOf(nums, 7);
			nums1[5] = 6;
			nums1[6] = 7;
		}
		System.out.println(Arrays.toString(nums1));
	}

}
