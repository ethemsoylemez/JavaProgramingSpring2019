package day11_logical_nestedif;

public class TruthTables {
@SuppressWarnings("unused")
public static void main(String[] args) {
	System.out.println("########TRUTH TABLE FOR && OPERATOR #####");
	System.out.println("When true && true - result is "+(true && true));//true
	System.out.println("When true && false - result is "+(true && false));//false
	System.out.println("When false && true - result is "+(false && true));//false
	System.out.println("When false && false - result is "+(false && false));//false
	System.out.println("================");
	
	System.out.println("########TRUTH TABLE FOR || OPERATOR #####");
	System.out.println("When true || true - result is "+(true || true));//true
	System.out.println("When true || false - result is "+(true || false));//true
	System.out.println("When false || true - result is "+(false || true));//true
	System.out.println("When false || false - result is "+(false || false));//false
	System.out.println("=========================");
	
	System.out.println("########TRUTH TABLE FOR ! (NOT) OPERATOR #####");
	System.out.println("When !true - result is "+(!true));//false
	System.out.println("When !false - result is "+(!false));//true
		
}
}
