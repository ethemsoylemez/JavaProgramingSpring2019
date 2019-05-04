package day33_methods5;

public class AgeCalculator {
	public static void main(String[] args) {
		int burthYear = 1994;
		int year = calculateAge(burthYear);
		System.out.println("You are " + year + " years old!");

	}

	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if (age < 0) {
			System.out.println("Invalid age");
			return 0;
		} else if (age >= 0 && age <= 14) {
			System.out.println("Child");
		} else if (age >= 15 && age <= 25) {
			System.out.println("Youngster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
		return age;
	}
}
