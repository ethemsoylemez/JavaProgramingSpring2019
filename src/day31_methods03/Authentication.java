package day31_methods03;

public class Authentication {
	public static void main(String[] args) {
		login("mentoring@cybertekschool.com","mentor001");
	}
	/*
	 *Name: login
	 *Return type: void
	 *2 String args/params: username, password
	 *Inside the method:
	 *	validUsername = "mentoring@cybertekschool.com"
	 *  validPassword = "mentor001"
	 *  
	 * if username and password match, print "Login Successful! Welcome to Okta"
	 * if not: "Sign in failed!"
	 */
	public static void login(String userName, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if(userName.equalsIgnoreCase(validUsername)&&password.equalsIgnoreCase(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta");
		}else if(!userName.equalsIgnoreCase(validUsername)&&password.equalsIgnoreCase(validPassword)){
			System.out.println("Sign in failed!, \nInvalid username");
		}else if (!password.equalsIgnoreCase(validPassword)&&userName.equalsIgnoreCase(validUsername)) {
			System.out.println("Sign in failed!, \nInvalid password");
		}else {
			System.out.println("Sign in failed!, \nInvalid username and password");
		}
		
	}

}
