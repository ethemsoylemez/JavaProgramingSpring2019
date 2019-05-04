package day34_methods06_varargs;

import java.util.Arrays;

public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		
		//store return value into array
		int [] nums  = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
//		infinite loop
//		for(;;) {
//		System.out.println(Arrays.toString(CountArray.getRandomArray(50)));
//		}
		System.out.println(Arrays.toString(CountArray.getRandomArray(10)));
		
		int [] randomNums = CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}

}
