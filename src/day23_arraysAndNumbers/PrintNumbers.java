package day23_arraysAndNumbers;

public class PrintNumbers {
	public static void main(String[] args) {
		// Numbers from 1 to 20 except from 5 to 10;
		for (int i = 1; i <= 20; i++) {
			if (i >= 5 && i <= 10) {
				continue;
			}
			if (i == 20) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}
