package day21_loopspractice1;

import java.util.Scanner;

public class NumbersMoreThan100 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, sum;

		do {
			System.out.println("Enter two numbers:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			sum = num1 + num2;
			System.out.println(sum);
		} while(sum <= 100);
		System.out.println("Good Numbers");
		scan.close();
		
		
	}
}
