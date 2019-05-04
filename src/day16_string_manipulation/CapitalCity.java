package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is the capital of Russia";
		//Baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email = "firsName_lastName@gmail.com";
		System.out.println("Email: "+email);
		String company = "deloitte";
		String newEmail = email.replace("gmail", company);
		System.out.println("New email: "+newEmail);
		
	}
	

}
