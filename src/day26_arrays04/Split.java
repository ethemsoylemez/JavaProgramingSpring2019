package day26_arrays04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		for (String word : wordsArray) {
			System.out.println(word);
		}

		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println("Position count: " + diceArray[4]);

		String[] diceArray2 = diceResult.split(" of ");
		System.out.println(diceArray2[0]);
		System.out.println(diceArray2[1]);

		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";

		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");

		for (String word : allWords) {
			System.out.println(word);
		}
		for (String hap : happySplit) {
			System.out.print(hap);
		}
		System.out.println();
		for (String I : ISplit) {
			System.out.print(I);
		}
		System.out.println();
		String word = "ja*va";
//		char[] charArray = word.toCharArray();
		String[] charArray = word.split("a*v");
		for (String ch : charArray) {
			System.out.println(ch);
		}
	}
}
