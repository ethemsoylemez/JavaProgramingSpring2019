package day06_operatos2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, what is your name?");
		
		String name = scan.next(); // accept String input from keyboard and store it in the name variable 
		
		System.out.println("Nice to meet you, "+ name);
		scan.close();
	}

}
