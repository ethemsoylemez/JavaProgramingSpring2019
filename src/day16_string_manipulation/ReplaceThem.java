package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fine, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		//replace , with !!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		System.out.println("REMOVE SOMETHING");
		String mixed = "&^@#j$a-v|a@#$";
		//clean up/remove mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
//		mixed = mixed.replace("$", "");
//		mixed = mixed.replace("-", "");
//		mixed = mixed.replace("|", "");
		//chain
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		System.out.println("=================");
		
		String result = "About 115,000,000 result (0.66 seconds)";
		//using string methods (replace, substring) get the number of results
		// 115,000,000
		result = result.replace("About ", "");
		result = result.substring(0,result.indexOf(' '));
		System.out.println("Result: "+result);
		result = result.replace(",", "");
		System.out.println("Result without ,: "+result);
		
	}
}
