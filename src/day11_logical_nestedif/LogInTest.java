package day11_logical_nestedif;
import java.util.Scanner;
public class LogInTest {
public static void main(String[] args) {
	String userName, password;
	String validUserName = "cybertek@mail.com", validPassword = "WoodenSpoon123";
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter your user name:");
	userName = keyboard.next();
	
	System.out.println("Enter your password");
	password = keyboard.next();
	
	
	if (userName.equalsIgnoreCase(validUserName)&&password.equals(validPassword)) {
		System.out.println("Login succesful,Welcome!");
	}else if (!userName.equalsIgnoreCase(validUserName)&&!password.equals(validPassword)) {
		System.out.println("Invalid Username and Invalid Password");
	}else if (userName.equalsIgnoreCase(validUserName)&&!password.equals(validPassword)) {
		System.out.println("Invalid Password");
	}else if (!userName.equalsIgnoreCase(validUserName)&&password.equals(validPassword)) {
		System.out.println("Invalid Username");
	}
	keyboard.close();
}
}
