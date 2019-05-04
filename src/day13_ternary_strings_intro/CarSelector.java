package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int carType;
		double averagePrice = 0;
		String carOptions = "", carOrigion = "";

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which type of car you are interested in?");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
		carType = keyboard.nextInt();

		switch (carType) {
		case 1:
			averagePrice = 33000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigion = "American";
			break;
		case 2:
			averagePrice = 32000.0;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigion = "Japanese";
			break;
		case 3:
			averagePrice = 55000.0;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			carOrigion = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigion = "Italian";
			break;
		case 5:
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigion = "Korean";
			break;
		default:
			System.out.println("Car type not available");
			return; 
		}
		System.out.println("You selected \""+carOrigion+ "\" car and your options are "+carOptions+".");
		System.out.println("Average price is "+averagePrice);
		keyboard.close();
	}

}
