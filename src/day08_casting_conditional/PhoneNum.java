package day08_casting_conditional;

import java.util.Scanner;

public class PhoneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int areaCode, localCode;

		System.out.println("Enter your area code: ");
		areaCode = scan.nextInt();
		System.out.println("Enter your local code: ");
		localCode = scan.nextInt();

		String phoneNumber = "(" + areaCode + ")-" + localCode;

		System.out.println("Calling number: " + phoneNumber);
		scan.close();
	}

}
