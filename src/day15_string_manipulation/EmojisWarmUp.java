package day15_string_manipulation;

import java.util.Scanner;

public class EmojisWarmUp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your emoji: ");
		String emoji = keyboard.next();

		if (emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return; // stop execution
		}

		// if code reaches this point, then emoji is 2 chars
		// get first and second chars and assign to variables
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println(emoji + " ==> smile");

			} else if (second == '(') {
				System.out.println(emoji + " ==> sad");
			} else if (second == '/') {
				System.out.println(emoji + " ==> upset");
			} else if (second == 'p') {
				System.out.println(emoji + " ==> playful");
			} else {
				System.out.println("Unknown emoji");
			}
		} else if (first == ';') {
			if (second == ')') {
				System.out.println(emoji + " ==> wink");
			} else if (second == '0') {
				System.out.println(emoji + " ==> surprised");
			} else {
				System.out.println("Unknown emoji");
			}
		} else if (first == '(') {
			if (second == ':') {
				System.out.println(emoji + " ==> smile");
			} else {
				System.out.println("Unknown emoji");
			}

		} else if (first == ')') {
			if (second == ':') {
				System.out.println(emoji + " ==> sad");
			} else {
				System.out.println("Unknown emoji");
			}

		} else {
			System.out.println("Invalid emoji");
		}

		keyboard.close();
	}
}
