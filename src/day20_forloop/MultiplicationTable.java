package day20_forloop;

import java.util.Scanner;

public class MultiplicationTable {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		if (num < 1 || num > 10) {
			System.out.println("ERROR: Invalid number: ");
			return; // stop execution here
			//exit(0) stop execution
		}
		System.out.println("* * * * * * * **");
		System.out.println("*              *");
		for (int i = 1; i <= 10; i++) {
			int multip = i * num;
			System.out.println("*  "+num+" x "+i +" = "+ multip+"  *");
		}
		System.out.println("*             *");
		System.out.println("* * * * * * * *");
		scan.close();
	}
}
