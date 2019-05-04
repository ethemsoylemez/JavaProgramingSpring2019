package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		//System.out.println(word.length());
		//print all characters by characters
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		String word2 = "ava";
		
		if(word2.charAt(0)=='J') {
			System.out.println("First char is "+word2.charAt(0));
		}else {
			System.out.println("First char is not "+word2.charAt(0));
		}
		
		String word3 = "Adana";
		//word3= word3.toLowerCase();
		//Ternary:
		boolean result = (word3.toLowerCase().charAt(0)==word3.toLowerCase().charAt(4))? true:false;
		System.out.println("First and last char are same? "+result);
		
		// always print the last character
		String word4 = "Istanbul";
		System.out.println("Last char is "+word4.charAt(word4.length()/2));
		
	}

}
