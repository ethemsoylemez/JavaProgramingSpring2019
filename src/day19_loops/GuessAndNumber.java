package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessAndNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//guess secret number
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		Random random = new Random();
		//Create a  random number between 1 and 100
		int secretNumber = random.nextInt(101);
		
		int guessNumber;
		do {
			System.out.println("Enter a number: ");
			guessNumber = scan.nextInt();
			if (guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if (guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber != secretNumber);
		System.out.println("Bingo, Congratulation, you won!");
		
		
		scan.close();
	}

}
