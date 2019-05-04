package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		if (isBreakTime == true) {
			System.out.println("Break till 8:35 PM");
		} else {
			System.out.println("Not break time yet");
		}
		System.out.println("==============");
		// second version
		// isBreakTime is already true so we do not need to make a comparison
		if (isBreakTime) {
			System.out.println("Break till 8:35 PM");
		} else {
			System.out.println("Not break time yet");
		}
		boolean classTime = true;
		if (classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay attention");
			System.out.println("Code and have fun!");
		} else {
			System.out.println("Take a walk and have some water");
		}

		boolean qualified = false;
		if (qualified == false) {
			System.out.println("Your application was not approved. Thank you");
		}

	}

}
