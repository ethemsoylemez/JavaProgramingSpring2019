package day21_loopspractice1;

import java.util.Scanner;

public class UniqeCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.nextLine();
		String newWord = "";
		char ch = ' ';
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if (!newWord.contains(Character.toString(ch))) {
				newWord += ch;
			}
		}
		System.out.println(newWord);
		scan.close();
//
//		String word2 = "wooden spoon";
//		String newWord2 = "";
//		for (int i = 0; i < word2.length(); i++) {
//			while (i < word2.length()-1 && !(word2.charAt(i) == word2.charAt(i + 1))) {
//				newWord2 += Character.toString(word2.charAt(i));
//				i++;
//			}
//
//		}
//		System.out.println(newWord2);
	}

}
