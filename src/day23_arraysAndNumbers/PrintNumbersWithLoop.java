package day23_arraysAndNumbers;

public class PrintNumbersWithLoop {

	public static void main(String[] args) {
		// just print number from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n===========");
		// outer loop
		for (int k = 1; k <= 3; k++) {
			// inner loop
			for (int j = 1; j <= 5; j++) {
				// inner loop
				for (int i = 1; i <= 10; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			System.out.println("========");
		}
	}

}
