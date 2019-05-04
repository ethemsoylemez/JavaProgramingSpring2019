package day08_casting_conditional;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		// passing percentage is 65
		// your score percentage = take from scanner
		// check if you pass or fail

		Scanner scan = new Scanner(System.in);
		int passingScore = 65;
		System.out.println("Enter your score: ");
		int yourScore = scan.nextInt();

		if (yourScore >= passingScore) {
			System.out.println("Congratulation, you passed. Your score is " + yourScore);

		} else if (yourScore < passingScore) {

			System.out.println("Sorry, you failed. Maybe next time. Your score is " + yourScore);
		}
		scan.close();
		System.out.println("Java is Fun!"); //this line is outside of conditional stat
	}
}
