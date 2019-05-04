package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {

		// addition (+)
		System.out.println(35 + 32 + 4);

		int chairs = 140;
		System.out.println(chairs + 2);

		int moreChairs = chairs + 5;
		System.out.println(moreChairs);

		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);

		// Subtraction (-)
		System.out.println(35 - 32);
		int result = 44 - 23;
		System.out.println(result);

		double balance = 1200.50;
		System.out.println(balance);
		double transaction = 56.44;
		
		System.out.println(transaction);
		balance = balance-transaction;
		System.out.println(balance);
		
		int linesOfCode = 50;
		System.out.println("Lines of code "+ linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("Lines of code " + linesOfCode);
		
		// Multiplication (*)
		System.out.println(22*2);
		int classes = 5;
		System.out.println(linesOfCode*classes);
		int totalLinesOfCode = linesOfCode*classes;
		System.out.println("totalLineOfCode=" + totalLinesOfCode);
		
		//Division (/)
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		System.out.println(10/0);
		
	
		
		
	}
}
