package day28_multid_arrays;

//import java.util.Arrays;

public class ReverseSectence {
	public static void main(String[] args) {
		String sentence = "you are very interesting person";
		String [] words = sentence.split(" ");
		int wordCount = words.length;
		System.out.println(wordCount);
		String reversedSentence= "";
		for(int i = words.length-1; i>=0; i--) {
			reversedSentence += words[i] +" ";
		}
		System.out.println(reversedSentence.trim());
	}

}
