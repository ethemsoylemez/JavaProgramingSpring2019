package day23_arraysAndNumbers;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		do {
			System.out.println("Enter a number: ");
			int number = scan.nextInt();
			i++;
			if (number <= 0) {
				continue;
			}
			sum += number;
		} while (i <= 6);
		System.out.println("Total sum: " + sum);

		scan.close();
	}

}
