package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class StaticImports {
	
	public static void main(String[] args) {
		
		//if i didn't import Math class than i have to put Math before each methods
		System.out.println(PI);
		System.out.println(max(15,5));
		System.out.println(min(10,34));
		System.out.println(floor(3.45));
		System.out.println(round(45.50));
		System.out.println(round(45.4999999999));
		System.out.println(abs(10-100));
		System.out.println(pow(10.4,3));
		System.out.println(sqrt(16));
		System.out.println(random()*10);
		
		System.out.println("====================");
		
		//if i didn't import Character class than i have to put Character before each methods
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('J'));
		
		System.out.println("====================");
		
		int [] nums = {34, 23,44,11,4444,12222};
		//if i didn't import Arrays class than i have to put Arrays before sort
		sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("====================");
		
		//if i didn't import LocalDateTime class than i have to put LocalDateTime before method
		System.out.println(now());
		
	}

}
