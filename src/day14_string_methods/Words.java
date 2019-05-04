package day14_string_methods;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String word1, word2;
		System.out.println("Enter first word: ");
		word1 = keyboard.next();
		System.out.println("Enter second word: ");
		word2 = keyboard.next();
		
		if(word1.length()>word2.length()) {
			System.out.println(word1 +" is longer");
		}else if (word2.length()>word1.length()) {
			System.out.println(word2+" is longer");
		
		}else {
			System.out.println(word1+" and "+word2+ " are same length");
		}
		keyboard.close();
	}

}
