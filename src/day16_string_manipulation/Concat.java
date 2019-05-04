package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {

		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in selenium"));

		System.out.println(word);

		word = word.concat(" Automation");
		System.out.println(word);
		word = word + "-Cucumber";
		System.out.println(word);

		word = word + 123;
		System.out.println(word);
		word = word + true;
		System.out.println(word);
		
		String word2 = "Hi";
		word2 = word2.concat(", how").concat(" are ").concat("you");
		System.out.println(word2);
		
	}
}
