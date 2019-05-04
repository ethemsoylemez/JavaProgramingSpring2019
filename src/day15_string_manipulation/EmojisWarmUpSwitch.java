package day15_string_manipulation;

import java.util.Scanner;

public class EmojisWarmUpSwitch {
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

		switch (first) {
		case ':':
			switch (second) {
			case ')':
				System.out.println(emoji + " ==> smile");
				break;
			case '(':
				System.out.println(emoji + " ==> sad");
				break;
			case '/':
				System.out.println(emoji + " ==> upset");
				break;
			case 'p':
				System.out.println(emoji + " ==> playful");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		}
		switch (first) {
		case ';':
			switch (second) {
			case ')':
				System.out.println(emoji + " ==> wink");
				break;
			case '0':
				System.out.println(emoji + " ==> surprised");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		}
		switch (first) {
		case '(':
			switch (second) {
			case ':':
				System.out.println(emoji + " ==> smile");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		}
		switch (first) {
		case ')':
			switch (second) {
			case ':':
				System.out.println(emoji + " ==> sad");
				break;
			default:
				System.out.println("Unknown emoji");
			}
		}
		keyboard.close();

	}

}
