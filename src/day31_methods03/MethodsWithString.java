package day31_methods03;

import java.util.Arrays;

public class MethodsWithString {
	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		String resultString = "About 16,600,000 results (0.73 seconds)";
		googleSearchResults(resultString);
	}

	/*
	 * name: countWords return: void parameters/arguments: string sentence
	 * countWords("Java is fun")
	 */
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence: " + Arrays.toString(words));
		System.out.println("Number of words: " + words.length);
		System.out.println("===================");
	}

	public static void googleSearchResults(String text) {
		String[] words = text.split(" ");
		String count = words[1].replace(",", "");
		System.out.println("Results count: " + count);
		// String second = words[3].substring(1);
		String second = words[3].replace("(", "");
		System.out.println("Result in second: " + second);
		System.out.println("===================");
	}

}
