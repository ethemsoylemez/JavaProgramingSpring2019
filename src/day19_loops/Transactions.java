package day19_loops;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {

		double balance = 0, transaction = 0;
		int count = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your current balance: ");
		balance = keyboard.nextDouble();

		while (balance > 0) {
			count++;
			System.out.println("What is transaction #"+count+ " amount?");
			transaction = keyboard.nextDouble();
			if (transaction >= balance) {
				System.out.println("Your balance is obout to be negative due to this transaction");
			}
			balance -= transaction;
			System.out.println("Remaining balance: " + balance);
			
		}
		System.out.println("You have insufficiont funds, current balance: " + balance);
		System.out.println("Transaction total count: " + count);
		keyboard.close();
	}
}
