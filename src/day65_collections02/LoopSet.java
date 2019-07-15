package day65_collections02;

import java.util.*;

public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> numsSet = new HashSet<>();
//		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
//		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
//		
//		System.out.println(numsSet.size()); // result is 1 because Set does not allow duplication. it's unique
		
		numsSet.add(10);numsSet.add(110);numsSet.add(120);numsSet.add(130);numsSet.add(140);
		numsSet.add(150);numsSet.add(160);numsSet.add(170);numsSet.add(180);numsSet.add(190);
		
		System.out.println(numsSet);
		
		for (Integer num : numsSet) {
			System.out.print(num+" | ");
		}
		System.out.println();
		
		//using For Loop will not work
		
		//forEach method with lambda 
		numsSet.forEach(n -> System.out.print(n+" | "));
		
		System.out.println();	
	}
}
