package day16_string_manipulation;

public class IsEmpty {
	public static void main(String[] args) {
		String userName = " ";
		String password = " ";
		System.out.println(userName.isEmpty());
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username field is not empty");
		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password field cannot be empty");
		}else {
			System.out.println("Username or password field is not empty");
		}
		
		//using length() method
		if (userName.length()==0 || password.length()==0) {
			System.out.println("Username or password field cannot be empty");
		}else {
			System.out.println("Username or password field is not empty");
		}
		
	}
}
