package day30_methods02;

import java.util.Scanner;

public class WarmUpMethods {
	
	public static void main(String[] args) {
		//print5Stars();//call the methods
		//print it 100 times
		for(int i = 1; i<=100;i++) {
			System.out.print(i+": ");
			print5Stars();
		}
		System.out.println("================");
		introduce();
	}

	public static void print5Stars() {
		System.out.println("* * * * *");
	}
	//method name: introduce()
	//params/args: nothing
	//return type: void
	// it will ask for a name and say Nice to meet you
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Nice to meet you, "+name);
		scan.close();
	}
}
