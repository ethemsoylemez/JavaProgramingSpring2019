package day12_switch_ternary;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String weather;

		System.out.println("Enter weather condition");
		// weather = keyboard.next();
		weather = keyboard.next().toLowerCase(); // converts all values to lower
		switch (weather) {
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tyres");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
		}
		keyboard.close();
	}
}
