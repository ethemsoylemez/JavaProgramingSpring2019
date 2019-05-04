package day08_casting_conditional;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {

		/*
		 * A, B, C, D if grade is 'A' Excellent Job! Keep it up!
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("PROGRAM START");
		System.out.println("What is your grade?");
		char grade = scan.next().toUpperCase().charAt(0);

		if (grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
		} else {
			System.out.println("Your grade " + grade + " is not good enough.");
			System.out.println("How many points did I miss for 'A'");
			int points = scan.nextInt();
			System.out.println("You could earn " + points + " more points if you want earn 'A'");

		}

		scan.close();
		System.out.println("PROGRAM END");

	}
}
