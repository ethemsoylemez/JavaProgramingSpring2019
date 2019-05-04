package day19_loops;

public class DoWhile {
	public static void main(String[] args) {
		// print 1 to 10 using do while loop

		int i = 1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
		}
		System.out.println("\n==========");
		int i2 = 1;
		do {
			System.out.print(i2+",");
			i2++;
		} while (i2 <= 0);
		
		int j = 1;
		int sum = 0;
		do {
			sum += j;
			j++;
		}while(j<=5);
		System.out.println("\nSum from 1 to 5 is: "+sum);
				
	}
}
