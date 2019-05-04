package day20_forloop;

import java.util.Scanner;

public class PrintEachChar {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println("=====================");
		// vowels (a, e, o, i, u)
		// print vowels
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
				System.out.print(letter + ", ");
		}
		System.out.println("\n=====================");
		// print consonants
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (!(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'))
				System.out.print(letter + ", ");
		}
		scan.close();
	}
}
