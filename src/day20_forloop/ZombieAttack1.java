package day20_forloop;

import java.util.Scanner;

public class ZombieAttack1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current inhabitants:");

		int inhabitants = scan.nextInt();
		int day = 0;

		while (inhabitants > 0) {
			System.out.println("Day " + day + " [" + inhabitants + "]");
			inhabitants /= 2;
			day++;
		}
		
		System.out.println("---- EXTINCT ----");
		scan.close();
	}
}
