package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		double num1 = 0.0, num2 = 0.0, result = 0.0;
		String operator;

		// get numbers
		System.out.println("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.println("Enter second number: ");
		num2 = keyboard.nextDouble();

		// get operators
		System.out.println("Select operator: +, -, *, /, %");
		operator = keyboard.next();

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("Invalid operator selected");
			return;
		}
		System.out.println("Result: " + result);
		keyboard.close();
	}

}
