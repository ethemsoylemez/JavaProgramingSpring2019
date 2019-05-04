package day18_while_dowhile_loops;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int dollars = 0;
		
		while(dollars != 5) {
			System.out.println("Give me 5 Dollars.");
			dollars = keyboard.nextInt();
		}
		System.out.println("Thank you for 5 dollars");
		
		keyboard.close();
	}

}
