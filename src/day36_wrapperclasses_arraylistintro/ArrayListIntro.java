package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;
public class ArrayListIntro {
	public static void main(String[] args) {
		
		//create array list
		ArrayList <String> names = new ArrayList<>();
		//int [] numsArray = new int[6];
		
		ArrayList <Integer> nums = new ArrayList<>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("maria");
		
		
		nums.add(100);
		nums.add(99);
		nums.add(567);
		nums.add(8566);
	
		
		//read values from arraylist
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		//get the size of arraylist
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
	}

}
