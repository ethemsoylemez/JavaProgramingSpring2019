package day52_inheritance05;

public class FinalVariables {
	// final instance variable
	// we need to assign value
	// 1 ) right away during declaration
	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL_3_MAX_SPEED;
	public final int MAX_PASSENGER_COUNT;

	// final instance static variable
	//// we need to assign value
	// 1 ) right away during declaration
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;

	public FinalVariables() {
		// 2) within construction
		// we can also pass value via constructor parameter
		MODEL_3_MAX_SPEED = 180;
	}

	static {
		// 2) within STATIC block
		ADMIN_USERNAME = "admin@gmail.com";
	}

	{
		// 3) within INIT block
		MAX_PASSENGER_COUNT = 7;
	}

	public static void main(String[] args) {
		// final local variable
		// we can declare and than assign value
		final int MAX_PASSENGERS_COUNT = 5;
		// MAX_PASSENGERS_COUNT = 10;
		final double PI = 3.14159265358979323846;
		System.out.println("PI "+PI);
		// PI = 4.34;
		System.out.println("Max passenger count: "+MAX_PASSENGERS_COUNT);

		final int SSN;
		SSN = 879657589;
		System.out.println("SSN: "+SSN);
		// SSN++; is not possible
		// static can't access to non-static, we need to create object to access
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Roadster max range: "+finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max range: "+finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Max passenger count"
				+ ""+finalVars.MAX_PASSENGER_COUNT);

		// we can directly access final static variable
		System.out.println("Company name: "+COMPANY_NAME);
		System.out.println("Admin username: "+ADMIN_USERNAME);

	}
}
