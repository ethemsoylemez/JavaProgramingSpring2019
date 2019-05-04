package day23_arraysAndNumbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		int count=0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
			count++;
			}
		}if (count==1) {
		System.out.println(number + " is prime");
		}else {
			System.out.println(number + " is not prime");
		}
		scan.close();
	}

}
