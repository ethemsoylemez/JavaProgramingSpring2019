package day23_arraysAndNumbers;

public class DivisibleBy5And50 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0 && i % 20 != 0) {
				continue;
			} else if (i % 20 == 0) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}
