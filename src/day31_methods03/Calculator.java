package day31_methods03;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		double n1 = scan.nextDouble();
		System.out.println("Enter another number");
		double n2 = scan.nextDouble();
		System.out.println(
				"Select operation: \n1) addition \n2) substriction \n3) multiplication \n4) division\n5) remainder");
		int selection = scan.nextInt();
		switch (selection) {
		case 1:
			add(n1, n2);
			break;
		case 2:
			substract(n1, n2);
			break;
		case 3:
			multiply(n1, n2);
			break;
		case 4:
			divide(n1, n2);
			break;
		case 5:
			remainder(n1, n2);
			break;
		default:
			System.out.println("invalid operator");
		}
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void substract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: " + result);
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Cannot divide by zero!");
			return;
		}
		double result = num1 / num2;
		System.out.println("Result: " + result);
	}

	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("Result: " + result);
	}

}
