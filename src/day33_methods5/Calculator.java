package day33_methods5;

public class Calculator {
	public static void main(String[] args) {
		addVoid(10, 20);
		System.out.println("==================");
		int result = add(10, 20);
		System.out.println("Sum with return: " + result);
		System.out.println("==================");
		double mult = multiply(23.4, 24.5);
		System.out.println("Multiply: "+mult);
		System.out.println("==================");
		System.out.println("Minus: "+minus(10,20));
		System.out.println(divide(20.5, 0));
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum with void: " + sum);
	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
		//return num1 + num2;
	}

	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	public static double divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("ERROR: cannot / by 0");
			//System.exit(0);
			return 0;
		}else {
			double result = num1/num2;
			return result;
		}
	}
}
