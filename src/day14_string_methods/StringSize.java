package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		
		
		// equals methods
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match-ignore case");
		}else {
			System.out.println("Not Match- ignore case");
		}
		
		//convert to all upper or lower case
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		
		// combine the above methods together
		// convert to all lower case than check if it equals to "good morning"
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: not match");
		}
		System.out.println("================");
		//find how many characters include in the string
		String myName = "Ethem";
		System.out.println("My name's length: "+myName.length());
		
		int length = myName.length();
		System.out.println("My name's lenght is "+length);
		
		//user names must be exactly 8 characters
		String userName = "username";
		if (userName.length()==8) {
			System.out.println("Valid user name");
		}else 
			System.out.println("Invalid user name");
		
		//password at least 6 characters
		String passWord = "woodenSpoon";
		// 1)
		if (passWord.length()>=6) {
			System.out.println("Password is good");
		}else {
			System.out.println("Password must be at least 6 characters!");
		}
		
		int passWordLength = passWord.length();
		// 2)
		if (passWordLength<6) {
			System.out.println("Password must be at least 6 characters!");
		}else {
			System.out.println("Password is good");
		}
	}

}
