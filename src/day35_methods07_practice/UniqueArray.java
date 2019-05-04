package day35_methods07_practice;

import java.util.Arrays;

public class UniqueArray {
	static public void main(String... strings) {
		int[] nums = {10, 4, 4};
		System.out.println(Arrays.toString(nums));
		
		findUnique(nums);
		int[] arr = {2,3,4,0,5,6,7,2,3,4,5,1};
		findUnique(arr);
		int[] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
		
		int[] cheapUnique = getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));
		
	}
	
	public static void findUnique(int[] nums) {
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				System.out.println(temp);
			}	
		}
	}
	//declare empty string
	//find unique numbers and add to that string
	//split that string by space
	//declare new int[] and assign each number from split
	//return the int[] array
	public static int[] getUniqueArrayCheapV2(int[] nums) {
		//declare empty string
		String unique = ""; //0 6 7 1 
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				//find unique numbers and add to unique string
				unique += temp+" ";
			}	
		}
		//split that string by space
		String[] strArr = unique.trim().split(" ");
		//declare new int[] and assign each number from split
		int[] uniqueArr = new int[strArr.length];
		for(int k = 0; k < strArr.length; k++) {
			uniqueArr[k] = Integer.parseInt(strArr[k]);
		}
		//return the int[] array
		return uniqueArr;
	}
	
	
	//find out how many unique numbers
	//declare new array with that size
	//and loop through again and assign unique numbers
	//return the array
	public static int[] getUniqueArray(int[] nums) {
		//find out how many unique numbers
		int uniqueCount = 0;
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				uniqueCount++;
			}	
		}
		//declare new array with that size
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;
		//and loop through again and assign unique numbers
		for(int i = 0; i < nums.length; i++) {//outer loop 
			
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				uniqueArray[idx] = temp;
				idx++;
			}	
		}
		
		//return the array
		return uniqueArray;
		
	}

}
