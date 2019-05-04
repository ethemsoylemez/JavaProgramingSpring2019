package day23_arraysAndNumbers;

import java.util.Scanner;

public class ConcatWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		String words="";
		do {
		System.out.println("Enter a word");
		String word = scan.nextLine();
		i++;
		if (word.equals("java")) {
			continue;
		}
		words += word+", ";
		}while(i<=6);
		//System.out.println("Words: "+words.substring(0,words.length()-2));
		System.out.println("Words: "+words.substring(0,words.lastIndexOf(",")));
		scan.close();
	}

}
