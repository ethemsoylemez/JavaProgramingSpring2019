package day41_customclasses02;
import java.util.*;

public class WarmUpWithList {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println("Original list: "+ myList);
		System.out.println("Doubled list:  "+doubleTheList(myList));
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		System.out.println("Original list: "+myList2);
		//to keep the original list same create a new list
		List<Integer> newList =  new ArrayList<>(myList2);
		doubleTheList(newList);
		System.out.println("Doubled list:  "+newList);
		System.out.println("Original list: "+myList2);
	}
	
	public static List<Integer> doubleTheList(List<Integer> nums){
		for(int i = 0; i<nums.size();i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
	}
}
