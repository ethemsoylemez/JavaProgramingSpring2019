package day08_casting_conditional;

public class ExplicitCasting {
	public static void main(String[] args) {
		System.out.println(10/2.0); //result is double
		System.out.println(10.0/2); //same result
		System.out.println(10.0/2.0);
		
		int result = 10/(int)2.0; // or (int)(10/2.0)
		System.out.println("Result: "+result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1+rent2+rent3+rent4)/4;
		double average1 = (double)(rent1+rent2+rent3+rent4)/4;
		
		System.out.println("Average: " + average+ "\nAverage1: "+average1);
		
		double d = 40.3;
		int i = (byte) d;
		//firstly explicit: double > byte
		//secondly implicit: byte > int
		System.out.println("i "+i);
		
	}
}