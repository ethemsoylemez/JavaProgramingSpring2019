package day46_static_keyword;

public class CalcTest {


	public static void main(String[] args) {
		
		double result = Calculator.plass(55, 7); // calling a method by class name is also called static way
		System.out.println(result);
		
		result = Calculator.minus(44, 14);
		System.out.println(result);

		Calculator c = new Calculator();
		System.out.println(c.multibly(4, 2));// we should call by Class name
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit(i));
		System.out.println(Character.isDigit('6'));
	}

}
