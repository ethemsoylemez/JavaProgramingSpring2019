package day46_static_keyword;

// class with static methods
public class Calculator {
	  static double result;
	
	public static double plass(double num1, double num2) {
		return num1 + num2;	
		//return result;
	}
	public static double minus(double num1, double num2) {
		return num1 - num2;	
	}
	public static double multibly(double num1, double num2) {
		return num1 * num2;	
	}
	public static double divide(double num1, double num2) {
		return num1 / num2;	
	}

}
