package day64_collections01;

import java.util.*;

public class StackExample {
	
	public static void main(String[] args) {
		
		// LIFO --> Last In First Out
		Stack<Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.push(60);
		numsStack.push(70);
		
		System.out.println(numsStack);
		
		//check value on top (last input) of stack
		System.out.println(numsStack.peek());
		//read value on top of stack then remove it
		System.out.println(numsStack.pop());
		
		System.out.println(numsStack.peek());
		
		System.out.println(numsStack.get(0));
		
	}

}
