package day46_static_keyword;

public class Vehicle {

	String type; // instance variable, every objects has its own type value
	static int numberOfVehicles; // shared, one central value


	public static void vehicleInfo() {
		// System.out.println("type: "+type); // will not compile, type is non-static
		System.out.println("numberOfVehicles: " + numberOfVehicles);

		int count = getNumberOfVehicles();

		String make = "Kia";
		make = make.toUpperCase();
		// System.out.println(toString()); can not call static method

		Vehicle vh = new Vehicle(); // create object than call
		vh.toString();

	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles; // both static, it works
	}

	public String toString() {
		return "Vehicle type: " + type + " | count: " + numberOfVehicles;// non-static can access static
	}
}
