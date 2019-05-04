package day21_loopspractice1;

public class ConverCharToString {

	public static void main(String[] args) {
		char ch = 'a';

		// First way
		String str1 = "" + ch;

		char ch2 = 'v';
		// Second way
		String str2 = new String("" + ch2);

		// Third way
		char ch3 = 'v';
		String str3 = Character.toString(ch3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
