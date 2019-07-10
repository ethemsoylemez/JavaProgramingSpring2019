package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		final int[] TEAMS = new int[] { 11, 11 };
		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);

		TEAMS[0] = 10;
		TEAMS[1] = 9;

		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);

		// TEAMS = new int[]{10,10,10}; // does not work
		// TEAMS = Arrays.copyOf(TEAMS, 1); // does not work

		int[] nums = new int[] { 23, 54, 245 };
		System.out.println(Arrays.toString(nums));
		nums = new int[] { 7458, 583, 348, 46328 };
		System.out.println(Arrays.toString(nums));

		final double[] PRICES = new double[3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;

		System.out.println(Arrays.toString(PRICES));
        //PRICES = new double[4];
	}
}
