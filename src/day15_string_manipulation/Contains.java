package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		String list = "potatoes, apples, tomatoes, eggs, milk, bred, cereal, meat";
		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		} else {
			System.out.println("Lets Add apples now!");
		}
		boolean hasEggs = list.contains("egg");
		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucumbers = list.toLowerCase().contains("cucumber");
		System.out.println("Contains cucumbers: " + hasCucumbers);

		email = "name@gmail.com";
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etysTitle = "wooden spoon | Etys";
		if(etysTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected!");
		}
		System.out.println("===========");
		String myName = "ethem";
//		String ch1 = ""; 
//		String ch2 = "";
//		if (myName.contains("a")) {
//			ch1 = "a";
//		}if (myName.contains("k")) {
//			ch2 = "";
//		}
		
		if (myName.contains("a")) {
			System.out.println(myName +" contains "+ "a");
		} if(myName.contains("k")){
			System.out.println(myName +" contains "+ "k");
			
		}else {
			System.out.println(myName+" does not contain "+"a"+" or "+"k");
		}
	}
}
