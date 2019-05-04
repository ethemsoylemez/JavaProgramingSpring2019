package day08_casting_conditional;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age: ");
		int yourAge = scan.nextInt();
		int votingAge = 18;
		int eligible = yourAge - votingAge;
		int uneligible = votingAge - yourAge;

		if (yourAge >= votingAge) {
			System.out.println("You are eligible to vote. You have been eligible for " + eligible + " years.");
		} else {
			System.out.println("You are not eligible to vote. You still have " + -eligible + " more years to go.");
			System.out.println("You are not eligible to vote. You still have " + uneligible + " more years to go.");
		}
		scan.close();
	}
}
