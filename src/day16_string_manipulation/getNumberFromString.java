package day16_string_manipulation;

public class getNumberFromString {
	public static void main(String[] args) {
		String sentence = "I wrote [10123] lines of code today";
		int first = sentence.indexOf('[');
		int last = sentence.lastIndexOf(']');
		System.out.println("First index: "+first);
		System.out.println("Last index: "+last);
		System.out.println(sentence.substring(first + 1, last));
		
		System.out.println(sentence.substring(sentence.indexOf('[')+1, sentence.lastIndexOf(']')));
		
		// check if codeCount is more than 20
		int count = Integer.parseInt(sentence.substring(first + 1, last));//convert String to integer
		if (count>20) {
			System.out.println("Wrote more than 20 lines of code Today!!");
			
		}else {
			System.out.println("Not enough coding for today");
		}
	}
}
