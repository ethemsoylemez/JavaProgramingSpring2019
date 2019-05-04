package day16_string_manipulation;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type a text: ");
		String text = keyboard.nextLine();
		System.out.println(text.replace('a', 'y'));
		System.out.println(text.replace("sad", "happy"));
		System.out.println(text.replace(" ", "|"));
		
		keyboard.close();
	}

}
