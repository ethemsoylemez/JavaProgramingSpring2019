package day04_primitives_operators;

public class StringsConcatenation {
	public static void main(String[] args) {

		// Concatenation
		
		String firstName;
		firstName = "Ethem";
		System.out.println("My name is " + firstName);

		String city = "Mus";
		System.out.println("I was born in " + city);
		
		String job= "SDET";
		String company = "Google";
		System.out.println("I work as " + job + " in " + company);
		
		int  zipcode = 22102;
		System.out.println("I live in " + zipcode + " zipcode");
		
		String app = "Slack";
		System.out.println("We use " + app + " for messaging with Classmates");
		
		app = "Skype" + " and Slack";
		System.out.println("We use " + app + " for messaging with Classmates");
		
		
		
	}
}
