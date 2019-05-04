package day24_arrays;

public class SplitSentece {
	public static void main(String[] args) {

		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		int counter=0;
		String[] words = sentence.split(" ");
		for (String word : words) {
			if(word.equals("language")) {
				break;
			}
			System.out.println("position: "+counter);
			System.out.println(words[counter]);
			counter++;
		}
	}
}
