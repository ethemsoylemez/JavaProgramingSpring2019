package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		doPush10Ups();
		rangePrint();

	}

//	1) method name: showMe5Numbers
//	   return type: void
//	   parameters: no
//	   prints 5 random numbers between  0 and 1000
//	   in same line separated by comma
//	   Example:
//	   showMe5Numbers(); 345, 234, 566, 2, 23
	public static void showMe5Numbers() {
		Random rand = new Random();
		System.out.println("#####  5 Random numbers from 0 to 1000  #####");
		for (int i = 1; i <= 5; i++) {
			int randomNums = rand.nextInt(1001);
			System.out.print(randomNums + " ");
		}
	}

//	2) method name: doPush10Ups
//	   return type: void
//	   parameters: no
//	   prints 10 times Pushup
	public static void doPush10Ups() {
		System.out.println("\n#####  Pushup 10 times  #####");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

//	 3) method name: rangePrint
//	   return type: void
//	   params/args: no
//	   Using a scanner ask for 2 integers.
//	   you need to print all numbers between those to numbers.
//	   ex:
//	   rangePrint();
//	   5
//	   8
//	   5 6 7 8
//
//	   rangePrint();
//	   10
//	   7
//	   10 9 8 7
//
//	   rangePrint();
//	   40
//	   40
//	   40
	public static void rangePrint() {
		System.out.println("#####  Print out all numbers between two numbers  #####");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		String nums = "";
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				nums += i + " ";
//				System.out.println(nums+" ");
			}
		} else if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				nums += i + " ";
//				System.out.println(nums+" ");
			}
		} else {
			for (int i = 0; i < 3; i++) {
				nums += num1 + " ";
//				System.out.println(nums+" ");
			}

		}
		System.out.println(nums);
		scan.close();
	}
}
