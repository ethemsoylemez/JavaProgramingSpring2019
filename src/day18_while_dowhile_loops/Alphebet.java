package day18_while_dowhile_loops;

public class Alphebet {
	public static void main(String[] args) {
		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}
		System.out.println();
		char capitals = 'A';

		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}

		System.out.println();
		char reverseLetter = 'z';
		while (reverseLetter >= 'a') {
			System.out.print(reverseLetter + " ");
			reverseLetter--;
		}
		System.out.println();
		String letters = "";
		char myLetter = 'A';
		
		while (myLetter<='Z') {
			letters += myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		/*
		 * letters += 'A'; System.out.println(letters);
		 * 
		 * letters += 'B'; System.out.println(letters);
		 * 
		 * letters += 'C'; System.out.println(letters);
		 * 
		 * letters += 'D'; System.out.println(letters);
		 * 
		 * letters += 'E'; System.out.println(letters);
		 */
		
	}

}
