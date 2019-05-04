package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the csapital of Canada");
		String capital = scan.next();
		//if (capital == "Ottawa"){ //this line does not work
		if (capital.equals("Ottawa")) {
			//(capital.equalsIgnoreCase("Ottawa")) no needs for upper or lower case
			System.out.println("Your answer is correct");

		} else {
			System.out.println("Your answer is incorrect! " + capital + " is not  capital of Canada");
		}
		scan.close();
	}
}
