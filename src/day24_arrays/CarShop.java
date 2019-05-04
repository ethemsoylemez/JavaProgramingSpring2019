package day24_arrays;

public class CarShop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// Print cars start with M
		for (String car : cars) {
			if (car.startsWith("M")) {
				System.out.println(car);
			}
		}
		// Print cars that contain r
		System.out.println("==============");
		for (String car : cars) {
			if (car.toLowerCase().contains("r")) {
				System.out.println(car);
			}
		}
		// Print cars that end with a
		System.out.println("==============");
		for (String car : cars) {
			if (car.endsWith("a")) {
				System.out.println(car);
			}
		}
		// Print cars that have at least 6 letters
		System.out.println("==============");
		for (String car : cars) {
			if (car.length() > 5) {
				System.out.println(car);
			}
		}
		// Swap first and last car
		System.out.println("==============");
		String temp = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = temp;
		for (String car : cars) {
			System.out.println(car);
		}
	}
}
