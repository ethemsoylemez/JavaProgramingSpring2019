package day07_scanner_operator;

public class ComparisonOperators {
	public static void main(String[] args) {
		// ==
		System.out.println(5 == 5); //true
		System.out.println(50 == 5); //false
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000); //true
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount); //false
		System.out.println("=========================================");
		
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit);
		
		boolean atlimit = currentSpeed == speedLimit;
		System.out.println("At speed: " + atlimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		System.out.println("Under speed limit: " + underLimit);
		System.out.println("=========================================");
		
		double balance =150.0;
		boolean broke = balance <= 0.0;
		System.out.println("Broke? - " + broke);
		
		double transaction = 155.5;
		broke = (balance - transaction) < 0;
		System.out.println("Will make broke/negative - " + broke);
	}

}
