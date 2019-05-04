package day23_arraysAndNumbers;

import java.util.Scanner;

public class BruteForce {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String userName = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts== 0) {
			System.out.println("You have exceeded number of attempts");	
			System.out.println("Thhis user has be deactivated for 30 minutes");
			return;
			}
			System.out.println("Enter user name:");
			userName = scan.next();
			if (!userName.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			System.out.println("Enter password");
			password = scan.next();
			if (!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			attempts--;
		}while(!userName.equals(expectedUserName)||!password.equals(expectedPassword));
		System.out.println("Login successful!");
	}
}
