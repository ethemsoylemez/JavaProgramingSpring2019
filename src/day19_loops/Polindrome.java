package day19_loops;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = keyboard.next();
		String reversed = "";
		// First solution
		int idx = word.length() - 1;
		while (idx >= 0) {
			reversed += word.charAt(idx);
			idx--;
		}
		// System.out.println(reversed);
		if (word.equalsIgnoreCase(reversed)) {
			System.out.println(word + " is polindrome");
		} else {
			System.out.println(word + " is not polindrome");
		}
		// Third Solution
		String newReversed = "";
		int halfLength = word.length() / 2 - 1;
		String secondHalf = "";
		String firstHalf = word.substring(0, halfLength + 1);
		if (word.length() % 2 == 0) {
			secondHalf = word.substring(halfLength + 1);
		} else {
			secondHalf = word.substring(halfLength + 2);
		}
		while (halfLength >= 0) {
			newReversed += secondHalf.charAt(halfLength);
			halfLength--;
		}
		if (firstHalf.equalsIgnoreCase(newReversed)) {
			System.out.println(word + " is polindrome");
		} else {
			System.out.println(word + " is not polindrome");
		}
		keyboard.close();
	}

}
