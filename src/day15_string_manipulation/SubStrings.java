package day15_string_manipulation;

public class SubStrings {
	public static void main(String[] args) {
		String sentence = "Java String manipulation is fum!";
		System.out.println(sentence.substring(0,4));//Java
		//print String
		System.out.println(sentence.substring(5,11));//String
		int idx1 = sentence.indexOf(" ");
		int idx2 = sentence.indexOf(" ", 6);
		System.out.println(sentence.substring(idx1+1,idx2));//String
		System.out.println(sentence.substring(7,13));
		
		String str = "a";
		System.out.println(str.substring(1,str.length()-2));
	}

}
